package LocadoraSimulator;

public class Filme extends Produto implements IAlugavel{
    private String diretor;
    private String atorPrincipal;

    public Filme(String nome, float preco, int codigo, String diretor, String atorPrincipal){
        super(nome, preco, codigo);
        setDiretor(diretor);
        setAtorPrincipal(atorPrincipal);
    }

    public Filme(String nome, float preco, int codigo){
        super(nome, preco, codigo);
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
    public void alugarProduto() { super.setDisponivel(false);}

    @Override
    public void devolverProduto() {
        super.setDisponivel(true);
    }

    @Override
    public void exibeInformacoesProduto() {
        super.exibeInformacoesProduto();
        System.out.println("Dirigido por " + getDiretor());
        System.out.println("Estrelando " + getAtorPrincipal());
        System.out.println("===============================");
    }
}
