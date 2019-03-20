package sobrecargademetodos;

public class OperacionesMatematicas {
    public int suma(int x, int y) {
        return x + y;
    }
    public int suma(int x, int y, int z) {
        return x + y + z;
    }
    public int suma(int[] arrEnteros) {
        int acumulador = 0;
        for (int x : arrEnteros) {
            acumulador += x;
        }
        return acumulador;
    }
}
