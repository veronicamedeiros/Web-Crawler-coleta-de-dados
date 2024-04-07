package coleta.Utilities

static protected criar(){

    try {
        if( !(new File("saidasConsultas/", "Downloads").exists())){

            boolean saidasConsultas = new File("saidasConsultas").mkdir()
            boolean g = new File("saidasConsultas/", "Downloads").mkdir()
        }
    }
    catch (Exception e){
        println("Não foi possível criar as pastas para armazenamento do arquivo. \nErro: $e")
    }
}
