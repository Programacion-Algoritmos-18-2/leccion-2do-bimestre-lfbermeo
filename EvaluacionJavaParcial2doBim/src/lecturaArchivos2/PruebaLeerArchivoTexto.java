package lecturaArchivos2;

// Fig. 14.12: PruebaLeerArchivoTexto.java
import java.util.ArrayList;

public class PruebaLeerArchivoTexto {

    public static void main(String args[]) {
        //Creo el objeto tipo aplicacion
        LeerArchivoTexto aplicacion = new LeerArchivoTexto();
        //llamo a la función abrir archivo con la ruta donde se encuentra
        aplicacion.abrirArchivo("data/data1.csv");
        LeerArchivoTexto aplicacion2 = new LeerArchivoTexto();
        aplicacion2.abrirArchivo("data/data2.txt");
        //Creo el objeto tipo operacion
        OperacionData operacion = new OperacionData();
        //Creo un array lista tipo profesor donde llamo al metodo leer registro de cada uno de los archivos
        ArrayList<Profesor> lista = aplicacion2.leerRegistrosJson();
        ArrayList<Profesor> lista2 = aplicacion.leerRegistros();
        //Creo este array lista donde agrego la infromacion de los dos archivos txt y csv
        ArrayList<Profesor> lista_final = new ArrayList<>();
        lista_final.addAll(lista);
        lista_final.addAll(lista2);
        //Agrego la informacion a la lista final
        operacion.agregarInformacion(lista_final);
        // operacion.lecturaData();
        //Llamo al meotodo para que realice su función
        operacion.ordenarPorCanton();
        //Creo una nueva lista ordena por nombre
        ArrayList<Profesor> lista_nombres = operacion.ordenarPorNombres();
        //Creó un objeto 
        CrearData data_nueva = new CrearData();
        //Llamo a la función donde creamos la dirección y el nombre del nuevo archivo
        data_nueva.crear_data();
        //LLamamos a la funcón donde está la información d ela data
        data_nueva.agregarRegistros(lista_nombres);
        //cerramos el rachivo
        data_nueva.cerrarArchivo();
        //LLamo a los metodos ´para que realice su funcion
        operacion.obtenerParticipantePersonalidad();
        operacion.obtenerParticipanteDicta();
        // System.out.println("-------");
        // operacion.lecturaData();
        aplicacion.cerrarArchivo();
    } // fin de main
} // fin de la clase PruebaLeerArchivoTexto

