package unit03.repaso;

import java.util.Locale;

public class Ejercicio03 {
    public static void main(String[] args) {
        //Texto
        String texto = "En un pequeño pueblo rodeado de colinas verdes y ríos cristalinos, los habitantes vivían con una calma y una rutina que parecía no alterarse nunca. " +
                "Cada mañana, los niños corrían por las calles empedradas mientras los panaderos encendían sus hornos y el aroma a pan recién hecho se esparcía por todo el vecindario. " +
                "Los ancianos se sentaban en los bancos de la plaza, compartiendo historias de épocas pasadas y consejos para los más jóvenes, mientras los comerciantes abrían sus tiendas " +
                "y saludaban con una sonrisa a los clientes habituales. A pesar de la tranquilidad aparente, siempre había un leve bullicio de actividad: el sonido de las campanas de la " +
                "iglesia, el tintineo de los utensilios de la herrería y el murmullo del río cercano que atravesaba el pueblo. Por las tardes, cuando el sol comenzaba a esconderse detrás " +
                "de las colinas, las familias se reunían para cenar, intercambiar noticias y planear pequeñas aventuras para el día siguiente, y aunque la vida parecía sencilla, cada día " +
                "estaba lleno de momentos únicos que hacían que el pueblo conservara su magia y su encanto a lo largo de los años.";

        //Palabras clave
        String[] palabrasClave = {
                "pueblo",     // del texto
                "colinas",    // del texto
                "río",        // del texto
                "niños",      // del texto
                "ancianos",   // del texto
                "ciudad",     // no aparece
                "bosque",     // no aparece
                "profesor",   // no aparece
                "familias",   // del texto
                "montaña"     // no aparece
        };

        String[] encontradas = palabrasEncontradas(texto, palabrasClave); //Llamada a la función palabrasEncontradas

        System.out.println("Las palabras encontradas en el texto son: ");
        mostrarResultado(encontradas); //Mostramos el resultado llamando a la función mostrarResultado
    }

    /**
     * Función que devuelve true si el texto contiene la palabra
     * @param texto --> Cadena que contiene el texto donde se buscará la palabra
     * @param palabra --> Cadena con la palabra que queremos buscar
     * @return --> Si encontramos la palabra, devolvemos true, si no la encontramos devolvemos false
     */
    static boolean contienePalabra(String texto, String palabra){
        String[] palabrasTexto = texto.toLowerCase().trim().split(" "); //Metemos dentro de un array todas las palabras del texto
        for(String p : palabrasTexto){ //Recorremos las palabras del array
            if (palabra.equalsIgnoreCase(p)){ //Comprobamos si la palabra actual es igual a la dada
                return true; //Devolvemos true
            }
        }
        return false; //Devolvemos false
    }

    /**
     * Función que devuelve un array con las palabras que aparecen en el texto
     * @param texto --> Texto
     * @param claves --> Claves que tenemos que buscar en el texto
     * @return --> Devolvemos el array con las palabras encontradas
     */
    static String[] palabrasEncontradas(String texto, String[] claves){
        int longitudArray = 0; //Inicializamos la variable que contiene la longitud del array a 0

        for (String palabra : claves){ //Recorremos las claves
            if (contienePalabra(texto, palabra)){ //Comprobamos si el texto contiene la palabra
                longitudArray ++; //Sumamos 1 a la longitud del array
            }
        }
        String[] palabrasTexto = new String[longitudArray]; //Creación del array

        int indice = 0; //Inicializamos la variable índice a 0
        for (String palabra: claves){ //Recorremos las claves
            if(contienePalabra(texto, palabra)){ //Comprobamos si la clave se encuentra en el texto
                palabrasTexto[indice] = palabra; //Guardamos la palabra en el array
                indice ++; //Sumamos 1 al índice
            }
        }
        return palabrasTexto; //Devolvemos las palabras claves que aparecen en el texto
    }

    /**
     * Función que muestra las palabras encontradas separadas por comas
     * @param encontradas --> Array que contiene las palabras encontradas
     */
    static void mostrarResultado(String[] encontradas){
        if (encontradas.length == 0){ //Comprobamos si el array está vacío
            System.out.println("No se encontró ninguna palabra."); //Mostramos un mensaje
        } else { //Caso en el que el array no esté vacío
            String palabras = String.join(", ", encontradas); //Separamos las palabras por comas
            System.out.print(palabras); //Mostramos las palabras
        }
    }
}