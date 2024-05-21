public class Jogo extends Produto implements IAlugavel{
    private String Console;

    public Jogo(String nome, float preco, String console){
        super(nome, preco);
        setConsole(console);
    }

    public void setConsole(String console) {
        Console = console;
    }

    public String getConsole() {
        return Console;
    }

    @Override
    public void alugarProduto() {
        super.setDisponivel(false);
    }

    @Override
    public void devolverProduto() {
        super.setDisponivel(true);
    }

    @Override
    public void exibeInformacoesProduto() {
        super.exibeInformacoesProduto();
        System.out.println("Console: " + getConsole());
        System.out.println("===============================");
    }
}
