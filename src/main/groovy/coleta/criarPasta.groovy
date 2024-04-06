package coleta

static protected criar(){

    try {
        if( new File("saidasConsultas").exists()){
            println('Verdadeiro')
            boolean g = new File("saidasConsultas/", "Downloads").mkdir()

        }else{
            println('Falso')
            boolean x = new File("./", "saidasConsultas").mkdir()
        }
    }catch (Exception e){

        println("Erro: $e")
    }
}
