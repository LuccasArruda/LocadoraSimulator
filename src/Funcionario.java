public class Funcionario {
    private String nome;
    private float salario;
    private int codigo;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getNome() {
        return this.nome;
    }

    public float getSalario() {
        return this.salario;
    }

    public int getCodigo() {
        return this.codigo;
    }
}
