
public class ejercicio12 {
        /*
p: Los triángulos equiláteros tienen tres lados iguales.
q: 5 es un número primo.
Determine si las siguientes proposiciones son verdaderas o falsas:
a) p ∧ q 
b) ¬q
     */
    public static void main(String[] args) {
        boolean p = true;
        boolean q = true;
        boolean resultado1 = p && q;
        boolean resultado2 = !q;
        System.out.println("p && q=" + resultado1);
        System.out.println("!q=" + resultado2);

    }
}
