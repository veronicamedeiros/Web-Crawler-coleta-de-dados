package coleta.Entities

class HistoricoMes {

    String competencia
    String publicacao
    String inicioVigencia


    HistoricoMes(String competencia, String publicacao, String inicioVigencia){

        setCompetencia(competencia)
        setPublicacao(publicacao)
        setInicioVigencia(inicioVigencia)
    }


    String getCompetencia() {
        return competencia
    }

    void setCompetencia(String competencia) {
        this.competencia = competencia
    }

    String getPublicacao() {
        return publicacao
    }

    void setPublicacao(String publicacao) {
        this.publicacao = publicacao
    }

    String getInicioVigencia() {
        return inicioVigencia
    }

    void setInicioVigencia(String inicioVigencia) {
        this.inicioVigencia = inicioVigencia
    }
}
