# Generics em Métodos e Parâmetros.

## Generics em Métodos
Assim como as classes podem ser parametrizadas por tipo, os métodos também podem ser. Ao utilizar generics em métodos, você pode garantir segurança de tipo, reutilização de código e flexibilidade.

```java

public static <T> boolean compare(T o1, T o2) {
    return o1.equals(o2);
}

```
Aqui, o <T> antes do tipo de retorno indica que o método compare é genérico e que o tipo T será determinado pelo tipo dos argumentos passados para o método.

## Generics em Métodos
Generics também pode ser usado em parâmetros para métodos e construtores.

Suponha que você queira escrever um método para processar uma lista de itens. Com generics, você pode especificar o tipo exato dos itens que a lista irá conter, garantindo segurança de tipo:

```java
public static <T> void processList(List<T> items) {
    for(T item : items) {
        System.out.println(item);
    }
}

```
Aqui, T é um parâmetro de tipo. Você pode criar instâncias desta classe para diferentes tipos:

# Restrições de Tipo com Generics
Ao trabalhar com generics, muitas vezes você desejará limitar os tipos que podem ser usados como argumentos de tipo. No Java, isso é alcançado usando a palavra-chave extends em uma cláusula de limite de tipo. É importante notar que, neste contexto, extends é usado de uma maneira mais geral para significar "estende" (para classes) ou "implementa" (para interfaces).

### Exemplo
```java
public static <T extends Number> double soma(T num1, T num2) {
    return num1.doubleValue() + num2.doubleValue();
}
```
No método acima, usamos o método doubleValue() que está disponível para qualquer classe que estende Number, garantindo assim que nosso código funcione corretamente para qualquer tipo numérico passado.

## O que é '(T extends Number)' ?
A expressão (T extends Number) significa que o tipo genérico T é limitado a instâncias de classes que são subclasses de Number ou a própria classe Number. Isso garante que o tipo T herde métodos definidos na classe Number, o que é útil quando você precisa realizar operações numéricas em T.

### Outros Exemplos de Restrições:
1. **Restrição de Interface:**
    * **(T extends Comparable<T>):** Aqui, T é limitado a qualquer classe que implemente a interface **Comparable< T >**
2. **Restrições Múltiplas:**
    * Em alguns casos, você pode querer limitar um tipo a classes ou interfaces múltiplas. Isso é feito usando o caractere &.
    * Exemplo: **(T extends Number & Comparable<T>)**: Aqui, **T** deve ser uma subclasse de **Number** e também implementar a interface **Comparable< T >**.
### Observação:

# Exercicio
1. Crie um método genérico chamado **compararNumeros**.
    * Este método deve aceitar dois argumentos de um tipo T, onde T é um subtipo de Number.
    * O método deve retornar o maior número entre os dois.
    * Use o método **doubleValue()** para fazer a comparação.
2. No método principal (main):
    * Teste o método compararNumeros com diferentes tipos numéricos como Integer, Double e Float.