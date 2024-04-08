package coleta.ObtendoDadosOuArquivos

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import static coleta.Utilities.baixarArquivos.baixarArquivo


static baixarTabelaErros(String pasta = "saidasConsultas", String subpasta = "Downloads") throws IOException{

    try {

        Document docPaginaTabelasRelacionadas = Jsoup.connect("https://www.gov.br/ans/pt-br/assuntos/prestadores/padrao-para-troca-de-informacao-de-saude-suplementar-2013-tiss/padrao-tiss-tabelas-relacionadas").get()

        String url = docPaginaTabelasRelacionadas.getElementsByClass("internal-link").get(0).attr("href")

        baixarArquivo(url,'Tabela de erros no envio para a ANS.xlsx', pasta, subpasta)

        return true
    }
    catch (Exception e){
        println("Erro: $e")

        return false
    }
}
