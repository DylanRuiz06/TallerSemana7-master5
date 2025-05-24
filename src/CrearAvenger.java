import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CrearAvenger {
    private JPanel mainPanel;
    private JTextField NombreTxt;
    private JTextField MisionTxt;
    private JTextField PeligrosidadTxt;
    private JTextField PagoTxt;
    private JButton registrarButton;
    private JLabel Lable2;
    private JLabel Label3;


    private ListaAvengers lista; //Creamos una lista para guardar la informacion que vamos a llamar mas adelante

    public CrearAvenger(ListaAvengers lista) { //Creamos un constructor para pasar la lista desde el form principal y mantener los datos
        this.lista = lista;// Guardamos la lista recibida desde el formulario principal

        registrarButton.addActionListener(new ActionListener() { //Creamos un ActionListener para el boron
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    //Guardamos los valores que ingreso el usuario a variables
                    String nombre = NombreTxt.getText();
                    String mision = MisionTxt.getText();
                    String peligrosidad = PeligrosidadTxt.getText();
                    double pago = Double.parseDouble(PagoTxt.getText()); //En esta linea convertimos de String a Double

                    String ID = Avenger.generarIdUnico(lista);//Usamos la funcion generaridUnico para crear un id

                    lista.agregar(new Avenger(ID, nombre, new Mision(mision, peligrosidad), pago)); //Instanciamos un nuevo oAvenger y lo agregamos a la lista

                    JOptionPane.showMessageDialog(null, "Agregado exitosamente");//Mostramos que se aniadio correctamente
                    //Usamos setText para vacias los campos de texto
                    NombreTxt.setText("");
                    MisionTxt.setText("");
                    PeligrosidadTxt.setText("");
                    PagoTxt.setText("");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Error al registrar el Avenger"); //Mostramos que hubo un error si lo hay
                }
            }
        });
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }
}

