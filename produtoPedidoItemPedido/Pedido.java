package produtoPedidoItemPedido;

import java.util.ArrayList;

public class Pedido {
	private int numero;
	private ArrayList<ItemPedido> itemPedido = new ArrayList();
	public Pedido(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public  void adicionarItem(ItemPedido item) {
		this.itemPedido.add(item);
	}
	
	public ArrayList<ItemPedido> getItemPedido() {
		return itemPedido;
	}

}
