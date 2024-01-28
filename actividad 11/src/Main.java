
public class Main {

	public static void main(String[] args) {
		  // Crear instancias de Persona
        Persona persona1 = new Persona("Juan", "Calle Principal 123", 30);
        Persona persona2 = new Persona();

        // Imprimir detalles de las personas
        System.out.println("Detalles de persona1:");
        System.out.println(persona1.toString());

        System.out.println("\nDetalles de persona2:");
        System.out.println(persona2.toString());

        // Crear instancias de Estudiante
        Estudiante estudiante1 = new Estudiante("María", "Avenida Secundaria 456", 25, "E123");
        Estudiante estudiante2 = new Estudiante();

        // Imprimir detalles de los estudiantes
        System.out.println("\nDetalles de estudiante1:");
        System.out.println(estudiante1.toString());

        System.out.println("\nDetalles de estudiante2:");
        System.out.println(estudiante2.toString());

        // Crear instancias de EstudianteInt
        EstudianteInt estudianteInt1 = new EstudianteInt("Pedro", "Plaza Central 789", 20, "EI456", true, "frances");
        EstudianteInt estudianteInt2 = new EstudianteInt("Ana", "Calle Secundaria 012", 22, "EI789", false, "americano");

        // Imprimir detalles de los estudiantes internacionales
        System.out.println("\nDetalles de estudianteInt1:");
        System.out.println(estudianteInt1.toString());

        System.out.println("\nDetalles de estudianteInt2:");
        System.out.println(estudianteInt2.toString());

        // Probar método descuentoParaJovenes de EstudianteInt
        System.out.println("\n¿EstudianteInt1 tiene descuento para jóvenes? " + estudianteInt1.descuentoParaJovenes());
        System.out.println("¿EstudianteInt2 tiene descuento para jóvenes? " + estudianteInt2.descuentoParaJovenes());
    }

}
