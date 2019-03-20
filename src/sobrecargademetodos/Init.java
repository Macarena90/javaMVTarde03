package sobrecargademetodos;

public class Init {
    public static void main(String[] args) {
        OperacionesMatematicas operaciones = 
                new OperacionesMatematicas();
        
        int resultado = 0;
        
        resultado = operaciones.suma(2, 3);
        System.out.println(resultado);
        
        resultado = operaciones.suma(3, 4, 5);
        System.out.println(resultado);
        
        resultado = operaciones.suma(new int[] {4,3,2,1,2,54});
        System.out.println(resultado);
    }
}
