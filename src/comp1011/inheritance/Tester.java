package comp1011.inheritance;

public class Tester {
	public static void main(String[] args){
		ComissionEmployee ce = new ComissionEmployee("Anju", "Chawla", "123456789", 1000.0, 0.5);
		BasePlusComissionEmployee bce = new BasePlusComissionEmployee("Luis", "Acevedo", "987654321", 2000.0, 0.2, 2000.0);
		
		System.out.println(ce);
		System.out.printf("\n");
		System.out.println(bce);
		System.out.printf("\n");
		bce.dummy();
		
		
	}
	
}
