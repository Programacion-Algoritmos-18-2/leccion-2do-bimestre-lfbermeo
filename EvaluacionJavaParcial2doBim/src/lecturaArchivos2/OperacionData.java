package lecturaArchivos2;

import java.util.ArrayList;
import java.util.Collections;

public class OperacionData {

    ArrayList<Profesor> informacion = new ArrayList<>();

    public void agregarInformacion(ArrayList<Profesor> info) {
        //informacion = new ArrayList<Profesor>(info.subList(1, 50));
        //toma toda la infromación
        informacion = info;
    }

    public ArrayList<Profesor> obtenerInformacion() {
        return informacion;
    }

    public double obtenerPromedioCapacidad() {
        double suma = 0;
        return suma;
    }

    // proceso de ordenar, a través del uso de Collections
    public void ordenarPorCanton() {
        ArrayList<Profesor> dataPorCantones = new ArrayList<>();
        dataPorCantones.addAll(informacion);
        //Ordena la infromación 
        Collections.sort(dataPorCantones,
                (o1, o2) -> o1.canton.compareTo(o2.canton));
        for (int i = 0; i < dataPorCantones.size(); i++) {
            System.out.println(dataPorCantones.get(i));
        }
    }
    //funcion para ordenar por nombres donde retorna una lista
    public ArrayList<Profesor> ordenarPorNombres() {
        ArrayList<Profesor> dataPorNombres = new ArrayList<>();
        dataPorNombres.addAll(informacion);
        Collections.sort(dataPorNombres,
                (o1, o2) -> o1.nombres.compareTo(o2.nombres));
        return dataPorNombres;

    }

    public void lecturaData() {
        for (int i = 0; i < obtenerInformacion().size(); i++) {
            System.out.println(obtenerInformacion().get(i));

        }

    }
//Funcion que no permite contar cuantas personas son dependiendo del atributo
    public void obtenerParticipantePersonalidad() {
        int cont_ade = 0;
        int cont_con = 0;
        for (Profesor profesor : informacion) {
            if (profesor.getPersonalidad().equalsIgnoreCase("ADECUADO")) {
                cont_ade += 1;
            } else if (profesor.getPersonalidad().equalsIgnoreCase("POR CONVOCAR")) {
                cont_con += 1;

            }

        }
        String cadena = String.format("Adecuado:%d\nPor convocar:%d\n", cont_ade, cont_con);
        System.out.print(cadena);
    }

    public void obtenerParticipanteDicta() {
        int cont_ido = 0;
        int cont_noido = 0;
        for (Profesor profesor : informacion) {

            if (profesor.getDictamenIdoniedad().equalsIgnoreCase("IDONEO")) {
                cont_ido += 1;
            } else if (profesor.getDictamenIdoniedad().equalsIgnoreCase("NO IDONEO")) {
                cont_noido += 1;
            }

        }
        String cadena = String.format("Idoneo:%d\nNo idoneo :%d\n", cont_ido, cont_noido);
        System.out.print(cadena);
    }

}
