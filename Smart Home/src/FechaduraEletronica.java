public class FechaduraEletronica implements Autenticavel, DispositivoLigavel {
    private boolean acessoPermitido = false;
    private boolean destrancada = false;
    private final String SENHA_CORRETA = "1234";

    @Override
    public void validarAcesso(String senha) {
        if (SENHA_CORRETA.equals(senha)) {
            this.acessoPermitido = true;
            System.out.println("Fechadura: Senha correta! Acesso liberado para destrancar.");
        } else {
            this.acessoPermitido = false;
            System.out.println("Fechadura: Senha incorreta! Acesso negado.");
        }
    }

    @Override
    public void ligar() {

        if (this.acessoPermitido) {
            this.destrancada = true;
            System.out.println("Fechadura: Porta DESTRANCADA.");
        } else {
            System.out.println("Fechadura ERRO: Você precisa validar a senha antes de destrancar a porta!");
        }
    }

    @Override
    public void desligar() {
        this.destrancada = false;
        this.acessoPermitido = false;
        System.out.println("Fechadura: Porta TRANCADA.");
    }
}