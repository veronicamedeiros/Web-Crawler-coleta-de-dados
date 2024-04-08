package coleta.ObtendoDadosOuArquivos

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import static coleta.Utilities.baixarArquivos.baixarArquivo


static baixarPadraoTISS(String pasta = "saidasConsultas", String subpasta = "Downloads") throws IOException{

    try {
        Document docPaginaInicial = Jsoup.connect("https://www.gov.br/ans/pt-br/assuntos/prestadores/padrao-para-troca-de-informacao-de-saude-suplementar-2013-tiss").get()

        String paginaVersaoAtualPadraoTISS = docPaginaInicial.getElementsByClass("internal-link").get(0).attr("href")

        Document docVersaoAtual = Jsoup.connect(paginaVersaoAtualPadraoTISS).get()

        String urlArquivosPadraoTISS = docVersaoAtual.getElementsByClass("btn btn-primary btn-sm center-block internal-link").get(3).attr("href")

        baixarArquivo(urlArquivosPadraoTISS, 'Arquivos_Padrao_TISS.zip', pasta, subpasta)

        return true
    }
    catch (Exception e){
        println("Erro: $e")
        return false
    }
}
