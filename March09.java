package ForLoop;

import java.util.Scanner;

public class March09 {
	
	public static void main(String[] args) {
		
		int Inverter=6;
		int Non_Inverter=4;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Imput AC Numbers: ");
		
		int AC_Number = s.nextInt();
		for(int i=0; i<=AC_Number; i++) {
			
			String AC_Type=s.nextLine();
			System.out.println("Enter AC type: ");
		}
		System.out.println("Number of Inverter AC is: "+Inverter);
		System.out.println("Number of Non-Inverter AC is: "+Non_Inverter);
	}

}
