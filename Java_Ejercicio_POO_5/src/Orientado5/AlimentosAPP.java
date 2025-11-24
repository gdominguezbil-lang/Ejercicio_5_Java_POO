package Orientado5;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.Locale;

public class AlimentosAPP {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		String linea = "";
		String[] cargas;
		int cantidadAli = 0;
		
		ArrayList<Alimentos> alimentosList = new ArrayList<Alimentos>();
		int numeritos;
		
		File file = new File("./src/alimentos.txt");
		try {
			
			Scanner scReader = new Scanner(file);
			while(scReader.hasNextLine()) {
				linea = scReader.nextLine().replace(",", ".");
				Alimentos Alimentos = new Alimentos();
				cargas = linea.split(";");
				Alimentos.setNombre(cargas[0]);
				Alimentos.setEstado(cargas[1]);
				Alimentos.setCalorias(Double.valueOf(cargas[2]));
				Alimentos.setGrasas(Double.valueOf(cargas[3]));
				Alimentos.setProteinas(Double.valueOf(cargas[4]));
				Alimentos.setCarbohidratos(Double.valueOf(cargas[5]));
				Alimentos.setTipo(cargas[6]);
				alimentosList.add(Alimentos);
				System.out.println(Alimentos.getNombre() + Alimentos.getEstado() + Alimentos.getCalorias() + Alimentos.getTipo());
				cantidadAli++;
			}
			System.out.println("Se han encontrado: " + cantidadAli + " alimentos...");
			scReader.close();
			
			do {
				System.out.println("=========[Menú de los alimentos]========\n[1]: Buscador de alimentos.\n[2]: Mostrar alimentos. La aplicación pedirá 2 números."
						+ "\n[3]: Calcular calorías.\n[4]: Salir");
				numeritos = Integer.parseInt(sc.nextLine());
				switch(numeritos) {
				case 1:
					buscarAlimentos(sc, alimentosList, cantidadAli);
					break;
				
				case 2:
					break;
					
				case 3:
					break;
					
				case 4:
					System.out.println("Gracias por utilizar el programa...");
					break;
				
				default:
					System.out.println("[!] Error: Introduce una opción de menú válida...");
				}
			} while(numeritos != 4);
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Error: No se ha encontrado el fichero [!]");
		}
		
		sc.close();
	}
	
	public static void buscarAlimentos(Scanner sc, ArrayList<Alimentos> alimentosList, int cantidad) {
		String introd;
		int pos = -1;
		System.out.println("/////////Introduzca el alimento deseado:\\\\\\\\\\");
		introd = sc.nextLine();
		for(int i = 0; i < cantidad; i++) {
			if(introd.equalsIgnoreCase(alimentosList.get(i).getNombre())) {
				pos = i;
				System.out.println("Calorías: " + alimentosList.get(pos).getCalorias());
				System.out.println("Estado: " + alimentosList.get(pos).getEstado());
				System.out.println("Grasas: " + alimentosList.get(pos).getGrasas());
				System.out.println("Proteinas: " + alimentosList.get(pos).getProteinas());
				System.out.println("Carbohidratos: " + alimentosList.get(pos).getCarbohidratos());
				System.out.println("Tipo: " + alimentosList.get(pos).getTipo());
				break;
			}
		}
		if(pos == -1) {
			System.out.println("[!] ERROR: no se ha encontrado ese alimento");
		}
	}

}
