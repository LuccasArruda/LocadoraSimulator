package LocadoraSimulator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locadora locadora;
        Scanner ler;
        int opcaoSelecionada;
        String nomeLocadora;
        System.out.println("                                     ");
        System.out.println(" __                  _               ");
        System.out.println("|  |   ___ ___ ___ _| |___ ___ ___   ");
        System.out.println("|  |__| . |  _| .'| . | . |  _| .'|  ");
        System.out.println("|_____|___|___|__,|___|___|_| |__,|  ");
        System.out.println("                                     ");
        System.out.println("                                     ");
        System.out.println(" _____ _           _     _           ");
        System.out.println("|   __|_|_____ _ _| |___| |_ ___ ___ ");
        System.out.println("|__   | |     | | | | .'|  _| . |  _|");
        System.out.println("|_____|_|_|_|_|___|_|__,|_| |___|_|  ");
        System.out.println("                                     ");

        System.out.println("Dê um nome para sua nova locadora!");
        ler = new Scanner(System.in);
        nomeLocadora = ler.nextLine();
        locadora = new Locadora(nomeLocadora);

        while (true){
            System.out.println("============================================");
            System.out.println("   Bom dia amigo! O que deseja fazer hoje?   ");
            System.out.println("============================================");
            System.out.println("[1] - Adicionar um novo jogo");
            System.out.println("[2] - Adicionar um novo filme");
            System.out.println("[3] - Alugar um filme");
            System.out.println("[4] - Alugar um jogo");
            System.out.println("[5] - Exibir todos os jogos da locadora");
            System.out.println("[6] - Exibir todos os filmes da locadora");
            System.out.println("[7] - Devolver jogo");
            System.out.println("[8] - Devolver filme");

            opcaoSelecionada = ler.nextInt();
            if (opcaoSelecionada == 1){
                locadora.adicionarJogo(ler);
            } else if(opcaoSelecionada == 2){
                locadora.adicionarFilme(ler);
            } else if(opcaoSelecionada == 3){
                locadora.alugarFilme(ler);
            } else if (opcaoSelecionada == 4){
                locadora.alugarJogo(ler);
            } else if (opcaoSelecionada == 5) {
                locadora.exibeJogosLocadora();
            } else if (opcaoSelecionada == 6) {
                locadora.exibeFilmesLocadora();
            }
        }
    }
}