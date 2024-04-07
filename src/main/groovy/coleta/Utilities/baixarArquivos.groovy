package coleta.Utilities

import coleta.Utilities.criarPasta
import groovyx.net.http.HttpBuilder
import groovyx.net.http.optional.Download
import static groovyx.net.http.HttpBuilder.configure

static baixarArquivo(url, arquivo){

    criarPasta.criar()

    try {
        File diretorioDestino = new File("./saidasConsultas/Downloads/")

        File arquivoDestino = new File(diretorioDestino, arquivo)


        HttpBuilder http = configure {
            request.uri = 'http://localhost:9876/'
        }

        Object file = configure {
            request.uri = url
        }.get {
            Download.toFile(delegate, arquivoDestino)
        }
    }
    catch (Exception e){
        println("Erro: $e")
    }
}

