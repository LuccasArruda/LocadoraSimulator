public class Filme extends Produto{
    private String diretor;
    private String atorPrincipal;

    public Filme(String nome, float preco, String diretor, String atorPrincipal){
        super(nome, preco);
        setDiretor(diretor);
        setAtorPrincipal(atorPrincipal);
    }

    public Filme(String nome, float preco){
        super(nome, preco);
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public void setAtorPrincipal(String atorPrincipal) {
        this.atorPrincipal = atorPrincipal;
    }

    public String getDiretor() {
        return diretor;
    }

    public String getAtorPrincipal() {
        return atorPrincipal;
    }

    @Override
    public void exibeInformacoesProduto() {
        super.exibeInformacoesProduto();
        System.out.println("Dirigido por " + getDiretor());
        System.out.println("Estrelando " + getAtorPrincipal());
        System.out.println("===============================");
    }
}
