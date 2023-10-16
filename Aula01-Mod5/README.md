# Exceções e Erros
Em Java, tanto Error quanto Exception são subclasses de Throwable, que é a classe base para todas as classes que você pode usar com try-catch para tratar eventos excepcionais. No entanto, eles têm usos e implicações diferentes.

![Estrutura dos erros e exceções](https://www.whitman.edu/mathematics/java_tutorial/java/exceptions/images/throwableHierarchy.trans.gif)
>Imagem retirada do site https://www.whitman.edu/

### Diferenças entre Exceções e Erros
1. **Natureza**:
    * **Error**: Indica problemas sérios que uma aplicação comum não deve tentar pegar (catch). Eles são problemas que ocorrem fora do controle do usuário ou do programador. Por exemplo, OutOfMemoryError ocorre quando a JVM não consegue alocar um objeto porque não há mais espaço de heap, e esse não é um problema que um programador normalmente tentaria resolver no código.
    * **Exception**: : São condições anormais que um programa bem escrito deseja capturar e tratar. Embora algumas exceções possam ser causadas por problemas externos (como tentar ler um arquivo que não existe), muitas são decorrentes de erros lógicos no código. É típico em programas Java usar instruções try-catch para tratar exceções. Por exemplo, NullPointerException ocorre quando se tenta acessar um método ou propriedade de um objeto nulo, e essa é uma condição que um programador frequentemente tentará tratar no código.

2. **Origem**:
    * **Error**:  Eles são gerados para indicar erros associados ao ambiente em que o aplicativo está sendo executado. Por exemplo, StackOverflowError indica que a pilha de uma thread foi esgotada.
    * **Exception**: Elas são geradas para indicar erros associados principalmente ao código do aplicativo.

3. **Tipo**:
    * **Error**: Eles são unchecked, o que significa que o compilador não o obriga a pegar ou lançar (throw) um erro.
    * **Exception**: Existem dois tipos - checked e unchecked. Checked exceptions são exceções como FileNotFoundException que você é obrigado a pegar ou lançar.Como RuntimeException e suas subclasses (NullPointerException, ArithmeticException, etc.), não precisam ser declaradas ou pegas.

4. **Recuperação**:
    * **Error**: Normalmente, você não pode fazer nada para se recuperar de um erro. Em muitos casos, a única solução é corrigir o problema que causou o erro e reiniciar a JVM.
    * **Exception**: Exceções são frequentemente recuperáveis. Muitas vezes, você pode usar um bloco try-catch para lidar com a exceção e permitir que o programa continue a funcionar

4. **Exemplos**:
    * **Error**: OutOfMemoryError, StackOverflowError, NoClassDefFoundError, etc.
    * **Exception**: IOException, SQLException, ClassNotFoundException, NullPointerException, etc.

Em resumo, enquanto Error indica problemas sérios que não estão no controle do programador, Exception indica problemas que podem e muitas vezes devem ser tratados pelo programa.

### Checked Exceptions e Unchecked Exceptions
**Checked Exceptions**:  São exceções que são verificadas em tempo de compilação. Isso significa que o compilador Java verifica se o método contém código que pode lançar exceções e, se sim, o método deve lidar com essas exceções de uma das duas maneiras: usando um bloco try-catch ou declarando a exceção usando a cláusula throws, indicando que o método pode lançar essa exceção e é responsabilidade de qualquer método chamador tratá-la

**Unchecked Exceptions**: São exceções que não são verificadas em tempo de compilação. Isso significa que o compilador não se preocupa se o código pode ou não lançar essas exceções, ou se são tratadas ou não. Elas geralmente derivam de RuntimeException.

### try-catch
O bloco try-catch é uma construção fundamental em linguagens de programação, como Java, para lidar com exceções em tempo de execução. Ele permite que os programadores especifiquem blocos de código que podem causar exceções e, em seguida, capturem e tratem essas exceções de maneira elegante, evitando a terminação abrupta do programa.

##### Estrutura:
```java
try {
    // Código que pode causar uma exceção
} catch (TipoDeExcecao1 e) {
    // Código para tratar a TipoDeExcecao1
} catch (TipoDeExcecao2 e) {
    // Código para tratar a TipoDeExcecao2
} 
// ... (possivelmente mais blocos catch)
finally {
    // Código que é executado independentemente de ocorrer ou não uma exceção
}
```

### Exemplos

1. 
```java
public class Main{
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 0;

        int result = num1 / num2;
    }
}
```
**Tratamento**

```java
public class Main{
     public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;

        try {
            int result = num1 / num2;
            System.out.println("O resultado é: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Não é possível dividir por zero!");
        }
    }
}
```

2. 
```java
public class Main{
    public static void main(String[] args){
        int[] numbers = {1, 2, 3};

        System.out.println(numbers[5]);
    }
}
```
**Tratamento**
```java
public class Main{
     public static void main(String[] args) {
        int[] numbers = {1, 2, 3};

        try {
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Índice fora dos limites do array!");
        }
    }
}
```

# Exercicio

1. Trate este código:
```java
public class Main{
     public static void main(String[] args) {
        String numberStr = "123a";
        int number = Integer.parseInt(numberStr);
        System.out.println("Número: " + number);
    }
}
```

2. Trate este código:
```java
public class Main{
     public static void main(String[] args) {
        Scanner sc = null;

        sc.nextInt();
    }
}
```