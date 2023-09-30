public class ejercicio7 {
    /*
p: Los números primos son divisibles por 2.
q: 7 es un número impar.
Determine si las siguientes proposiciones son verdaderas o falsas:
a) p → q
b) p ∨ q

     */
    public static void main(String[] args) {
        boolean p = false;
        boolean q = true;
        boolean resultado1 = !p || q;
        boolean resultado2 = p || q;
        System.out.println("!p || q=" + resultado1);
        System.out.println("p || q=" + resultado2);

    }
}