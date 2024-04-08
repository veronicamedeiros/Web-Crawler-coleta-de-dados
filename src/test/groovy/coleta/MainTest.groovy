package coleta

import coleta.Entities.HistoricoMes
import org.junit.jupiter.api.Test
import static org.junit.Assert.assertEquals
import static coleta.ObtendoDadosOuArquivos.pegarHistoricoVersoesPadraoTISS.pegarHistoricoVersoes
import static coleta.Utilities.criarPasta.criar
import static coleta.Utilities.baixarArquivos.baixarArquivo
import static coleta.ObtendoDadosOuArquivos.baixarArquivosPadraoTISS.baixarPadraoTISS
import static coleta.ObtendoDadosOuArquivos.baixarTabelaErrosEnvioANS.baixarTabelaErros


class MainTest {

    MainTest(){}


    @Test
    void criarPastaTest() {

        // When:

        String criarPastaTest = criar("saidasConsultasTeste", "DownloadTest")

        //Than

        assertEquals("./saidasConsultasTeste/DownloadTest/", criarPastaTest)
    }


    @Test
    void baixarArquivoTeste() {

        // Given:
        String url = "https://www.gov.br/ans/pt-br/arquivos/assuntos/prestadores/padrao-para-troca-de-informacao-de-saude-suplementar-tiss/padrao-tiss-tabelas-relacionadas/Tabelaerrosenvioparaanspadraotiss__1_.xlsx"

        // When:

        boolean baixarArquivoTeste = baixarArquivo(url, "ArquivoGeradoTeste.xlsx","saidasConsultasTeste", "DownloadTest" )

        //Than

        assertEquals(true, baixarArquivoTeste)
    }


    @Test
    void baixarArquivosPadraoTISStest() {

        // When:

        boolean baixarPadraoTISSteste = baixarPadraoTISS("saidasConsultasTeste", "DownloadTest")

        //Than:

        assertEquals(true, baixarPadraoTISSteste)
    }


    @Test
    void baixarTabelaErrosEnvioANStest() {
        
        //When:

        boolean baixarTabelaErrosTest = baixarTabelaErros("saidasConsultasTeste", "DownloadTest")
        
        //Than
        
        assertEquals(true, baixarTabelaErrosTest)
    }


    @Test
    void HistoricoMesTest() {

        //When

        boolean historicoMes = new HistoricoMes("mar/2024", "27/03/2024", "01/04/2024")

        //Than

        assertEquals(true, historicoMes)

    }


    @Test
    void pegarHistoricoVersoesPadraoTISStest() {

        //When

        boolean pegarHistoricoVersoesTest = pegarHistoricoVersoes("saidasConsultasTeste", "DownloadTest")

        //Than

        assertEquals(true, pegarHistoricoVersoesTest)
    }
}

