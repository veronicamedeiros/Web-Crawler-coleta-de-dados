package coleta

import coleta.Entities.historicoPorMes
import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import org.jsoup.select.Elements


static protected pegarHistorico() throws IOException{
    
    try {

        Document documento = Jsoup.connect("https://www.gov.br/ans/pt-br/assuntos/prestadores/padrao-para-troca-de-informacao-de-saude-suplementar-2013-tiss/padrao-tiss-historico-das-versoes-dos-componentes-do-padrao-tiss").get()

        List<historicoPorMes> historico = []


        Element tabela = documento.select("table").get(0)

        tabela.getElementsByTag("tr").first().remove() //remove o primeiro tr com o "cabeçalho"

        Elements elementosTr = tabela.getElementsByTag("tr")

        elementosTr.forEach {

            String competencia = it.getElementsByTag("td").get(0).text()

            List<String> ano = competencia.split("/")
            Integer anoCompetencia = ano[1] as Integer

            if(anoCompetencia >= 2016){
                String inicioVigencia = it.getElementsByTag("td").get(2).text()
                String publicacao = it.getElementsByTag("td").get(1).text()
                historico.add(new historicoPorMes(competencia, publicacao, inicioVigencia))
            }
        }

        historico.forEach {
            println(it.competencia + " " + it.publicacao + " " + it.inicioVigencia)
        }
    }
    catch (e){
        println("Erro: $e")
    }
}

