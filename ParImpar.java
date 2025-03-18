

public class ParImpar {

    /* Imprime por pantalla si numero es par o impar y la lista de números descendientes 
       hasta llegar al 1 (si es impar) o al 0 (si es par)*/    
    public static boolean leerNumero(int numero) {
        boolean esPar = (numero % 2 == 0);
        String str = esPar ? "par" : "impar";

        // Asumo que el número no será negativo ya que en el enunciado se menciona que la lista
        // debe ser descendiente.
        if(numero < 0) {
            throw new java.lang.NumberFormatException("El número no puede ser negativo.");
        } 

        System.out.println("El número es " + str + ". La lista es: ");

        for (int i = numero; i >= 0; i -= 2) {
            System.out.print(i + " ");
        }
        
        
        return esPar;
    }
    public static void main(String[] args) {
        try {
            int numero = Integer.parseInt(args[0]);
            leerNumero(numero);
        } catch(java.lang.NumberFormatException e) {

            System.out.println("El parámetro de entrada debe ser un número entero mayor que cero.");
        }
        
        

        
    }
}