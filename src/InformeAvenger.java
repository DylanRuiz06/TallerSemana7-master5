import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InformeAvenger {
    private JPanel jp;
    private JTextArea textArea1;
    private JButton button1;
    private JTextArea textArea2;
    private ListaAvengers lista;

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
        StringBuilder sb = new StringBuilder();
        for (Avenger a : lista.getLista()) {
            try {
                if (IDBuscar.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Ingrese un ID válido. ");
                }else
                if (a.getID().equals(IDBuscar)) {
                    sb.append(a.toString());
                    sb.append("Fondo Héroes: $" + a.CalcularFondoHeroes()).append("\n");
                    sb.append("Impuesto: $" + a.calcularImpuesto());
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Avenger no encontrado.");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No hay Avengers registrados");
            }

        }

        textArea2.setText(sb.toString());
    }

    public JPanel getMainPanel() {
        return jp;
    }
}
