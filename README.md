# MusicMatch

## Sobre o Projeto
O MusicMatch é um aplicativo desenvolvido para gerenciar e interagir com uma coleção de áudios, incluindo músicas e podcasts. O sistema permite aos usuários reproduzir áudios, curtir suas faixas e episódios favoritos, e manter uma lista de favoritos com base nas classificações dos áudios.

## Conceitos de Orientação a Objetos Utilizados
- **Encapsulamento**: Cada classe possui atributos privados e métodos públicos para acessar e modificar esses atributos, garantindo que o estado interno do objeto seja protegido de acesso externo direto.
- **Herança**: A classe `Audio` serve como uma superclasse para as classes `Musica` e `Podcast`, permitindo que elas herdem atributos e métodos comuns.
- **Polimorfismo**: O método `getClassificacao` é sobrescrito nas classes `Musica` e `Podcast` para fornecer uma implementação específica de classificação baseada em curtidas.
- **Abstração**: As classes representam entidades abstratas do mundo real, como `Musica`, `Podcast` e `Favoritas`, com operações como `reproduzirAudio` e `curtirAudio`.

## Linguagem de Programação
O projeto foi desenvolvido em **Java**, que é amplamente utilizada para construir aplicações robustas e seguras.

## Funcionamento do Sistema
O aplicativo inicia pela classe `Principal`, que cria instâncias de `Musica` e `Podcast`, executa operações de reprodução e curtida, e adiciona áudios à lista de favoritos. A classificação dos áudios é atualizada com base no número de curtidas, e a lista de favoritos destaca os áudios com as melhores classificações.

## Como Rodar o Projeto na Sua Máquina
Para executar o MusicMatch em sua máquina, siga os passos abaixo:

1. Certifique-se de ter o **Java JDK** instalado em sua máquina.
2. Clone o repositório do projeto para o seu computador local.
3. Navegue até o diretório do projeto via terminal ou prompt de comando.
4. Compile o código-fonte com o comando `javac br/com/devleofulco/musicmatch/principal/Principal.java`.
5. Execute a aplicação com o comando `java br.com.devleofulco.musicmatch.principal.Principal`.

Aproveite o MusicMatch para gerenciar sua coleção de áudios favoritos!
