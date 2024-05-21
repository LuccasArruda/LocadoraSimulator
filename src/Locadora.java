import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Locadora {
    private String nome;
    private ArrayList<Produto> produtos;

    public Locadora(String nome){
        ArrayList<Produto> produtosLocadora;
        setNome(nome);
        produtosLocadora = new ArrayList<Produto>();
        setProdutos(produtosLocadora);
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

    public void adicionarFilme(Scanner ler){
        Filme novoFilme;
        String nomeFilme, nomeDiretor, nomeAtorPrincipal, atorPrincipal, cadastroDetalhado;
        float precoFilme;

        System.out.println("Legal! Vamos aumentar o nosso arsenal de filmes.");
        System.out.println(">  Qual é o nome do filme que você quer adicionar? ");
        nomeFilme = ler.next();
        System.out.println("BACANA! Esse filme é um dos mehores que eu já vi!");
        System.out.println(">  Agora, quanto ele vai custar?");
        precoFilme = ler.nextFloat();
        System.out.println("Haha, vamos ganhar muito dinheiro com esse filme!");
        System.out.println("Pronto! o Cadastro básico do filme " + nomeFilme + " foi realizado!");

        System.out.println("> Deseja adicionar mais informações do filme? \n[S] ou [N]");
        cadastroDetalhado = ler.next();
        while (!Objects.equals(cadastroDetalhado, "S") && !Objects.equals(cadastroDetalhado, "N")){
            System.out.println("> Deseja adicionar mais informações do filme? \n[S] ou [N]");
            cadastroDetalhado = ler.next();
        }

        if (Objects.equals(cadastroDetalhado, "S")){
            novoFilme = new Filme(nomeFilme, precoFilme);
            this.produtos.add(novoFilme);
            System.out.println("PRONTO! Agora temos o filme " + nomeFilme + " em nossa biblioteca");
            return;
        }

        System.out.println("Certo, vamos continuar!");
        System.out.println(">  Qual é o nome do diretor desse filme?");
        nomeDiretor = ler.next();

        System.out.println("E pra fechar de vez...");
        System.out.println(">  Qual é o nome do ator principal desse filme?");
        nomeAtorPrincipal = ler.next();

        novoFilme = new Filme(nomeFilme, precoFilme, nomeDiretor, nomeAtorPrincipal);
        this.produtos.add(novoFilme);
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
