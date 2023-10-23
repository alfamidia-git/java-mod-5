# Trabalhando com Generics em JAVA
Generics, introduzidos no Java 5, oferecem uma maneira de criar classes, interfaces e métodos que operam em um tipo especificado de maneira segura. Eles são uma das características mais poderosas do Java, pois proporcionam a reutilização de código com segurança de tipo.

Ao usar Generics, você pode definir uma classe, interface ou método que pode trabalhar em "qualquer tipo", sem realmente especificar qual é esse tipo até que o objeto ou método seja usado.


## Por que usar Generics?
1. **Segurança de tipo:** Generics adicionam estabilidade ao código, evitando que o programador insira o objeto errado em uma coleção.
2. **Reutilização de Código:** Uma única classe genérica pode ser usada para criar múltiplas instâncias de tipos diferentes.
3. **Desempenho**: Generics eliminam a necessidade de casting.

## Exemplos de Generics:
Ao trabalhar com Java, você inevitavelmente se encontrará usando as coleções da biblioteca padrão. Duas das interfaces mais populares desta biblioteca são List e Set. Estas interfaces, e muitas outras no Java, foram grandemente beneficiadas pela introdução de Generics. Vamos explorar um pouco mais sobre elas.

### Interface List
A interface List representa uma coleção ordenada de elementos. Antes da introdução dos Generics, a interface List era comumente usada assim:

```java

public class Main{
    public static void main(String[] args){
        List minhaLista = new ArrayList();
        minhaLista.add("um");
        minhaLista.add(new Integer(2));
        minhaLista.add("três");
    }
}
```

#### Problemas sem Generics:
1. **Falta de segurança de tipo:** Generics adicionam estabilidade ao código, evitando que o programador insira o objeto errado em uma coleção.
2. **Casting:** Ao recuperar um item da lista, você não sabia seu tipo e, portanto, tinha que fazer um cast manualmente. Isso não apenas torna o código mais feio, mas também propenso a erros.

## Criando nossa própria classe genérica: 
Uma classe genérica é definida com um parâmetro de tipo formal, que é usado como um marcador de posição para o tipo real que será usado para criar uma instância da classe.

```java
public class Caixa<T> {
    private T conteudo;

    public void armazenar(T conteudo) {
        this.conteudo = conteudo;
    }

    public T obter() {
        return conteudo;
    }
}
```
Aqui, T é um parâmetro de tipo. Você pode criar instâncias desta classe para diferentes tipos:

```java
Caixa<String> caixaString = new Caixa<>();
caixaString.armazenar("Olá, Generics!");

Caixa<Integer> caixaInt = new Caixa<>();
caixaInt.armazenar(42);
```
## Uso de Generics em Interfaces
```java
public interface Comparador<T> {
    int comparar(T o1, T o2);
}

```

```java
public class ComparadorString implements Comparador<String> {
    @Override
    public int comparar(String o1, String o2) {
        return o1.compareTo(o2);
    }
}

```


# Exercicio
1. Crie uma classe Genérica Loja, que tenha uma lista de itens do tipo instanciado. Que também tenha um método para inserir elementos nessa lista e outro para mostrar a lista.
2. Crie as classes: Eletronico, Alimento, Roupa;
3. Instancie as Lojas com os classes criadas acima.
4. Adicione elementos em cada classe e depois mostre a lista.
