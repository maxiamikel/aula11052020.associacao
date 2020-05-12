package produtoPedidoItemPedido;

public class AppColecaoDeProduto {

	public static void main(String[] args) {
	Produto produto1 = new Produto("Abacate roxo");
	Produto produto2 = new Produto("Manga Tommy");
	Pedido pedido1 = new Pedido(1);
	
	ItemPedido item1 = new ItemPedido(produto1,15,10.99);
	ItemPedido item2 = new ItemPedido(produto2,4,5.99);
	
	pedido1.adicionarItem(item1);
	pedido1.adicionarItem(item2);
	
	for(int i=0; i< pedido1.getItemPedido().size(); i+=1) {
		System.out.println("Produto: "+pedido1.getItemPedido().get(i).getProduto()+
				           "\nQuantidade: " +pedido1.getItemPedido().get(i).getQuantidade()+
				           "\nPreço: "+pedido1.getItemPedido().get(i).getPreco());
	}
	

	}

}
