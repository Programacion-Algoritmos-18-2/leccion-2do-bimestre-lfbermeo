
package lecturaArchivos2;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;

import com.google.gson.Gson;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;


public class CrearData {
    private PrintWriter salida_data;
    //Realicé este método para crear el nuevo archivo con la infromación de nombres ordenada
    public void crear_data() {
        try {
            //en este paso creamos un objeto donde utilizamos fromatter para la salida de datos 
             salida_data = new PrintWriter("data/data_ordenadaNombres.csv","UTF-8");
        } // fin de try
        
        catch (FileNotFoundException error) {
            System.err.println("No se encuentra el archivo");
            System.exit(1);
        } // fin de catch
        catch (UnsupportedEncodingException error) {
            System.out.println("Codificación incorrecta");
            System.exit(1);
        }
    } // fin del m�todo abrirArchivo
    //agregamos información tomando en cuenta el objeto profesor
    public void agregarRegistros(ArrayList<Profesor> lista_ordenada) { 
        //recorro a lista
        for (int i = 0; i < lista_ordenada.size(); i++) {
            //creo un objeto el cual agregare los objeto
            Profesor profesor = lista_ordenada.get(i);
            String linea = String.format("%s,%s,%s,%s,%s,%s,%s,%s", profesor.getCedula(), profesor.getNombres(), profesor.getZona(), profesor.getProvincia(), profesor.getCanton(), profesor.getPersonalidad(),profesor.getRazonamiento(),profesor.getDictamenIdoniedad());
            //la salida de os datos dandole espacios y llamando a cada uno de sus metodos creados par acada una de las variables
            salida_data.println(linea);
        }

    } 
    public void cerrarArchivo() {
        if (salida_data != null) {
            salida_data.close(); // cierra el archivo
        }
    }

}
