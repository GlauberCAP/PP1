import java.util.ArrayList;

public class Avaliacao {
    private int id;
    private String nome;
    private ArrayList<Questao> questoes;

    public Avaliacao(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.questoes = new ArrayList<>();
    }

    // Método de Composição: a Questao nasce aqui dentro
    public void adicionarQuestao(int num, String texto, float peso) {
        this.questoes.add(new Questao(num, texto, peso));
    }

    @Override
    public String toString() {
        return "\nAvaliação: " + nome + " | Questões: " + questoes;
    }
}