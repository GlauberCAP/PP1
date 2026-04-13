public class Pix implements Pagamento{

    public void autorizar(double valor) {
        System.out.println("Gerando um QRcode para a chave pix");
        System.out.println("Pagamento do valor" + valor+ "foi enviado instantaneamente");
    }

}
