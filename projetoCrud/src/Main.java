import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        CRUD crud = new CRUD();

        JFrame frame = new JFrame("CRUD Swing");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JTextField nomeField = new JTextField();
        nomeField.setBounds(100, 10, 150, 30);
        frame.add(nomeField);

        JTextField pesoField = new JTextField();
        pesoField.setBounds(100, 50, 150, 30);
        frame.add(pesoField);

        JTextField precoField = new JTextField();
        precoField.setBounds(100, 90, 150, 30);
        frame.add(precoField);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(10, 150, 360, 100);
        frame.add(textArea);

        JButton addButton = new JButton("Add");
        addButton.setBounds(260, 10, 90, 30);
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                crud.cadastrar(nomeField.getText(), Double.parseDouble(pesoField.getText()), Double.parseDouble(precoField.getText()));
                textArea.setText(crud.listarTodos());
            }
        });
        frame.add(addButton);

        JButton deleteButton = new JButton("Delete");
        deleteButton.setBounds(260, 50, 90, 30);
        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Registro registro = crud.localizar(nomeField.getText());
                if (registro != null) {
                    crud.apagar(registro);
                    textArea.setText(crud.listarTodos());
                }
            }
        });
        frame.add(deleteButton);

        JButton editButton = new JButton("Edit");
        editButton.setBounds(260, 90, 90, 30);
        editButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Registro registro = crud.localizar(nomeField.getText());
                if (registro != null) {
                    crud.editar(registro, nomeField.getText(), Double.parseDouble(pesoField.getText()), Double.parseDouble(precoField.getText()));
                    textArea.setText(crud.listarTodos());
                }
            }
        });
        frame.add(editButton);

        JButton generateButton = new JButton("Generate");
        generateButton.setBounds(10, 120, 120, 30);
        generateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                crud.gerarRegistrosFakes();
                textArea.setText(crud.listarTodos());
            }
        });
        frame.add(generateButton);

        JButton showButton = new JButton("Show All");
        showButton.setBounds(140, 120, 100, 30);
        showButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setText(crud.listarTodos());
            }
        });
        frame.add(showButton);

        JButton searchButton = new JButton("Search");
        searchButton.setBounds(250, 120, 100, 30);
        searchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Registro registro = crud.localizar(nomeField.getText());
                if (registro != null) {
                    pesoField.setText(String.valueOf(registro.getPeso()));
                    precoField.setText(String.valueOf(registro.getPreco()));
                } else {
                    JOptionPane.showMessageDialog(frame, "Registro não encontrado!");
                }
            }
        });
        frame.add(searchButton);

        frame.setVisible(true);
    }
}
