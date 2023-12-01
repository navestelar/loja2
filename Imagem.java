public class Imagem {
    private String src;
    private String descricao;
    public Imagem(String src, String descricao) {
        this.src = src;
        this.descricao = descricao;
    }
    public String getSrc() {
        return src;
    }
    public void setSrc(String src) {
        this.src = src;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    @Override
    public String toString() {
        return "Imagem [src=" + src + ", descricao=" + descricao + "]";
    }
}
