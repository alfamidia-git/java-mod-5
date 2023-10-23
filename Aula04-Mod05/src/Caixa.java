public class Caixa<T> {
    private T conteudo;

    public void armazenar(T conteudo) {
        this.conteudo = conteudo;
    }

    public T obter() {
        return conteudo;
    }
}
