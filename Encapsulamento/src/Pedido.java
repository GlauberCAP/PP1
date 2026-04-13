import java.util.Date;
import java.util.ArrayList;

public class Pedido {
    private int id;
    private Date data;
    private Cliente cliente; // associação todo-parte
    private ArrayList<ItemPedido> itensPedido;

    public Pedido() {
    }
    // o cliente veio pronto, mostrando sua independência do pedido
    public Pedido(int id, Date data, Cliente cliente) {
        this.id = id;
        this.data = data;
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }
    // o cliente veio pronto, mostrando sua independência do pedido
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", data=" + data +
                ", cliente=" + cliente +
                '}';
    }
}