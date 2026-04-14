public class TermostatoSmart implements DispositivoLigavel, SensorTemperatura {
    private boolean ligado = false;

    @Override
    public void ligar() {
        this.ligado = true;
        System.out.println("Termostato: Ligado e operando.");
    }

    @Override
    public void desligar() {
        this.ligado = false;
        System.out.println("Termostato: Desligado.");
    }

    @Override
    public double lerTemperatura() {
        if (this.ligado) {
            return 24.5;
        } else {
            System.out.println("Termostato ERRO: Impossível ler temperatura. O aparelho está desligado.");
            return 0.0;
        }
    }
}