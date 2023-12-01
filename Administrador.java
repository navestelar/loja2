public class Administrador extends Usuario {
    public Administrador(String username, String senha) {
        super(username, senha);
        //TODO Auto-generated constructor stub
    }

    public void ativarDesativarCliente(boolean ativar, Cliente cliente) {
        cliente.setAtivo(ativar);
    }
}
