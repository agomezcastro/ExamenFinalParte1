package examenfinalparte1;

import java.io.IOException;

public class Prin {
    
    /**Clase main donde se ejecuta el programa
     * mostrando los resultados
     * @param args
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {
        Principal obj = new Principal(10, 20);
        int result1 = obj.res;
        System.out.println("Es: " + result1);
        Principal nm = new Principal(10);
        int result2 = nm.res;
        System.out.println("Es: " + result2);
        Principal mn = new Principal();
        int result3 = mn.res;
        System.out.println("Es: " + result3);
    }
}
