import javax.swing.*;

public class ListarAvengers {
    private JPanel mainPanel;
    private JTextArea textArea1;
    private ListaAvengers lista; //Creamos una lista para guardar la informacion que vamos a llamar mas adelante

    public ListarAvengers(ListaAvengers lista) { //Creamos un constructor para pasar la lista desde el form principal y mantener los datos
        this.lista = lista; // Guardamos la lista recibida desde el formulario principal


        StringBuilder sb = new StringBuilder();// Creamos un StringBuilder para guardar la informacion
        for (Avenger a : lista.getLista()) { //Usamos un for each para recorre la lista
            sb.append(a.toString()).append("\n"); //Agregamos la informacion de el avenger con to String al StringBuilder
        }

        textArea1.setText(sb.toString()); // Mostramos el Stringbuilder a el textArea1
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }
}
