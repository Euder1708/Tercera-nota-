public class PasoPorValor {
    public static void main(String[] args) {
        int number=2;
        cambiarValor(number);
        System.out.println("El numero fuera del metodo es: " + number);
    }
//El paso por modifica el valor dentro de un metodo 
    public static void cambiarValor(int num){
        num = 3;
        System.out.println("El numero dentro del metodo es: " + num);
    }
}