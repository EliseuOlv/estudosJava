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

## **Stack Trace:**

É a matriz onde encontramos a pilha de execução da exceção. Em outras palavras, podemos dizer que o rastreamento da pilha busca(rastreio) para a próxima linha onde a exceção pode surgir.

