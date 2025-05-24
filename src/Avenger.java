public class Avenger {
    private String ID;
    private String nombre;
    private Mision misionAsignada;
    private double pagoMensual;
    private double aporte;
    private double impuesto;

    public Avenger(String ID, String nombre, Mision misionAsignada, double pagoMensual) {//Creamos un constructor de Avenger
        this.ID = ID;
        this.nombre = nombre;
        this.misionAsignada = misionAsignada;
        this.pagoMensual = pagoMensual;
    }

    public String getID() {
        return ID;
    }

    public double CalcularFondoHeroes() {
        return pagoMensual * 0.08;
    } //Hacemos una funcion que retorne el fondo Heroes usando el pagonMensual

    public double calcularImpuesto() {
        double pagoAnual = pagoMensual * 12; //Calculamos el pago anual
        //Usamos ifs que verifiquen bajo que porcentaje esta y retorna cuanto debe pagar
        if (pagoAnual <= 50000) { //Si es menor o igual a 50000 no tiene que pagar
            return 0;
        } else if (pagoAnual <= 100000) { //Si es menor o igual a 100000 tiene que pagar el 10 %
            return (pagoAnual-50000) * 0.10;
        } else if (pagoAnual <= 200000) {//Si es menor o igual a 200000 tiene que pagar el 20 %
            return (pagoAnual-100000) * 0.20;
        } else { //Cualquiero otro caso mayor a 200000 paga el 30%
            return (pagoAnual-200000) * 0.30;
        }
    }

    public static String generarIdUnico(ListaAvengers listaAvengers) {
        String nuevoId; //Creamos una variable para guardar el nuevo id
        boolean repetido = false; // Usamos un booleanos para controlar las iteraciones

        do {
            int numero = (int)(Math.random() * 9000) + 1000; // Utilizamos Math.Random para que nos de un numero de 4 digitos
            nuevoId = String.valueOf(numero); //Transformamos a String

            for (Avenger a : listaAvengers.getLista()) { //Usamos un for each para recorre la lista
                if (a.getID().equals(nuevoId)) { //Obtenemos el id y lo comparamos con el nuevo
                    repetido = true; // Si son iguales repetido se cambia a true y acaba el ciclo
                    break; //Terminamos el for
                }
            }
        } while (repetido); //Creamos un do while con el valor booleano creado anteriormente ( si esta repetido se va a bolver a crear otro iD

        return nuevoId; //Retornamos el unevo ID
    }



    @Override
    public String toString() {
        return
                "ID: " + ID + "\n" +
                "Nombre: " + nombre + "\n" +
                "Mision Asignada: " + misionAsignada.getDescripcion() + "\n" +
                "Peligrosidad: " + misionAsignada.getNivelPeligrosidad() + "\n" +
                "Pago Mensual: $" + pagoMensual+ "\n";
    }
}
