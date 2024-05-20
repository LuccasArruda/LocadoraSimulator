import java.util.ArrayList;

public class Aula {
    private ArrayList<Aluno> alunos;
    private Professor professor;
    private String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public ArrayList<Aluno> getAlunos() {
        return this.alunos;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Professor getProfessor() {
        return this.professor;
    }

    public String getNome() {
        return this.nome;
    }
}
