
public class ejercicio6 {
    /*
p: Todos los triángulos son cuadriláteros.
q: Algunos cuadriláteros son círculos.
Determine si las siguientes proposiciones son verdaderas, falsas o contradictorias:
a) p ∨ q
b) p ∧ q
     */
    public static void main(String[] args) {
        boolean p = false;
        boolean q = false;
        boolean resultado1 = p || q;
        boolean resultado2 = p && q;
        System.out.println("p || q=" + resultado1);
        System.out.println("p && q=" + resultado2);

    }
}