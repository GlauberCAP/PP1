public class TestaAcademico {
    public static void main(String[] args) {
        // 1. Instanciar Alunos (Objetos Independentes)
        Aluno a1 = new Aluno(1, "Ana Silva", "RA123", "Engenharia");
        Aluno a2 = new Aluno(2, "Bruno Costa", "RA456", "Engenharia");

        // 2. Instanciar Disciplina
        Disciplina poo = new Disciplina(101, "Programação Orientada a Objetos", "Dr. Alan Turing");

        // 3. Agregação: Vincular alunos existentes
        poo.matricularAluno(a1);
        poo.matricularAluno(a2);

        // 4. Composição: Criar Avaliação dentro da disciplina
        poo.criarAvaliacao(1, "Prova Semestral");

        // 5. Composição Aninhada: Adicionar questões à avaliação criada
        // Acessamos a primeira avaliação (índice 0) para inserir questões
        Avaliacao p1 = poo.getAvaliacao(0);
        p1.adicionarQuestao(1, "O que é Polimorfismo?", 3.5f);
        p1.adicionarQuestao(2, "Explique a diferença entre Agregação e Composição.", 3.5f);
        p1.adicionarQuestao(3, "Implemente uma classe Singleton.", 3.0f);

        // 6. Imprimir resultado
        System.out.println(poo.toString());
    }
}