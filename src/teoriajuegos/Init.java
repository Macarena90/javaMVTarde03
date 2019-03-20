package teoriajuegos;

import java.util.Random;

class Jugada {
    private static int randomizar() {
        int a = new Random().nextInt(37);
        return a;
    }
    public static void jugar_a_todo_o_nada(long cantidad) throws InterruptedException {
        System.out.println("El jugador pone: " + cantidad);
        System.out.println("Suspenso...");
        Thread.sleep(3000);
        int x = randomizar();
        System.out.println("Salio el " + x);
        if (x==0) {
            System.out.println("Salio zerapio voy por mas...");
            jugar_a_todo_o_nada(cantidad * 2);
            return;
        }
        if ((x % 2)==0) {
            System.out.println("Salio par voy por mas...");
            jugar_a_todo_o_nada(cantidad * 2);
            return;
        }
        System.out.println("Gane pero tuve que poner: " + cantidad + " fichas");
    }
}


public class Init {
    
    public static void main(String[] args) throws InterruptedException {
        for (;;) {
            Jugada.jugar_a_todo_o_nada(1);
            Thread.sleep(5000);
        }
    }
}
