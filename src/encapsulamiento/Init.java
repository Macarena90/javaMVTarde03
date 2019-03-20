package encapsulamiento;

class ControlVelocidad {
    private int velocidad = 0;
    public void incrementarVelocidad() {
        if (velocidad > 50) {
            return;
        }
        velocidad += 10;        
    }
    public void disminuirVelocidad() {
        if (velocidad <= 0) {
            return;
        }
        velocidad -= 10;
    }
    public void mostrarVelocidad() {
        System.out.println("La velocidad actual es: " + velocidad);
    }
}

public class Init {
    public static void main(String[] args) {
        ControlVelocidad controlVelocidad 
                    = new ControlVelocidad();
        
        controlVelocidad.incrementarVelocidad();
        controlVelocidad.incrementarVelocidad();
        controlVelocidad.incrementarVelocidad();
        controlVelocidad.incrementarVelocidad();
        controlVelocidad.incrementarVelocidad();
        controlVelocidad.incrementarVelocidad();
        controlVelocidad.incrementarVelocidad();
        controlVelocidad.incrementarVelocidad();
        controlVelocidad.incrementarVelocidad();
        controlVelocidad.mostrarVelocidad();
        
        
    }
}
