import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class teclado {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce un nombre:");
		String nombre = scanner.nextLine();
		System.out.println("Introduce los apellidos:");
		String apellidos = scanner.nextLine();
		System.out.println("Introduce la edad:");
		int edad = scanner.nextInt();
		scanner.close();
		PersonasMaven p = new PersonasMaven(nombre,apellidos,edad);
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(p);
		System.out.println(json);
	}

}
