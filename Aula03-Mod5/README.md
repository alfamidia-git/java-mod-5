# Trabalhando com Datas em JAVA
Datas no Java sempre foram um desafio para desenvolvedores. Inicialmente, começamos com a simples, mas posteriormente insuficiente, classe Date. Essa classe, embora útil em seus primeiros dias, estava repleta de problemas, desde uma API confusa até questões de mutabilidade. Para superar suas deficiências, foi introduzida a classe Calendar. Ela ofereceu mais flexibilidade e abordou algumas das falhas do Date, mas trouxe sua própria cota de complexidade.

Com o passar dos anos e as crescentes demandas de aplicações mais robustas e globais, tornou-se evidente que uma solução mais abrangente e intuitiva era necessária. E foi assim que, no Java 8, foi introduzida a nova API java.time, trazendo consigo classes como LocalDate, LocalDateTime, entre outras. Estas não só abordam as principais limitações das abordagens anteriores, mas também oferecem uma forma muito mais lúcida e imutável de lidar com datas e horas.


## java.util.Date
foi uma das primeiras abordagens no Java para lidar com datas e horários. No entanto, ao longo dos anos, descobriu-se que ela tem várias limitações e deficiências que levaram à sua depreciação parcial e à introdução de novas classes de data e hora no Java 8. Aqui estão algumas das principais limitações:
1. Mutabilidade
2. Confusa
3. Depreciação de Métodos
4. Sem Suporte para Formatação ou Parsing
5. Falta de Suporte a Zonas Horárias
6. Sem Métodos para Cálculos de Data

Exemplo:
```java
import java.util.Date;

public class Main{
    public static void main(String[] args){
        Date data = new Date();
        System.out.println(data);
    }
}
```


## java.util.Calendar
A classe java.util.Calendar foi introduzida como uma tentativa de superar as deficiências da classe Date e proporcionar uma maneira mais flexível de manipular datas e horas. Ela é uma classe abstrata e oferece muitos métodos para operações relacionadas a datas. A instância mais comum do Calendar que os desenvolvedores geralmente usam é GregorianCalendar. Aqui estão algumas das principais limitações:
1. Verbosidade.
2. Inconsistência na Indexação de Meses.
3. Mutabilidade.
4. Complexidade na Formatação e Parsing.

Exemplo:
```java
import java.util.Calendar;

public class Main{
    public static void main(String[] args){
    Calendar cal = Calendar.getInstance();
    cal.set(2023, Calendar.JULY, 15);

    System.out.println(cal);
    }
}
```

## java.time.LocalDate e java.time.LocalDateTime
Com o lançamento do Java 8, a API java.time foi introduzida, trazendo uma revolução na forma como lidamos com datas e horas em Java. As classes LocalDate e LocalDateTime são duas das peças centrais dessa nova API, projetadas para superar as limitações das classes Date e Calendar.

#### LocalDate:
representa uma data sem horário em um determinado fuso horário. Ou seja, é apenas a data: dia, mês e ano.

```java
public class Main{
    public static void main(String[] args){
        LocalDate hoje = LocalDate.now();            // Pega a data atual
        LocalDate dataEspecifica = LocalDate.of(2023, 7, 15); // Define uma data específica

    }
}
```
#### LocalDateTime:
 é uma combinação de data e hora. Ele representa uma data-hora sem fuso horário.

```java
public class Main{
    public static void main(String[] args){
        LocalDateTime agora = LocalDateTime.now();             // Pega a data e hora atual
        LocalDateTime dataHoraEspecifica = LocalDateTime.of(2023, 7, 15, 14, 30); // Define uma data e hora específica
    }
}
```

### Melhorias em relação as classes vistas anteriormente:
1. Imutabilidade.
2. API Clara e Fluente.
3. Sem Indexação Confusa.
4. Formatação e Parsing :
    DateTimeFormatter foi introduzido para fornecer formatação e análise eficientes, tornando-o mais poderoso e fácil de usar do que SimpleDateFormat.

    ```java
    public class Main{
        public static void main(String[] args){
            DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String dataFormatada = hoje.format(formatador);
            LocalDate dataDaString = LocalDate.parse("15/08/2023", formatador);
        }
    }
    ```
5. Métodos de Apoio Integrados

# Exercicio
1. Crie uma classe Artigo com os atributos: titulo (string) e dataPublicacao em algum tipo de data

2. Crie uma classe Jornal que tenha como atributo estático e final uma lista de Artigos.
 * Deverá ter no mínimo 7 artigos.
 * Os artigos deverão ter titulos e datas de publicações váriadas.

3. Na classe Jornal, crie um método estatico que recebe dois parametros: de e até. Este método deverá retornar os artigos que se enquadrem nas data do parametro:
    * exemplo: public static List<Artigo> buscarPorData(TipoData de, TipoData até)
