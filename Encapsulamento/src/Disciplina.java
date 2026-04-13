import java.util.ArrayList;

public class Disciplina {
    private int id;
    private String nome;
    private String professor;
    private ArrayList<Aluno> alunos;
    private ArrayList<Avaliacao> avaliacoes;

    public Disciplina(int id, String nome, String professor) {
        this.id = id;
        this.nome = nome;
        this.professor = professor;
        this.alunos = new ArrayList<>();
        this.avaliacoes = new ArrayList<>();
    }

    // Agregação: Recebe um objeto Aluno pronto de fora
    public void matricularAluno(Aluno a) {
        this.alunos.add(a);
    }

    // Composição: A Avaliacao é instanciada dentro da Disciplina
    public void criarAvaliacao(int id, String nome) {
        this.avaliacoes.add(new Avaliacao(id, nome));
    }

    // Método auxiliar para buscar uma avaliação específica e adicionar questões
    public Avaliacao getAvaliacao(int index) {
        return avaliacoes.get(index);
    }

    @Override
    public String toString() {
        return "=== DISCIPLINA: " + nome + " (Prof. " + professor + ") ===\n" +
                "ALUNOS MATRICULADOS: " + alunos + "\n" +
                "AVALIAÇÕES: " + avaliacoes;
    }
}
