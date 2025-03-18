import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/* Esta clase genera  muestra una clasificación de 50 personas según edad y sexo. 
 * Estas 50 personas son generadas aleatoriamente.
*/
public class ClasificacionPersonas {
    public static void main(String[] args) {
        final int NUM_PERSONAS = 50;
        List<Persona> personas = generarPersonas(NUM_PERSONAS);

        int mayoresEdad = 0, menoresEdad = 0;
        int hombresMayores = 0, mujeresMenores = 0;
        int totalMujeres = 0;

        // Recorrer el array de personas y calcular estadísticas
        for (Persona p : personas) {
            if (p.edad >= 18) {
                mayoresEdad++;
                if (p.sexo == 'M') {
                    hombresMayores++;
                }
            } else {
                menoresEdad++;
                if (p.sexo == 'F') {
                    mujeresMenores++;
                }
            }
            if (p.sexo == 'F') {
                totalMujeres++;
            }
        }

        double porcentajeMayores = (mayoresEdad * 100.0) / NUM_PERSONAS;
        double porcentajeMujeres = (totalMujeres * 100.0) / NUM_PERSONAS;

        System.out.println("Cantidad de personas mayores de edad: " + mayoresEdad);
        System.out.println("Cantidad de personas menores de edad: " + menoresEdad);
        System.out.println("Cantidad de hombres mayores de edad: " + hombresMayores);
        System.out.println("Cantidad de mujeres menores de edad: " + mujeresMenores);
        System.out.println("Porcentaje de personas mayores de edad: " + porcentajeMayores + "%");
        System.out.println("Porcentaje de mujeres respecto al total: " + porcentajeMujeres + "%");
    }

    // Genera de manera aleatoria un array de 50 personas.
    public static List<Persona> generarPersonas(int numPersonas) {
        List<Persona> personas = new ArrayList<>();
        Random random = new Random();
        
        for (int i = 0; i < numPersonas; i++) {
            int edad = random.nextInt(100) + 1; // Edades entre 1 y 100 años
            char sexo = random.nextBoolean() ? 'M' : 'F';
            personas.add(new Persona(edad, sexo));
        }
        return personas;
    }
}