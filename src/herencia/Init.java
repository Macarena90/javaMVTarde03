package herencia;

class A {
    public void decir() {
        System.out.println("soy A");
    }
}
class B extends A {
    public void decirCualquierCosaAgregado() {
        System.out.println("soy B");
    }
}
class C extends B {
    public void decir() {
        System.out.println("soy C");
    }
}

public class Init {
    public static void mostrarArray(B[] arr) {
        for (B b : arr) {
            b.decirCualquierCosaAgregado();
        }
    }
    public static void main(String[] args) {
        B[] arr = new B[] {
            new B(), new C(), new B(), new C(), new B()
        };
        mostrarArray(arr);
    }
}
