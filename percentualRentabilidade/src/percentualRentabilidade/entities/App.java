package percentualRentabilidade.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		List<Percentual> list =  new ArrayList<>();
		
		System.out.println(" valor cota inicial ");
		double vci  = sc.nextDouble();
		
		System.out.println(" valor cota final ");
		double vcf = sc.nextDouble();
		
		System.out.println("");
		
		double percentual = (vcf - vci)/vci * 100;
		
		System.out.print(percentual);
		
		
	}

}
