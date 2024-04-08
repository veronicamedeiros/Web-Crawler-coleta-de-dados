package coleta.Utilities

import coleta.Utilities.criarPasta
import groovyx.net.http.HttpBuilder
import groovyx.net.http.optional.Download
import static groovyx.net.http.HttpBuilder.configure

static baixarArquivo(String url, String arquivo, String pasta = "saidasConsultas", String subpasta = "Downloads"){


    try {
        String diretorioDestino = criarPasta.criar(pasta, subpasta)

        File arquivoDestino = new File(diretorioDestino, arquivo)


        HttpBuilder http = configure {
            request.uri = 'http://localhost:9876/'
        }

        Object file = configure {
            request.uri = url
        }.get {
            Download.toFile(delegate, arquivoDestino)
        }

        return true
    }
    catch (Exception e){
        println("Erro: $e")

        return false
    }
}

