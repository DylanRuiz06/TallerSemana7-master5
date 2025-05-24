import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InformeAvenger {
    private JPanel jp;
    private JTextArea textArea1;
    private JButton button1;
    private JTextArea textArea2;
    private ListaAvengers lista; //lista donde posteriormente se guardará la información

    public InformeAvenger(ListaAvengers lista) {
        this.lista = lista;
            button1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    GenerarInforme();
                }
            });

    }

    public void GenerarInforme() {
        String IDBuscar = textArea1.getText();
        textArea1.setText("");
        StringBuilder sb = new StringBuilder(); //String builder donde se guardará la información
        boolean resultado = false; //variable para verificar si el avegner fue encontrado
        for (Avenger a : lista.getLista()) { //Se crea un for para recorrer la lista
                if (IDBuscar.isEmpty()) { //Detecta si el campo de búsqueda está vacío y envía un mensaje en caso de que suceda
                    JOptionPane.showMessageDialog(null, "Ingrese un ID válido. ");
                    return;
                }
                if (a.getID().equals(IDBuscar)) { //Se compara el Id ingresado con los Id de la lista
                    sb.append(a.toString()); //Una vez se encuentra se concatena la información
                    sb.append("Fondo Héroes: $" + a.CalcularFondoHeroes()).append("\n");
                    sb.append("Impuesto: $" + a.calcularImpuesto());
                    resultado = true;
                    break; //Romper el ciclo for una vez encontrado el Avenger.
                }

        }
        if (resultado) { //comprobar la variable resultado
            textArea2.setText(sb.toString()); //Muestra la información encontrada en el área de texto correspondiente
        } else {
            JOptionPane.showMessageDialog(null, "Avenger no encontrado.");
            textArea2.setText("");
        }


    }

    public JPanel getMainPanel() {
        return jp;
    }
}
