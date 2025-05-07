## **Criando um exemplo de uma classse para representar uma SmartTV onde:**

1. Ela tenha as características: ligada (boolean), canal(int) e volume(int)
2. Nossa TV poderá ligar e desligar e assim mudar o estado ligada
3. Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1
4. Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número correspondente

-----------------------
## **Escopo de Código**

* Escopo de Classe
* Escopo de método
* Escopo de fluxo

Pode ser definido como um ambiente onde uma variável pode ser acessada. Em java, o escopo de variáveis vai de acordo com o bloco onde ela foi declarada.

A variável é criada no primeiro acesso a ela, se tornando inacessível após o interpretador sair do bloco de execução ao qual ela pertence. Portanto, esta variável não pode ser lida ou manipulada por rotinas e códigos que estão fora do seu bloco de declaração, ou seja, fora do escopo da variável.

Em uma Classe, podemos vizualizar a diferença de escopo. Os atributos(variaveis) são declarados no corpo principal da classe, sendo portanto acessíveis por todo os métodos.

Caso você declare uma variável DENTRO DE UM MÉTODO. 

## **Palavras Reservadas**

Apresentar as 52 palavras reservadas organizadas por qualificação de usabilidade considerando as regras da linguagem.

### Assunto

-> Tipos Primitivos
-> Classificações
-> Escopo de uso
-> Palavras "opostas"


## **Hierarquia das exceções**

A linguagem Java dispões de uma variedade de classes que representam exceções, e estas classes são organizadas em uma hierarquia denominadas **Checkd and Unckecked Exceptions** ou Exceções Checadas e Não Checadas.


### Exceções customizadas

Nós podemos criar nossas própias exceções baseadas em regras de negócio e assim melhor direcionar quem for utilizar os recursos desenvolvidos no projeto, exemplo:

* Imagina que como regra de negócio, para formatar um cep necessita sempre ter 8 dígitos, caso o contrário lançará uma exceção que denominados de CepInvalidoException.
* Primeiro criamos nossa exceção:
```java
public class CepInvalidoException extends Exception {}

```
* Em seguida Criamos nosso método de formatação de cep.

```java
static String formartarCep(String cep) throws CepInvalidoException {
    if(cep.length() != 8){
        throw new CepInvalidoException();

        //Simulando um cep formatado
    }
    return "23.765-064";
}
```


# **Debugging Java**

Erros de programação são denominados bugs e o processo de encontrar e corrigir bugs é chamado de depuração ou debugging

De forma geral, a depuração é uma tarefa difícil e trabalhosa, e a difículdade varia de acordo com o ambiente de desenvolvimento, o que inclui a linguagem de programação e as ferramentas disponíveis, como depuradores.

Existem duas grandes categorias que englobam a natureza do erro: 

 * ### Erros de Sintaxe
 É um erro nas regras estabelecidas da linguagem:
  i. Parênteses, chaves, colchetes que abram e nao fecham.
  ii. Duas instruções sem um ponto-e-vírgula entre elas;
  iii. Uma palavra-chave sendo usada numa posição inesperada.
 
 * ### Erros de Semântica:
 É um erro na "lógica do código", em sua semântica, o código está sintaticamente correto, porém não faz o que se esperava dele.
  i. Tentar dividir um número por uma String ou por zero.
  ii. Atribuir um valor icoerente a um tipo de dado. Por exemplo: int n = "Eliseu"
  iii. Tentar fechar um arquivo que não foi aberto.

## Depuração/Debugging

Linguagens de alto nível tornam a depuração mais fácil, pois fornecem mais ferramentas para indentificar erros, como o tratamento de exceções.

Os depuradores funcionam assumindo o controle do tempo de execução de um programa e permitindo que você o observe e controle. Para fazer isso, ele mostra a pilha do programa e permite que você a atravesse em qualquer direção. Quando você está em um depurador, obtém uma imagem mais completa de um quadro de pilha do que quando olha os rastreamentos de pilha em uma mensagem de log.

# **Pilha de Execução de um Programa Java/Stack Trace**

## **Pilha de Execução:**

Toda invocação de método é empilhada em uma estrutura de dados que isola a área de memória de cada um. Quando um método termina (retorna), ele volta para o método que o invocou.

## **Stack Trace:** ##
É a matriz onde encontramos a pilha de execução da exceção. Em outras palavras, podemos dizer que o rastreamento da pilha busca(rastreio) para a próxima linha onde a exceção pode surgir.

# **Java Orientado a Objetos** ##

**Fundamentos da Programação Orientada a Objetos**

