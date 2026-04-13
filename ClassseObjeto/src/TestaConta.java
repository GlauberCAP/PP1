public class TestaConta {

    public static void main(String[] args) {

        Conta c1 = new Conta(1001, 123, "João Silva");

        c1.depositar(500f);
        c1.sacar(200f);

        System.out.println(c1);

        Conta c2 = new Conta(1002, 123, "Maria Souza");

        c2.sacar(50f);
        System.out.println(c2);

        c1.encerrarConta(); // não vai encerrar porque tem saldo
        System.out.println(c1);

        c1.sacar(300f);
        c1.encerrarConta();

        System.out.println(c1);
    }
}