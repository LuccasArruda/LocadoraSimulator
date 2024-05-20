public class Professor extends Funcionario{
    private int aulasPorSemana;
    private String formacao;

    public void setAulasPorSemana(int aulasPorSemana) {
        this.aulasPorSemana = aulasPorSemana;
    }

    public int getAulasPorSemana() {
        return this.aulasPorSemana;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getFormacao() {
        return this.formacao;
    }
}
