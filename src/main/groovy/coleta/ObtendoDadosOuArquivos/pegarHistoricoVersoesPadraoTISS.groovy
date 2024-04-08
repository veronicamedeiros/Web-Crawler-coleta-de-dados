package coleta.ObtendoDadosOuArquivos

import coleta.Entities.HistoricoMes
import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import org.jsoup.select.Elements
import coleta.Utilities.criarPasta


static public pegarHistoricoVersoes() throws IOException{

    try {

        Document docPaginaHistorico = Jsoup.connect("https://www.gov.br/ans/pt-br/assuntos/prestadores/padrao-para-troca-de-informacao-de-saude-suplementar-2013-tiss/padrao-tiss-historico-das-versoes-dos-componentes-do-padrao-tiss").get()
        Element tabela = docPaginaHistorico.select("table").get(0)
        tabela.getElementsByTag("tr").first().remove() //remove o primeiro tr com o "cabeçalho"
        Elements elementosTr = tabela.getElementsByTag("tr")

        List<HistoricoMes> historico = []


        elementosTr.forEach {

            String competencia = it.getElementsByTag("td").get(0).text()

            List<String> ano = competencia.split("/")
            Integer anoCompetencia = ano[1] as Integer

            if(anoCompetencia >= 2016){

                String publicacao = it.getElementsByTag("td").get(1).text()
                String inicioVigencia = it.getElementsByTag("td").get(2).text()

                historico.add(new HistoricoMes(competencia, publicacao, inicioVigencia))
            }
        }


        criarPasta.criar()

        def arquivoHistorico = new FileWriter("saidasConsultas/Downloads/HistóricoPadrão-TISS.csv")
        arquivoHistorico.write("competência" + "," + "publicação" + "," + "início de vigência"+ ";\n")

        historico.forEach {

            arquivoHistorico.write(it.competencia + "," + it.publicacao + "," + it.inicioVigencia + ";\n")
        }

        arquivoHistorico.close()

        println "Arquivo CSV criado com sucesso."

        return true
    }
    catch (e){

        println("Erro: $e")

        return false
    }
}

