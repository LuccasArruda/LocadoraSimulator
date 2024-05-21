package LocadoraSimulator;

public class Produto {
    private String nome;
    private double preco;
    private Boolean disponivel;
    private int Codigo;

    public Produto(String nome, float preco, int codigo){
        setNome(nome);
        setPreco(preco);
        setDisponivel(true);
        setCodigo(codigo);
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

    public void setCodigo(int codigo) {
        Codigo = codigo;
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

    public int getCodigo() {
        return Codigo;
    }

    public void exibeInformacoesProduto(){
        System.out.println("Código do Produto: " + getCodigo());
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: R$" + getPreco());
        if (this.disponivel){
            System.out.println("Este produto está disponível!");
            return;
        }

        System.out.println("O Produto está indisponível!");
    }
}
