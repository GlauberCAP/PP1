public class Streaming {

    public String usuario;
    public String plano;
    public float mensalidade;
    public boolean ativo;
    public String ultimoFilmeAssistido;

    public Streaming(String usuario, String plano) {
        this.usuario = usuario;
        this.plano = plano;
        this.ativo = true;
        this.ultimoFilmeAssistido = "";

        switch (plano) {
            case "Básico":
                this.mensalidade = 25.90f;
                break;
            case "Premium":
                this.mensalidade = 45.90f;
                break;
            case "Família":
                this.mensalidade = 60.90f;
                break;
            default:
                this.plano = "Básico";
                this.mensalidade = 25.90f;
        }
    }

    public void assistirFilme(String nomeFilme) {
        if (ativo) {
            ultimoFilmeAssistido = nomeFilme;
        }
    }

    public void cancelarAssinatura() {
        ativo = false;
    }


    public String toString() {
        String status = ativo ? "Ativo" : "Suspenso";

        return "\nUsuário: " + usuario +
                "\nPlano: " + plano +
                "\nMensalidade: R$ " + mensalidade +
                "\nStatus: " + status +
                "\nÚltimo filme assistido: " + ultimoFilmeAssistido + "\n";
    }
}