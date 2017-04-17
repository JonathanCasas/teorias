/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teorias;

import TallerProgramacion.punto1;
import TallerProgramacion.punto3;
import TallerProgramacion.punto4;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author novatec
 */
public class Teorias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int opcion = 4;// se selecciona el ejercisio que se quiere ejecutar
        boolean aceptada = false;
        try {
            mostrar(bw, "Digite la cadena");
            String cadena = br.readLine();
            if (opcion == 1) {
                mostrar(bw, "Punto 1");
                punto1.cadena = cadena;
                aceptada = punto1.procesar();
            }
            if (opcion == 2) {
                mostrar(bw, "Punto 2");
            }
            if (opcion == 3) {
                mostrar(bw, "Punto 3");
                punto3.cadena = cadena;
                aceptada = punto3.procesar();
            }
            if (opcion == 4) {
                mostrar(bw, "Punto 4");
                punto4.cadena = cadena;
                aceptada = punto4.procesar();
            }
            if (aceptada) {
                mostrar(bw, "cadeba aceptada");
            } else {
                mostrar(bw, "cadeba rechazada");
            }

        } catch (IOException ex) {
            Logger.getLogger(Teorias.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void mostrar(BufferedWriter bw, String mensaje) throws IOException {
        bw.write(mensaje + "\r\n");
        bw.flush();
    }
    
}
