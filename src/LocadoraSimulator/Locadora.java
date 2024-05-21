package LocadoraSimulator;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Locadora {
    private String nome;
    private ArrayList<Jogo> jogosLocadora;
    private ArrayList<Filme> filmesLocadora;
    private double lucro;


    public Locadora(String nome){
        setNome(nome);
        inicializaListas();
    }

    public Locadora(String nome, Jogo jogo){
        inicializaListas();
        setNome(nome);
        this.jogosLocadora.add(jogo);
    }

    public Locadora(String nome, Filme filme){
        inicializaListas();
        setNome(nome);
        this.filmesLocadora.add(filme);
    }

    private void inicializaListas(){
        ArrayList<Jogo> produtosLocadora;
        ArrayList<Filme> filmesLocadora;

        produtosLocadora = new ArrayList<Jogo>();
        setJogosLocadora(produtosLocadora);

        filmesLocadora = new ArrayList<Filme>();
        setFilmesLocadora(filmesLocadora);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setJogosLocadora(ArrayList<Jogo> jogosLocadora) {
        this.jogosLocadora = jogosLocadora;
    }

    public void setFilmesLocadora(ArrayList<Filme> filmesLocadora) {
        this.filmesLocadora = filmesLocadora;
    }

    public void setLucro(double lucro) {
        this.lucro = lucro;
    }

    public void adicionarLucro(double lucro){
        this.lucro += lucro;
    }

    public void alugarFilme(Scanner ler){
        int codigoFilme;
        Filme filmeEcontrado;

        System.out.println("Opa! Vamos alugar um filme para nosso primeiro cliente!");
        System.out.println(">  Qual o código do filme que o cliente escolheu?");
        codigoFilme = ler.nextInt();

        filmeEcontrado = procuraFilme(codigoFilme);

        if (filmeEcontrado == null){
            System.out.println("Não consegui encontrar o filme!");
            return;
        }

        if (!filmeEcontrado.getDisponivel()){
            System.out.println("O filme " + filmeEcontrado.getNome() + " está indisponível para locação!");
            return;
        }

        filmeEcontrado.alugarProduto();
        System.out.println("O filme " + filmeEcontrado.getNome() + " foi alugado!");
        adicionarLucro(filmeEcontrado.getPreco());
    }

    public void alugarJogo(Scanner ler){
        int codigoJogo;
        Jogo jogoProcurado;

        System.out.println("Opa! Vamos alugar um jogo para nosso primeiro cliente!");
        System.out.println(">  Qual o código do jogo que o cliente escolheu?");
        codigoJogo = ler.nextInt();

        jogoProcurado = procuraJogo(codigoJogo);
        if (jogoProcurado == null){
            System.out.println("Não consegui encontrar o jogo!");
            return;
        }

        if (!jogoProcurado.getDisponivel()){
            System.out.println("O jogo " + jogoProcurado.getNome() + " está indisponível para locação!");
            return;
        }

        jogoProcurado.alugarProduto();
        System.out.println("O jogo " + jogoProcurado.getNome() + " foi alugado!");
        adicionarLucro(jogoProcurado.getPreco());
    }

    private Jogo procuraJogo(int codigoJogo){
        int I;
        for (I = 0; I < this.jogosLocadora.size(); I++){
            if (this.jogosLocadora.get(I).getCodigo() == codigoJogo){
                return this.jogosLocadora.get(I);
            }
        }
        return null;
    }

    private Filme procuraFilme(int codigoFilme){
        int I;
        for (I = 0; I < this.filmesLocadora.size(); I++){
            if (this.filmesLocadora.get(I).getCodigo() == codigoFilme){
                return this.filmesLocadora.get(I);
            }
        }
        return null;
    }

    public void devolverJogo(Scanner ler){
        int I, codigoJogo;
        Jogo jogoDevolvido;

        System.out.println("Olha só! Parece que o cliente acabou de voltar com o jogo alugado!");
        System.out.println(">  Qual foi o jogo (código) devolvido pelo cliente?");
        codigoJogo = ler.nextInt();

        jogoDevolvido = procuraJogo(codigoJogo);
        if (jogoDevolvido == null){
            System.out.println("O jogo informado não foi alugado!");
            return;
        }

        System.out.println("O Jogo " + jogoDevolvido.getNome() + " foi devolvido!");
        jogoDevolvido.devolverProduto();
    }

    public void devolverFilme(Scanner ler){
        int I, codigoFilme;
        Filme filmeDevolvido;

        System.out.println("Olha só! Parece que o cliente acabou de voltar com o filme alugado!");
        System.out.println(">  Qual foi o filme (código) devolvido pelo cliente?");
        codigoFilme = ler.nextInt();

        filmeDevolvido = procuraFilme(codigoFilme);
        if (filmeDevolvido == null){
            System.out.println("O filme informado não foi alugado!");
            return;
        }

        System.out.println("O filme " + filmeDevolvido.getNome() + " foi devolvido!");
        filmeDevolvido.devolverProduto();
    }

    public void adicionarJogo(){
        Jogo novoJogo;
        String nomeJogo, console, nomeDistribuidora, cadastroDetalhado;
        float precoJogo;
        int codigoFilme;
        Scanner ler = new Scanner(System.in);

        codigoFilme = getJogosLocadora().size();
        System.out.println("Legal! Vamos aumentar o nosso arsenal de jogos.");
        System.out.println(">  Qual é o nome do jogo que você quer adicionar? ");
        nomeJogo = ler.nextLine();

        System.out.println("BACANA! Esse jogo é um dos mehores que eu já vi!");
        System.out.println(">  Agora, quanto ele vai custar?");
        precoJogo = ler.nextFloat();
        ler.reset();

        System.out.println("Haha, vamos ganhar muito dinheiro com esse jogo!");
        System.out.println("Pronto! o Cadastro básico do jogo " + nomeJogo + " foi realizado!");

        cadastroDetalhado = ler.nextLine();
        while (!Objects.equals(cadastroDetalhado, "S") && !Objects.equals(cadastroDetalhado, "N")){
            System.out.println("> Deseja adicionar mais informações do jogo? [S] ou [N]");
            cadastroDetalhado = ler.nextLine();
        }

        if (Objects.equals(cadastroDetalhado, "N")){
            novoJogo = new Jogo(nomeJogo, precoJogo, codigoFilme++);
            this.jogosLocadora.add(novoJogo);
            System.out.println("PRONTO! Agora temos o jogo " + nomeJogo + " em nossa biblioteca");
            return;
        }

        System.out.println("Certo, vamos continuar!");
        System.out.println(">  Qual é o console desse jogo?");
        console = ler.nextLine();

        System.out.println("E pra fechar de vez...");
        System.out.println(">  Qual é a distribuidora desse jogo?");
        nomeDistribuidora = ler.nextLine();
        novoJogo = new Jogo(nomeJogo, precoJogo, codigoFilme++, console, nomeDistribuidora);
        this.jogosLocadora.add(novoJogo);
        System.out.println("PRONTO! Agora temos o jogo " + nomeJogo + " em nossa biblioteca");
    }

    public void adicionarFilme(){
        Filme novoFilme;
        String nomeFilme, nomeDiretor, nomeAtorPrincipal, cadastroDetalhado;
        float precoFilme;
        int codigoFilme;
        Scanner ler = new Scanner(System.in);

        codigoFilme = getFilmesLocadora().size();
        System.out.println("Legal! Vamos aumentar o nosso arsenal de filmes.");
        System.out.println(">  Qual é o nome do filme que você quer adicionar? ");
        nomeFilme = ler.nextLine();

        System.out.println("BACANA! Esse filme é um dos mehores que eu já vi!");
        System.out.println(">  Agora, quanto ele vai custar?");
        precoFilme = ler.nextFloat();
        ler.reset();

        System.out.println("Haha, vamos ganhar muito dinheiro com esse filme!");
        System.out.println("Pronto! o Cadastro básico do filme " + nomeFilme + " foi realizado!");

        cadastroDetalhado = ler.nextLine();
        while (!Objects.equals(cadastroDetalhado, "S") && !Objects.equals(cadastroDetalhado, "N")){
            System.out.println("> Deseja adicionar mais informações do filme? [S] ou [N]");
            cadastroDetalhado = ler.nextLine();
        }

        if (Objects.equals(cadastroDetalhado, "N")){
            novoFilme = new Filme(nomeFilme, precoFilme, codigoFilme++);
            this.filmesLocadora.add(novoFilme);
            System.out.println("PRONTO! Agora temos o filme " + nomeFilme + " em nossa biblioteca");
            return;
        }

        System.out.println("Certo, vamos continuar!");
        System.out.println(">  Qual é o nome do diretor desse filme?");
        nomeDiretor = ler.nextLine();

        System.out.println("E pra fechar de vez...");
        System.out.println(">  Qual é o nome do ator principal desse filme?");
        nomeAtorPrincipal = ler.nextLine();

        novoFilme = new Filme(nomeFilme, precoFilme, codigoFilme++, nomeDiretor, nomeAtorPrincipal);
        this.filmesLocadora.add(novoFilme);
        System.out.println("PRONTO! Agora temos o filme " + nomeFilme + " em nossa biblioteca");
    }

    public void visualizarLucro(){
        System.out.println("OLHA SÓ! você já lucrou");
        System.out.println("R$ " + getLucro());
        System.out.println("Mandou bem :)");
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Jogo> getJogosLocadora() {
        return jogosLocadora;
    }

    public ArrayList<Filme> getFilmesLocadora() {
        return filmesLocadora;
    }

    public double getLucro() {
        return lucro;
    }

    private int retornaQuantidadeFilmesAlugados(){
        int I, quantidadeAlugados = 0;
        for (I = 0; I < this.filmesLocadora.size(); I++){
            if (!this.filmesLocadora.get(I).getDisponivel()){
                quantidadeAlugados++;
            }
        }

        return quantidadeAlugados;
    }

    private int retornaQuantidadeJogosAlugados(){
        int I, quantidadeAlugados = 0;
        for (I = 0; I < this.jogosLocadora.size(); I++){
            if (!this.jogosLocadora.get(I).getDisponivel()){
                quantidadeAlugados++;
            }
        }

        return quantidadeAlugados;
    }

    public void exibeJogosLocadora(){
        int I;
        System.out.println("==============================");
        System.out.println("       Jogos da Locadora      ");
        System.out.println("==============================");

        if (this.jogosLocadora.isEmpty()){
            System.out.println("> Que pena! Parece que nenhum jogo foi cadastrado...");
            System.out.println("Cadastre um jogo para visualizá-los aqui!");
            return;
        }

        for (I = 0; I < this.jogosLocadora.size(); I++){
            this.jogosLocadora.get(I).exibeInformacoesProduto();
        }

        System.out.println("--------------------------------");
        System.out.println("            ALUGADOS            ");
        System.out.println("--------------------------------");
        System.out.println(retornaQuantidadeJogosAlugados());
    }

    public void exibeFilmesLocadora(){
        int I;
        System.out.println("==============================");
        System.out.println("       Filmes da Locadora      ");
        System.out.println("==============================");

        if (this.filmesLocadora.isEmpty()){
            System.out.println("> Que pena! Parece que nenhum filme foi cadastrado...");
            System.out.println("Cadastre um filme para visualizá-los aqui!");
            return;
        }

        for (I = 0; I < this.filmesLocadora.size(); I++){
            this.filmesLocadora.get(I).exibeInformacoesProduto();
        }

        System.out.println("--------------------------------");
        System.out.println("            ALUGADOS            ");
        System.out.println("--------------------------------");
        System.out.println(retornaQuantidadeFilmesAlugados());
    }
}
