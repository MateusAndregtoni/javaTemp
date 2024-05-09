public class Lemure extends Animal{
    String seRemecheMuito;

    public Lemure(String nome, int idade, String habitat, String seRemecheMuito) {
        super(nome, idade, habitat);
        this.seRemecheMuito = seRemecheMuito;
    }

    @Override
    public void emitirSom() {
        System.out.println("O Lêmure guincha");
    }
}
