public class Aluno {
    private int id;
    private String nome;
    private String ra;
    private String curso;

    public Aluno(int id, String nome, String ra, String curso) {
        this.id = id;
        this.nome = nome;
        this.ra = ra;
        this.curso = curso;
    }

    // Getters e Setters
    public int getId() { return id; }
    public String getNome() { return nome; }

    @Override
    public String toString() {
        return String.format("Aluno [ID: %d, Nome: %s, RA: %s, Curso: %s]", id, nome, ra, curso);
    }
}
