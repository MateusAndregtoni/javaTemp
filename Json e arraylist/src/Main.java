import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<Arma> lista = new ArrayList<>();
        lista.add(new Arma("Avtomat Kalashnikova", "1947", 3.8F, 7.62F));
        lista.add(new Arma("M1911", "1940", 1.15F, 0.45F));

        gravarListaComoJson(lista);

        List<Arma> listaLida = lerListaDeJson();
        if (listaLida != null) {
            System.out.println("Lista lida do arquivo JSON:");
            for (Arma arma : listaLida) {
                System.out.println(arma.getNome());
            }
        }
    }

    public static void gravarListaComoJson(List<Arma> lista) {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (FileWriter writer = new FileWriter("lista.json")) {

            gson.toJson(lista, writer);
            System.out.println("Lista gravada como JSON com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Arma> lerListaDeJson() {
        List<Arma> lista = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("lista.json"))) {
            
            Gson gson = new GsonBuilder().create();


            Type tipoLista = new TypeToken<ArrayList<Arma>>() {}.getType();
            lista = gson.fromJson(reader, tipoLista);

            System.out.println("Lista lida do arquivo JSON com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return lista;
    }
}