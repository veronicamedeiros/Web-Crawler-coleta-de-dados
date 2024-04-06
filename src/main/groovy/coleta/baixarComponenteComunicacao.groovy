package coleta

import coleta.Entities.ConectaAoLinkAtual
import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element

import static coleta.baixarArquivo.baixar

static baixarComunicacao() throws IOException{

    try {

        Document linkAtual = ConectaAoLinkAtual.conectaLinkAtual()

        //Element tabela = doc.select("table").get(0)  // apenas para consulta

        String linkComponenteDeComunicacao = linkAtual.getElementsByClass("btn btn-primary btn-sm center-block internal-link").get(3).attr("href")

        baixar(linkComponenteDeComunicacao, 'Arquivos_Padrao_TISS.zip')
    }

    catch (Exception e){
        println("Erro: $e")
    }
}
