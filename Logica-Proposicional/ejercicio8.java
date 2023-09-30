
public class ejercicio8 {
    /*
p: Todos los ángulos de un triángulo suman 180 grados.
q: El sol sale por el oeste.
Determine si las siguientes proposiciones son verdaderas o falsas:
a) p → q
b) p ∧ q
     */
    public static void main(String[] args) {
        boolean p = true;
        boolean q = false;
        boolean resultado1 = !p || q;
        boolean resultado2 = p && q;
        System.out.println("!p || q=" + resultado1);
        System.out.println("p && q=" + resultado2);

    }
}