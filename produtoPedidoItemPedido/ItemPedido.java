package produtoPedidoItemPedido;

public class ItemPedido {
	private int quantidade;
	private double preco;
	private Produto produto;
	public ItemPedido(Produto produto,int quantidade, double preco) {
		this.quantidade = quantidade;
		this.preco = preco;
		this.produto = produto;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public double getPreco() {
		return preco;
	}
	public Produto getProduto() {
		return produto;
	}
	

}
