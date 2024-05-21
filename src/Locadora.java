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
    public void adicionarJogo(Scanner ler){
        Jogo novoJogo;
        String nomeJogo, nomeDiretor, nomeAtorPrincipal, atorPrincipal, cadastroDetalhado;
        float precoJogo;

        System.out.println("Legal! Vamos aumentar o nosso arsenal de jogos.");
        System.out.println(">  Qual é o nome do jogo que você quer adicionar? ");
        nomeJogo = ler.next();
        System.out.println("BACANA! Esse jogo é um dos mehores que eu já vi!");
        System.out.println(">  Agora, quanto ele vai custar?");
        precoJogo = ler.nextFloat();
        System.out.println("Haha, vamos ganhar muito dinheiro com esse jogo!");
        System.out.println("Pronto! o Cadastro básico do jogo " + nomeJogo + " foi realizado!");

        System.out.println("> Deseja adicionar mais informações do jogo? \n[S] ou [N]");
        cadastroDetalhado = ler.next();
        while (!Objects.equals(cadastroDetalhado, "S") && !Objects.equals(cadastroDetalhado, "N")){
            System.out.println("> Deseja adicionar mais informações do jogo? \n[S] ou [N]");
            cadastroDetalhado = ler.next();
        }

        if (Objects.equals(cadastroDetalhado, "N")){
            novoJogo = new Jogo(nomeJogo, precoJogo);
            this.produtos.add(novoJogo);
            System.out.println("PRONTO! Agora temos o jogo " + nomeJogo + " em nossa biblioteca");
            return;
        }

        System.out.println("Certo, vamos continuar!");
        System.out.println(">  Qual é o console desse jogo?");
        nomeDiretor = ler.next();

        System.out.println("E pra fechar de vez...");
        System.out.println(">  Qual é a distribuidora desse jogo?");
        nomeAtorPrincipal = ler.next();

        novoJogo = new Jogo(nomeJogo, precoJogo, nomeDiretor, nomeAtorPrincipal);
        this.produtos.add(novoJogo);
        System.out.println("PRONTO! Agora temos o jogo " + nomeJogo + " em nossa biblioteca");
    }

    public void adicionarFilme(Scanner ler){
        Filme novoFilme;
        String nomeFilme, nomeDiretor, nomeAtorPrincipal, cadastroDetalhado;
        float precoFilme;

        System.out.println("Legal! Vamos aumentar o nosso arsenal de jogos.");
        System.out.println(">  Qual é o nome do jogo que você quer adicionar? ");
        nomeFilme = ler.next();
        System.out.println("BACANA! Esse jogo é um dos mehores que eu já vi!");
        System.out.println(">  Agora, quanto ele vai custar?");
        precoFilme = ler.nextFloat();
        System.out.println("Haha, vamos ganhar muito dinheiro com esse jogo!");
        System.out.println("Pronto! o Cadastro básico do jogo " + nomeFilme + " foi realizado!");

        System.out.println("> Deseja adicionar mais informações do jogo? \n[S] ou [N]");
        cadastroDetalhado = ler.next();
        while (!Objects.equals(cadastroDetalhado, "S") && !Objects.equals(cadastroDetalhado, "N")){
            System.out.println("> Deseja adicionar mais informações do jogo? \n[S] ou [N]");
            cadastroDetalhado = ler.next();
        }

        if (Objects.equals(cadastroDetalhado, "N")){
            novoFilme = new Filme(nomeFilme, precoFilme);
            this.produtos.add(novoFilme);
            System.out.println("PRONTO! Agora temos o jogo " + nomeFilme + " em nossa biblioteca");
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
        System.out.println("PRONTO! Agora temos o jogo " + nomeFilme + " em nossa biblioteca");
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
