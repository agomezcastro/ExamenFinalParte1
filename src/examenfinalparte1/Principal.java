package examenfinalparte1;

public class Principal {

    int res;

    /** Constructor que almacena dos int en una variable
     * @param j
     * @param m 
     */
    public Principal(int j, int m) {
        res = met(j, m);
    }

    /** Constructor que almacena un int en una variable
     * el int repite el 2º valor
     * @param j 
     */
    public Principal(int j) {
        res = met(j, j);
    }

    /** Constructor que almacena una constante en una variable
     * 
     */
    public Principal() {
        res = -1;
    }

    /** Metodo que retorna siempre estos dos int
     * 
     * @param x
     * @param x1
     * @return 
     */
    public int met(int x, int x1) {
        return x + x1;
    }
}
