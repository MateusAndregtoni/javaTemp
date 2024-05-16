public class Arma { private String nome;
    private String ano;
    private float peso;
    private float calibre;

    public Arma(String nome, String ano, float peso, float calibre) {
        this.nome = nome;
        this.ano = ano;
        this.peso = peso;
        this.calibre = calibre;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getCalibre() {
        return calibre;
    }

    public void setCalibre(float calibre) {
        this.calibre = calibre;
    }
}
