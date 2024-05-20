import java.util.ArrayList;

public class Faculdade {
    public String nome;
    public ArrayList<Bloco> blocos;

    public String getNome() {
        return this.nome;
    }

    public ArrayList<Bloco> getBlocos() {
        return blocos;
    }

    public void setBlocos(ArrayList<Bloco> blocos) {
        this.blocos = blocos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
