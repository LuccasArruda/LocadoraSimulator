public class Jogo extends Produto implements IAlugavel{
    private String Console;
    private String Distribuidora;

    public Jogo(String nome, float preco, String console,String distribuidora){
        super(nome, preco);
        setConsole(console);
        setDistribuidora(distribuidora);
    }

    public void setConsole(String console) {
        Console = console;
    }

    public String getConsole() {
        return Console;
    }
    public void setDistribuidora(String distribuidora) {
        Distribuidora = distribuidora;
    }

    public String getDistribuidora() {
        return Distribuidora;
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
        System.out.println("Console: " + getConsole());
        System.out.println("Distribuidora: " + getDistribuidora());
        System.out.println("===============================");
    }
}
