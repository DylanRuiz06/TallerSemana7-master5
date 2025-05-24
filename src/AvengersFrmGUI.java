import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AvengersFrmGUI {
    private JButton agregarAvengerButton;
    private JPanel panel1;
    private JButton modificarDatosButton;
    private JButton listarAvengersButton;
    private JButton calcularAporteButton;

    private ListaAvengers listaAvengers = new ListaAvengers(); // instanciamos la lista que se va a usar para todos los forms

    public AvengersFrmGUI() {
        agregarAvengerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CrearAvenger crearAvengerForm = new CrearAvenger(listaAvengers); //Mandamos la listaAvengers como parametro para mantener los datos
                JFrame frame = new JFrame("Crear Avenger");
                frame.setContentPane(crearAvengerForm.getMainPanel());
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });

        listarAvengersButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ListarAvengers listarAvengersForm = new ListarAvengers(listaAvengers); //Mandamos la listaAvengers como parametro para mantener los datos
                JFrame frame = new JFrame("Listar Avengers");
                frame.setContentPane(listarAvengersForm.getMainPanel());
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
        calcularAporteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InformeAvenger informeAvengerForm = new InformeAvenger(listaAvengers); //Enviar la listaAvengers como parametro para mantener los datos
                JFrame frame = new JFrame("Informe Avenger");
                frame.setContentPane(informeAvengerForm.getMainPanel());
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }

    public JPanel getMainPanel() {
        return panel1;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("AvengersFrmGUI");
        frame.setContentPane(new AvengersFrmGUI().getMainPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
