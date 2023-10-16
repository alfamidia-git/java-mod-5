# Criando nossas próprias exceções
Você pode criar suas próprias exceções personalizadas. Para criar uma exceção personalizada, geralmente você estende uma das classes de exceção existentes: Exception ou RuntimeException. A diferença entre estender essas duas classes é que exceções que estendem Exception são checked exceptions (com exceção de RuntimeException e suas subclasses), enquanto aquelas que estendem RuntimeException são unchecked exceptions.

### Criando uma Checked Exception: 
Para criar uma checked exception, estenda a classe Exception.
```java
public class IdadeInvalidaException extends Exception {
    public IdadeInvalidaException(String message) {
        super(message);
    }
}
```

###  Criando uma Unchecked Exception:
Para criar uma unchecked exception, estenda a classe RuntimeException.

```java
public class DivisaoPorZeroException extends RuntimeException {
    public DivisaoPorZeroException() {
        super("Divisão por zero não é permitida!");
    }
}
```

## Lançando exceções
Lançar exceções em Java é uma maneira de sinalizar que ocorreu uma situação excepcional que, geralmente, o fluxo normal de um programa não pode ou não deve lidar. Isso é feito usando a palavra-chave throw.

##### Lançando exceções que acabamos de criar:

```java
public void definirIdade(int idade) throws IdadeInvalidaException{
    if (idade < 0) {
        throw new IdadeInvalidaException("Idade não pode ser negativa!");
    }
}
```

ou

```java
public void fazerDivisao(int x, int y) {
    if(y == 0){
        throw new DivisaoPorZeroException();
    }
}
```

# Exercicio
Desenvolva um sistema para uma biblioteca. Neste sistema, os usuários podem pegar livros emprestados. No entanto, existem algumas regras:
1. Um usuário só pode pegar até 5 livros por vez.
2. O livro deve estar disponível na biblioteca (não pode estar emprestado por outro usuário).

**passo-a-passo**
1. Crie exceções personalizadas para os seguintes cenários:
    * **LimiteLivrosExcedidoException**: Quando um usuário tenta pegar mais de 5 livros.
    * **LivroIndisponivelException**: Quando o livro solicitado já está emprestado.
2. Implemente a classe **Biblioteca** que deve conter:
    * Uma lista de livros disponíveis.
    * Um método emprestarLivro que aceita o nome do livro e o empresta ao usuário, se possível. Caso contrário, lança uma das exceções personalizadas.
3. Teste sua implementação no método main tentando emprestar livros e tratando as possíveis exceções.