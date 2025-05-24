import java.util.ArrayList;

public class ListaAvengers {
        private ArrayList<Avenger> lista = new ArrayList<>();

        public void agregar(Avenger a) {
            lista.add(a);
        }

        public ArrayList<Avenger> getLista() {
            return lista;
        }

}
