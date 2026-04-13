public class Questao {
    private int numero;
    private String enunciado;
    private float valor;

    public Questao(int numero, String enunciado, float valor) {
        this.numero = numero;
        this.enunciado = enunciado;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return String.format("Questão %d: %s (Valor: %.2f)", numero, enunciado, valor);
    }
}