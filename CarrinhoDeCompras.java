import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public class CarrinhoDeCompras {
    private Map<Integer, Produto> produtos;
    private Map<Integer, Integer> quantidadeProduto = new HashMap<>();
    private FormaPagamentos formaPagamento;

    public FormaPagamentos getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamentos formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public void adicionarProduto(int idProduto, int quantidade) {
        Produto produto = produtos.get(idProduto);

        if (produto != null) {
            adicionarProduto(produto, quantidade);
        } else {
            System.out.println("Produto com ID " + idProduto + " não encontrado.");
        }
    }

    public boolean adicionarProduto(Produto produto, int quantidade) {
        if (quantidade<1 || quantidade>produto.getEstoque()) {
            return false;
        }

        produtos.put(produto.getId(), produto);
        quantidadeProduto.put(produto.getId(), quantidade);
        System.out.println("Produto adicionado ao carrinho com ID: " + produto.getId());
        return true;
    }

    public void exibirProdutos() {
        for (Produto produto : produtos.values()) {
            produto.exibirInformacoes();
        }
    }

    public String informacoesCarrinhoDeCompras() {
        StringBuilder info = new StringBuilder("Carrinho de compras: \n");

        info.append("-------------------------------------------------------------------------\n");
        for (Produto produto : produtos.values()) {
            info.append(produto.obterInformacoes());
            info.append("\nQuantidade: "+quantidadeProduto.get(produto.getId()));
            info.append("\n-------------------------------------------------------------------------\n");
        }

        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        info.append("TOTAL= R$").append(decimalFormat.format(calcularTotalCarrinho()));
        info.append("\n Forma de pagamento: "+getFormaPagamento());
        return info.toString();
    }    

    public float calcularTotalCarrinho() {
        if (produtos.isEmpty()) {
            return 0;
        }

        float total = 0;
        for (Produto produto : produtos.values()) {
            total+=(produto.getPreco()*quantidadeProduto.get(produto.getId()));
        }
        return total;
    }

    public void limparCarrinho() {
        produtos.clear();
        System.out.println("Carrinho limpo com sucesso.");
    }

    public String fazerCheckout() {
        for (Produto produto : produtos.values()) {
            produto.setEstoque(produto.getEstoque()-quantidadeProduto.get(produto.getId()));
        }
        String infoCarrinho = informacoesCarrinhoDeCompras();
        limparCarrinho();
        return infoCarrinho;
    }

    public CarrinhoDeCompras() {
        this.produtos = new HashMap<>();
    }
}
