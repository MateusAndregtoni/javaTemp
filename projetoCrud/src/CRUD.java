import java.util.ArrayList;

public class CRUD {
    private ArrayList<Registro> registros = new ArrayList<>();

    public void cadastrar(String nome, double peso, double preco) {
        registros.add(new Registro(nome, peso, preco));
    }

    public Registro localizar(String nome) {
        for (Registro registro : registros) {
            if (registro.getNome().equals(nome)) {
                return registro;
            }
        }
        return null;
    }

    public void editar(Registro registro, String nome, double peso, double preco) {
        registro.setNome(nome);
        registro.setPeso(peso);
        registro.setPreco(preco);
    }

    public void apagar(Registro registro) {
        registros.remove(registro);
    }

    public String listarTodos() {
        StringBuilder sb = new StringBuilder();
        for (Registro registro : registros) {
            sb.append(registro.toString()).append("\n");
        }
        return sb.toString();
    }

    public void gerarRegistrosFakes() {
        cadastrar("Produto1", 1.0, 10.0);
        cadastrar("Produto2", 2.0, 20.0);
        cadastrar("Produto3", 3.0, 30.0);
    }
}