
public class Aluno {

    private String Ra;
    private String Nome;
    private float AC1;
    private float AC2;
    private float AG;
    private float AF;

    public String getRa() {
        return Ra;
    }

    public void setRa(String Ra) {
        this.Ra = Ra;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public float getAC1() {
        return AC1;
    }

    public void setAC1(float AC1) {
        this.AC1 = AC1;
    }

    public float getAC2() {
        return AC2;
    }

    public void setAC2(float AC2) {
        this.AC2 = AC2;
    }

    public float getAG() {
        return AG;
    }

    public void setAG(float AG) {
        this.AG = AG;
    }

    public float getAF() {
        return AF;
    }

    public void setAF(float AF) {
        this.AF = AF;
    }

    public float CalcularMedia() {
        return (AC1 * 0.15f + AC2 * 0.30f + AG * 0.10f + AF * 0.45f);
    }

    public String VerificarAprovacao() {

        if (CalcularMedia() >= 5) {
            return ("Aprovado");
        } else {
            return ("Reprovado");
        }
    }

    public String imprimir() {

        return "RA: " + Ra
                + "Nome: " + Nome + "AC1 " + AC1 + "AC2: " + AC2 + "AF: " + AF + "Média: " + CalcularMedia() + "Situação "
                + VerificarAprovacao();

    }

}
