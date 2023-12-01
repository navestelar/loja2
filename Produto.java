import java.util.ArrayList;

public class Produto {
    private String nome;
    private float preco;
    private int id;
    private int estoque;
    private ArrayList<Imagem> imagens = new ArrayList<>();

    public Produto(String nome, float preco, int id, int estoque) {
        if (estoque >= 0) {
            this.estoque = estoque;
        } else {
            System.out.println("O estoque não pode ser negativo.");
        }

        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("O preço não pode ser negativo.");
        }
        
        this.nome = nome;
        this.id = id;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: "+nome);
        System.out.printf("Preço: %.2f%n", preco);
        System.out.println("Id: "+id);
    }

    public String obterInformacoes() {
        return "Produto id: " + id + "\nNome: " + nome + "\nPreço: " + preco + "\nEstoque: " + estoque;
    }    

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("O preço não pode ser negativo.");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        if (estoque >= 0) {
            this.estoque = estoque;
        } else {
            System.out.println("O estoque não pode ser negativo.");
        }
    }

    public void inserirImagem(Imagem imagem) {
        imagens.add(imagem);
    }
}
