public class Aluno {
    private String nome;
    private String matricula;
    private int falta;
    private  double media;

    public Aluno(String nome, String matricula, int falta, double media) {
        this.nome = nome;
        this.matricula = matricula;
        this.falta = falta;
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getFalta() {
        return falta;
    }

    public void setFalta(int falta) {
        this.falta = falta;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
}
