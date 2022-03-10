package ForLoop;

import java.util.Scanner;

public class March09 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Imput AC Numbers: ");
		int AC_Number = s.nextInt();
		for(int i=0; i<AC_Number; i++) {
			System.out.println("Enter AC type: ");
			String AC_Type=s.nextLine();
		}
		System.out.println("Number of Inverter AC is 6");
		System.out.println("Number of Inverter AC is 4");
	}

}
