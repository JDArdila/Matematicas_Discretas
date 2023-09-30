
public class ejercicio9 {
        /*
p: Todos los mamíferos son vertebrados.
q: Las serpientes son mamíferos.
Determine si las siguientes proposiciones son verdaderas o falsas:
a) p ∨ q
b) ¬q
     */
    public static void main(String[] args) {
        boolean p = false;
        boolean q = false;
        boolean resultado1 = p || q;
        boolean resultado2 = !q;
        System.out.println("p || q=" + resultado1);
        System.out.println("!q=" + resultado2);

    }
}