package assignment1;

public class Cougar extends Puma {
	public static void main(String[] args) {
		//Puma puma = new Puma();
		Puma puma = new Cougar();
		System.out.println(puma.getTailLength());
		
		Cougar cougar = new Cougar();
		System.out.println(cougar.getTailLength(3));
	}
	
	public int getTailLength(int length) {
		return 2;
	}
}
