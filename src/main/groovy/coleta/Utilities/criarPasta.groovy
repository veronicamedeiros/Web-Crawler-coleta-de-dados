package coleta.Utilities

static public criar(String pasta = "saidasConsultas", String subpasta = "Downloads"){

    try {

        if( !(new File("$pasta/", "subpasta").exists())) {

            boolean saidasConsultas = new File("$pasta").mkdir()
            boolean download = new File("$pasta/", subpasta).mkdir()
        }

        return "./$pasta/$subpasta/"
    }
    catch (Exception e){

        println("Não foi possível criar as pastas para armazenamento do arquivo. \nErro: $e")

        return false
    }
}