## Conceito de POO ##

**Programação Estruturada**
A programação estruturada é um paradigma de programação que visa melhorar a clareza, a qualidade e o tempo de desenvolvimento de programa de computador, fazendo uso extensivo das construções de fluxo de controle estruturado de seleção (if/then/else) e repetição (while e for), estrutura de blocos e sub-rotinas.

**Programação Orientada a Objetos**

POO é um paradigma de programação baseado no conceito de "objetos", que podem conter dados na forma de campos, também conhecidos como atributos, e códigos, na forma de procedimentos, também conhecidos como métodos.

>Enquanto a programação estruturada é voltada a procedimentos e funções definidas pelo usuário, a programação orientada a objetos é voltada a conceitos como o de classes e objetos.

## Classes
Toda estrutura de código na linguagem Java é distribuido em arquivos com extensão .java denominados de classe.

As classes existentes em nosso projeto serão composta por:

**Identificador**, **Características** e **Comportamentos**.

* **Classes** (class): A estrutura e ou representação que direciona a criação dos objetos de mesmo tipo
* **Identificador** (identity): Propósito existencial aos objetos que serão criado
* **Caaracterísticas** (states): Também conhecido como **atributos** ou **propiedades**, é toda informação que representa o estado do objeto.
* **Comportamentos** (behavior): Também conhecido como **ações** ou **métodos**, é toda parte comportamental que um objeto dispões.
* **Intanciar** (new): É o ato de criar um novo objeto a partir de estrutura definida em uma classe.

Para ilustrar as etapas de desenvolvimento orientada a objetos em Java, iremos reproduzir a imagem acima em forma de código para explicar que primeiro criamos a estrutura correspondente para assim podermos cria-los com as caracteristicas e possibilidades de realizações de ações(comportamentos) como se fosse no mundo "real".

```java
public class Student {
    String name;
    int age;
    Color color;
    Sex sex;

    void eating(Food food){
    }

    void drinking(Eat eat){
    }

    void running(){      
    }
}

```

```java
//Criando objetos a partir da classe Student

public class School {
    public static void main(String[] args) throws Exception{
        Student student1 = new Student();
        sdutent1.name = "Eliseu";
        sdutent1.age = 25;
        sdutent1.color = Color.FAIR;
        sdutent1.sex = Sex.MALE;

        Student student2 = new Student();
        student2.name = "Sophia";
        student2.age = 30;
        student2.color = Color.FAIR;
        student2.sex = Sex.FEMALE;

        Student student3 = new Student();
        student3.name = "Lily";
        student3.age = 28;
        student3.color = Color.DARK;
        student3.sex = Sex.FEMALE;
    }
}
```


> [!CAUTION]
> No Exemplo acima, **NÃO** estruturamos a classe Student com o padrão JavaBeans **getters** e **setters**.

Seguindo algumas convenções, as nossas classes são classificadas como:

* **Classe de Modelo (model)**: classes que representam estrutura de domínio da aplicação, exemplo: Cliente, Pedido, Nota Fical e etc.
* **Classe de Serviço (service)**: classes que contém regras de negócio e validação de nosso sistema.
* **Classe de Repositório (repository)**: classes que contém uma integração com o banco de dados.
* **Classe de Controle (controller)**: classes que possuem a finalidade de disponibilizar alguma comunicação externa à nossa aplicação, tipo http web ou webservices
* **Classe Utilitária (util)**: classe que contém recursos comuns à toda nossa aplicação.

## Pacotes

A linguagem Java é composta por milhares de classes com as finalidades de, por exemplo: Classes de tipos de dados, representação de texto, números, datas, arquivos e diretórios, conexão com banco de dados, entre outras. Imagina todas estas classes existirem em um único nível de documentos? E as classes desenvolvidas por nós, mero desenvolvedores de aplicações de vários os gêneros ? Imagina como ficaria esse diretório em?

Para evitar isso a linguagem dispões de um recurso que organiza as classes padrão e criada por nós.

### Nomenclaturas

Vamos imaginar que sua empresa se chama **Power Soft** e ela está desenvolvendo softwares comercian, governamental e um software livre ou de código aberto. Abaixo teríamos os pacotes sugeridos conforme tabela abaixo.

* **Comercial**: com.powersoft
* **Governamental**: gov.powersoft
* **Código Aberto**: org.powersoft

Acima já podemos perceber que existe uma definição para o uso do nome dos pacotes, porém podemos organizar ainda mais um pouco as nossas classes mediante a proposta de sua existência