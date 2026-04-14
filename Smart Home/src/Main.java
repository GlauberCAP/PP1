public class Main {
    public static void main(String[] args) {
        System.out.println("=== INICIANDO TESTE DA CASA INTELIGENTE ===\n");

        System.out.println("--- TESTE 1: Fechadura Eletrônica ---");
        FechaduraEletronica portaFrente = new FechaduraEletronica();


        portaFrente.ligar();


        portaFrente.validarAcesso("0000");
        portaFrente.ligar();


        portaFrente.validarAcesso("1234");
        portaFrente.ligar(); // Agora vai destrancar
        portaFrente.desligar(); // Tranca e tira a permissão


        System.out.println("\n--- TESTE 2: Termostato Smart ---");
        TermostatoSmart climaSala = new TermostatoSmart();


        climaSala.lerTemperatura();


        climaSala.ligar();
        double temp = climaSala.lerTemperatura();
        System.out.println("Temperatura da sala: " + temp + "°C");
        climaSala.desligar();
    }
}