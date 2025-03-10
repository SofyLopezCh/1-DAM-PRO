package compilador305_307;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import misClases.Utilidades.Leer;

public class compi307 {

    public static File asignaFicheroLectura(File fichero) {
        String nombreFichero = null;
        do {
            System.out.print("Nombre del fichero origen: ");
            nombreFichero = Leer.datoString();
            fichero = new File(nombreFichero);
        } while (!fichero.exists());
        return fichero;
    }

    public static File asignaFicheroEscritura(File fichero) {
        String nombreFichero = null;
        System.out.print("Nombre del fichero destino: ");
        nombreFichero = Leer.datoString();
        fichero = new File(nombreFichero);
        return fichero;
    }

    public static void amosa(File fichero) {
        FileReader fe = null;
        int caracter;
        try {
            fe = new FileReader(fichero);
            while ((caracter = fe.read()) != -1)
                System.out.print((char) caracter);
        } catch (IOException e) {
            System.out.println("Error: " + e.toString());
        } finally {
            try {
                if (fe != null)
                    fe.close();
            } catch (IOException e) {
                System.out.println("Error: " + e.toString());
            }
        }
    }

    public static void copia(File forigen, File fDestino) {
        FileReader fe = null;
        FileWriter fs = null;
        int caracter;
        try {
            fe = new FileReader(forigen);
            fs = new FileWriter(fDestino);
            while ((caracter = fe.read()) != -1)
                fs.write(caracter);
        } catch (IOException e) {
            System.out.println("Error: " + e.toString());
        } finally {
            try {
                if (fe != null)
                    fe.close();
                if (fs != null)
                    fs.close();
            } catch (IOException e) {
                System.out.println("Error: " + e.toString());
            }
        }
    }

    public static void main(String[] args) {
        File ficheroOrigen = null, ficheroDestino = null;
        ficheroOrigen = asignaFicheroLectura(ficheroOrigen);
        ficheroDestino = asignaFicheroEscritura(ficheroDestino);
        copia(ficheroOrigen, ficheroDestino);
        System.out.println("Copiado el fichero: " + ficheroOrigen.getName() + " en el fichero: "
                + ficheroDestino.getName());
        System.out.println("\nMostramos el fichero origen: " + ficheroOrigen.getName());
        amosa(ficheroOrigen);
        System.out.println("\nMostramos el fichero destino: " + ficheroDestino.getName());
        amosa(ficheroDestino);
    }
}