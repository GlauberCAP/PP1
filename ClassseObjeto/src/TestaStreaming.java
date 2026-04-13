public class TestaStreaming {

    public static void main(String[] args) {

        Streaming s1 = new Streaming("Carlos", "Premium");

        // Estado inicial
        System.out.println(s1);

        // Assistindo filme
        s1.assistirFilme("Interestelar");
        System.out.println(s1);

        // Cancelando assinatura
        s1.cancelarAssinatura();
        System.out.println(s1);

        // Tentando assistir após cancelar
        s1.assistirFilme("Matrix");
        System.out.println(s1);
    }
}