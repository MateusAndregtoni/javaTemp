public class Mamba extends Animal{
    String Tamanho;

    public Mamba(String nome, int idade, String habitat, String Tamanho) {
        super(nome, idade, habitat);
        this.Tamanho = Tamanho;
    }

    @Override
    public void emitirSom() {
        System.out.println("A Mamba-Negra chia");
    }
}
