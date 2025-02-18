import java.util.Scanner;


public class calculo {

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite Sua Nota do 1 Trimestre:");
		double primeiraNota = sc.nextDouble();

		System.out.println("Digite Sua Nota do 2 Trimestre:");
		double segundaNota = sc.nextDouble();

		System.out.println("Digite Sua Nota do 3 Trimestre:");
		double terceiraNota = sc.nextDouble();

		 double resultadoNota = (primeiraNota + segundaNota + terceiraNota) / 3;

		 System.out.println("---------------------------------");
		 System.out.println("Resultado:");

		System.out.println(resultadoNota);

	}
}	