import java.util.Scanner;

public class CalculoSalario {

    // Método para leer las horas trabajadas
    public static int leerHorasTrabajadas(Scanner scanner) {
        System.out.print("Ingrese la cantidad de horas trabajadas: ");
        return scanner.nextInt();
    }

    // Método para leer la tarifa por hora
    public static double leerTarifa(Scanner scanner) {
        System.out.print("Ingrese la tarifa (€/hora): ");
        return scanner.nextDouble();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Crear un único Scanner
        int horasTrabajadas;
        double tarifa;
        try {
            // Recuperar horas trabajadas y tarifa
            horasTrabajadas = leerHorasTrabajadas(scanner);
            tarifa = leerTarifa(scanner);
                
            // Calcular sueldo
            double sueldo;
            if (horasTrabajadas > 40) {
                int horasExtras = horasTrabajadas - 40;
                sueldo = (40 * tarifa) + (horasExtras * tarifa * 1.5);
            } else {
                sueldo = horasTrabajadas * tarifa;
            }
    
            // Mostrar resultado
            System.out.println("El sueldo total es: " + sueldo + " €");
    
            scanner.close();  // Cerrar el Scanner al final
            
        
        } catch (Exception e) {
            System.out.println("* ERROR: Las Horas trabajadas deben ser un número entero y la Tarifa debe ser un double con separador decimal: ','.");
        }       
    }
}
