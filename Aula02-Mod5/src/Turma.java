import java.util.*;

public class Turma {

    private Map<String, Double> alunos= new HashMap<>();


    public void adicionarAluno(String nome, Double nota, int idade) throws IdadeInvalidaException{
        if(idade < 12){
            throw new IdadeInvalidaException("Alunos menores 12 anos não podem ser matriculados");
        }
    }

    public void obterMediaDaTurma(){
        int qtd = alunos.size();

        if(qtd == 0){
            throw new DivisaoPorZeroException("O turma não contém alunos");
        }
    }
}
