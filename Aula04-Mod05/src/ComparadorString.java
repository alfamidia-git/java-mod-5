public class ComparadorString implements Comparador<String>{
    @Override
    public int comparar(String a1, String a2) {
        return a1.compareTo(a2);
    }
}
