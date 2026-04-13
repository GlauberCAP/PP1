public class Placar {

    public String nomeTimeCasa;
    public String nomeTimeVisitante;
    public int pontosCasa;
    public int pontosVisitante;
    public int periodoQuarto;

    public Placar(String nomeTimeCasa, String nomeTimeVisitante) {
        this.nomeTimeCasa = nomeTimeCasa;
        this.nomeTimeVisitante = nomeTimeVisitante;
        this.pontosCasa = 0;
        this.pontosVisitante = 0;
        this.periodoQuarto = 1;
    }

    public void registrarPonto(String time, int tipo) {

        if (periodoQuarto > 4) return;

        if (time.equalsIgnoreCase("casa")) {
            pontosCasa += tipo;
        } else if (time.equalsIgnoreCase("visitante")) {
            pontosVisitante += tipo;
        }
    }

    public void proximoQuarto() {
        periodoQuarto++;
    }


    public String toString() {
        return nomeTimeCasa + " " + pontosCasa +
                " x " + pontosVisitante + " " +
                nomeTimeVisitante +
                " - Período: " + periodoQuarto;
    }
}