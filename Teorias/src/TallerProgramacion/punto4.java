package TallerProgramacion;

/**
 *
 * @author jonathan
 */
public class punto4 {

    public static String cadena;

    public static boolean procesar() {
        int tamanio = cadena.length();
        if (tamanio <= 0) {
            return false;
        }
        boolean aceptada = false;
        int index = 0;
        if (index < tamanio && cadena.charAt(index) == 'b') {//pasa de q0 a q1
            index++;
            while (index < tamanio && cadena.charAt(index) == 'b') {//bucle de q1 con b
                index++;
            }
            if (index < tamanio && cadena.charAt(index) == 'a') {//pasa de q1 a q2
                index++;
                aceptada = true;
                if (index < tamanio && cadena.charAt(index) == 'b') {//pasa de q2 a q3
                    index++;
                    while (index < tamanio && cadena.charAt(index) == 'b') {//bucle de q3 con b
                        index++;
                    }
                    if (index < tamanio) {//si no se executa el while se sobrepasaria al sumarle 1 y la idea es validar que no tenga caracteres diferentes a b
                        aceptada = false;
                    } else {
                        aceptada = true;
                    }
                } else if (index < tamanio && cadena.charAt(index) != 'b') {
                    aceptada = false;
                }
            }
        }
        return aceptada;

    }
}
