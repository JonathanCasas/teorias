package TallerProgramacion;

/**
 *
 * @author jonathan
 */
public class punto3 {

    public static String cadena = "";

    public static boolean procesar() {
        boolean aceptada = false;
        int tamanio = cadena.length();
        if (tamanio <= 0) {//como el estado q0 no es estado de aceptacion, la cadena no puede ser vacia
            return false;
        }
        int index = 0;
        if (index < tamanio && cadena.charAt(index) == '1') {//pasa al estado q4
            index += 1;
            aceptada = true;//al momento de pasar de q0 a q4 como q4 es estado de aceptacion seria aceptada
            while (index < tamanio) {//como la parte siguiente del automata es un bucle se realiza este while
                //si la posicion actual no es menor significa que la cadena no tiene mas caracteres y es aceptada
                if (index < tamanio && cadena.charAt(index) == '1') {//si tiene mas caracteres entonces debe ser 1 y seria rechazada hasta el momento cambia a q3
                    index += 1;
                    aceptada = false;
                    while (index < tamanio && cadena.charAt(index) == '0') {//bucle de 0 en el estado q3
                        index++;
                    }
                    if (index < tamanio && cadena.charAt(index) == '1') {//cambia al estado q4 y vuelve a ser aceptada
                        index += 1;
                        aceptada = true;
                    }
                }
            }
        } else if (index < tamanio && cadena.charAt(index) == '0') {//siguiente parte del automata donde la cadena inica en 0 y pasa al estado q5
            index += 1;
            aceptada = true;
            while (index < tamanio) {
                if (index < tamanio && cadena.charAt(index) == '1') {//avanza de q5 a q7 con 1
                    index += 1;
                    if (index < tamanio && cadena.charAt(index) == '0') {//avanza de q7 a q2
                        index += 1;
                        while (index < tamanio) {
                            while (index < tamanio && cadena.charAt(index) == '1') {//bucle de 1's en q2
                                index += 1;
                            }
                            if (index < tamanio && cadena.charAt(index) == '0') {//avanza de q2 a q1
                                index += 1;
                                aceptada = false;
                                while (index < tamanio && cadena.charAt(index) == '1') {//bucle de 1's en  q1
                                    index += 1;
                                }
                                if (index < tamanio && cadena.charAt(index) == '0') {//se devuelve de q1 a q2
                                    index += 1;
                                    aceptada = true;
                                }
                            }
                        }
                    } else if (index < tamanio && cadena.charAt(index) == '1') {//se devuelve de q7 a q5
                        index += 1;
                    } else {
                        aceptada = false;
                        break;
                    }
                } else if (index < tamanio && cadena.charAt(index) == '0') {//avanza de q5 a q6
                    index++;
                    aceptada = false;
                    if (index < tamanio && cadena.charAt(index) == '1') {//avanza de q6 a q8
                        index++;
                        aceptada = true;
                        if (index < tamanio && cadena.charAt(index) == '0') {//avanza de q8 a q2
                            index++;
                            while (index < tamanio) {
                                while (index < tamanio && cadena.charAt(index) == '1') {//bucle de 1's en q2
                                    index += 1;
                                }
                                if (index < tamanio && cadena.charAt(index) == '0') {//avanza de q2 a q1
                                    index += 1;
                                    aceptada = false;
                                    while (index < tamanio && cadena.charAt(index) == '1') {//bucle de 1's en  q1
                                        index += 1;
                                    }
                                    if (index < tamanio && cadena.charAt(index) == '0') {//se devuelve de q1 a q2
                                        index += 1;
                                        aceptada = true;
                                    }
                                }
                            }
                        } else if (index < tamanio && cadena.charAt(index) == '1') {//se devuelve de q8 a q6
                            index++;
                            aceptada = false;
                        }
                    } else if (index < tamanio && cadena.charAt(index) == '0') {//se devuelve de q6 a q5
                        index++;
                        aceptada = true;
                    }
                }
            }
        }
        return aceptada;
    }
}
