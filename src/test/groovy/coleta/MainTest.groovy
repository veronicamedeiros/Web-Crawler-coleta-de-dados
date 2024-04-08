package coleta;

import org.junit.Test
import static org.junit.Assert.assertEquals
import static coleta.ObtendoDadosOuArquivos.baixarArquivosPadraoTISS.baixarPadraoTISS
import static coleta.ObtendoDadosOuArquivos.pegarHistoricoVersoesPadraoTISS.pegarHistoricoVersoes
import static coleta.ObtendoDadosOuArquivos.baixarTabelaErrosEnvioANS.baixarTabelaErros

import coleta.ObtendoDadosOuArquivos.baixarArquivosPadraoTISS;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;


import java.io.IOException;

class MainTest {

    MainTest() throws IOException {




    }

    @BeforeEach
    void setUp() {

        try {
            Object baixarPadraoTISStest = baixarArquivosPadraoTISS.baixarPadraoTISS()
            print(baixarPadraoTISStest)
        }
        catch (Exception e){
            e.getMessage();
        }
    }

    @AfterEach
    void tearDown() {
    }
}