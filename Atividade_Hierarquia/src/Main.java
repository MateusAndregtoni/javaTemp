public class Main {
    public static void main(String[] args) {
        Lemure lemure = new Lemure("Rei Julian", 5, "Madagascar", "Muito");
        Mamba mamba = new Mamba("Venom", 10, "Floresta", "Longa");

        mamba.emitirSom();
        lemure.emitirSom();
    }
}