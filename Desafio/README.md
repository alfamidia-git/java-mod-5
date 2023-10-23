## DESAFIO FINAL DO MÓDULO
Com base em todo conteúdo visto nas aulas anteriores, você precisará desenvolver um...

### Sistema de Gerenciamento de Reservas de Hotel
O principal objetivo deste desafio é praticar o uso de tratamento de exceções, criação de exceções personalizadas, trabalho com datas, e a utilização de Generics.

#### Vamos ao desafio:
1. Crie uma interface **Repositorio< T >** com os seguintes
**métodos** 
    * **adicionar(T item):**
    * **remover(T item):**
    * **< R > T buscar(R codigo)**:
2. Crie uma classe **ReservaConflitanteException**: Crie esta classe para representar uma exceção que será lançada quando houver uma tentativa de fazer uma reserva que colida com uma reserva existente.
3. Crie uma classe **Reserva**:
**atributos**
    * codigo.
    * cliente.
    * dataEntrada.
    * dataSaida.
    * quarto.
**métodos** 
    * **diasReservados()**: Retorna o número de dias da reserva.
    * **toString()**
    * **Métodos getters e setters.**
    * **Construtor que aceita todos os parâmetros.**: 
4. Crie uma classe **GerenciadorReservas** que vai implementar **Repositorio**:
**atributos**
    * reservas
**métodos**
    * **todos da interface**
5. Na classe Principal:
    * Instancie algumas reservas.
    * Crie uma instância do GerenciadorReservas.
    * Adicione reservas ao gerenciador.
    * Tente adicionar reservas conflitantes e trate a ReservaConflitanteException.
    * Busque 2 reservas por código.
    * Remova 1 reserva.