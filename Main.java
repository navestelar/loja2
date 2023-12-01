public class Main {
    public static void main(String[] args) {
       Produto produto1 = new Produto("Produto1", 5.99f, 1, 5);

       Produto produto2 = new Produto("Produto2", 10.50f, 2, 1);

       CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
       System.out.println("aaaaaaaaaaaaaa"+carrinhoDeCompras.adicionarProduto(produto1, 5));
       System.out.println("bbbbbbbbbb"+carrinhoDeCompras.adicionarProduto(produto2, 1));
       carrinhoDeCompras.adicionarProduto(3, 5);
       carrinhoDeCompras.exibirProdutos();

       Cliente cliente = new Cliente("Cliente1", "cliente1@email.com", "endereço cliente1", carrinhoDeCompras);
       System.out.println(cliente.comprar());
       System.out.println(produto1.getEstoque());
    }
}
