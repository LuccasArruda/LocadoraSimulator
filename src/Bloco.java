import java.util.ArrayList;

public class Bloco {
    private String nome;
    private ArrayList<Sala> salas;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setSalas(ArrayList<Sala> salas) {
        this.salas = salas;
    }

    public ArrayList<Sala> getSalas() {
        return this.salas;
    }
}
