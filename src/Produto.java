public class Produto {
    private String nome;
    private double preco;
    private Boolean disponivel;

    public Produto(String nome, float preco){
        setNome(nome);
        setPreco(preco);
        setDisponivel(true);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public Boolean getDisponivel() {
        return disponivel;
    }

    public void exibeInformacoesProduto(){
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: R$" + getPreco());
    }
}
