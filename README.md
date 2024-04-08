# Coleta de dados refente ao Padrão TISS

por: Verônica Medeiros


_O presente código visa coletar dados referentes a informações do Padrão TISS (Troca de Informação de Saúde Suplementar) no site do governo._

_A aplicação utiliza linguagem Groovy e emprega o Gerenciador de Dependências e Build Gradle._
_Para a coleta das informações, utilizaram-se as bibliotecas Jsoup e HttpBuilder ._


### Funcionalidades do código em Groovy:

 - Baixar os aquivos da documentação do padrão TISS (Troca de Informações na Saúde Suplementar), na versão mais recente;
   
 - Coletar, na tabela de Histórico das versões dos Componentes do Padrão TISS, os dados de competência, publicação e início de vigência a partir da competência de janeiro de 2016 e salvar em um arquivo no formato csv;
   
 - Baixar a "Tabela de erros no envio para a ANS".
 
 
 As saídas (arquivos baixados e arquivo csv) podem ser encontradas na pasta Downloads (saidasConsultas/Downloads) - essas pastas são criadas automaticamente caso ainda não existam.
    

### Para acessar a aplicação, é necessário:

 - Clonar o repositório atual com o comando abaixo:
 ```
 git clone https://github.com/veronicamedeiros/Web-Crawler-coleta-de-dados
 ```
 - Possuir o Gradle instalado e, na pasta principal do arquivo clonado, dar o seguinte:
 ```
 build.gradle
 ```
 - Para executar a aplicação, utilize uma IDE e rode com o Gradle ou dê o comando abaixo:
 ```
 ./gradlew run
 ```
