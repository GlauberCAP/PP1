public class SmartTv{
    private String marca, modelo;
    private int volume;

    public SmartTv(String marca, String modelo, int volume){
        this.marca = marca;
        this.modelo = modelo;
        this.setVolume(volume); // para não perder encapsulamento
    }

    //setter do volume
    public void setVolume(int volume){
        if (volume >= 0 && volume <= 100){
            this.volume = volume;
        }
        else System.out.println("Volume inválido");
    }
    public int getVolume(){
        return this.volume;
    }

}