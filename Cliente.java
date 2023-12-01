public class Cliente {
    private String nome;
    private String email;
    private String endereco;
    private Boolean ativo;
    private CarrinhoDeCompras carrinho;

    public Cliente(String nome, String email, String endereco, Boolean ativo, CarrinhoDeCompras carrinho) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.ativo = ativo;
        this.carrinho = carrinho;
    }

    public String comprar() {        
        System.out.println("O cliente "+getNome()+" realizou uma compra.");
        return getCarrinho().fazerCheckout();
    }

    public Cliente(String nome, String email, String endereco, CarrinhoDeCompras carrinho) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.carrinho = carrinho;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Endereço: " + endereco);
        getCarrinho().exibirProdutos();
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public CarrinhoDeCompras getCarrinho() {
        return carrinho;
    }
    public void setCarrinho(CarrinhoDeCompras carrinho) {
        this.carrinho = carrinho;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
}
