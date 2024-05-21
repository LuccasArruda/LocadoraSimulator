import java.util.ArrayList;

public class Locadora {
    private String nome;
    private ArrayList<Produto> produtos;

    public Locadora(String nome){
        setNome(nome);
    }

    public Locadora(String nome, ArrayList<Produto> produtos){
        setNome(nome);
        setProdutos(produtos);
    }

    public Locadora(String nome, Produto produto){
        ArrayList<Produto> produtosLocadora;
        setNome(nome);
        produtosLocadora = new ArrayList<Produto>();
        produtosLocadora.add(produto);
        setProdutos(produtosLocadora);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public void adicionarProduto(Produto novoProduto){

    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void exibeProdutosLocadora(){
        int I;
        System.out.println("==============================");
        System.out.println("    Produtos da Locadora      ");
        System.out.println("==============================");
        for (I = 0; I < this.produtos.size(); I++){
            this.produtos.get(I).exibeInformacoesProduto();
        }
    }
}
