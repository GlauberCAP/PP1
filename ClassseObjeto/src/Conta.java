public class Conta {

    public int numeroConta;
    public int agencia;
    public String nomeCliente;
    public float saldo;
    public boolean status;

    public Conta(int numeroConta, int agencia, String nomeCliente) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = 0f;
        this.status = true;
    }

    public void depositar(float valor) {
        if (status) {
            saldo += valor;
        }
    }

    public void sacar(float valor) {
        if (status && saldo >= valor) {
            saldo -= valor;
        }
    }

    public void encerrarConta() {
        if (saldo == 0) {
            status = false;
        }
    }


    public String toString() {
        String situacao = status ? "Ativa" : "Encerrada";

        return "\nConta: " + numeroConta +
                "\nAgência: " + agencia +
                "\nCliente: " + nomeCliente +
                "\nSaldo: R$ " + saldo +
                "\nStatus: " + situacao + "\n";
    }
}