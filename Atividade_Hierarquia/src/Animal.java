public class Animal {
    String nome;
    int idade;
    String habitat;

    public Animal(String nome, int idade, String habitat) {
        this.nome = nome;
        this.idade = idade;
        this.habitat = habitat;
    }

    public void emitirSom() {
        System.out.println("O animal faz um som");
    }
}
