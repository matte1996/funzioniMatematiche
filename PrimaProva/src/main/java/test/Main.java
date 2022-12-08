package test;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 8;
		System.out.println("Il numero inserito è " + x);
		System.out.println("ne calcolo il quadrato " + calcolaQuadro(x));
		System.out.println("ne calcolo la meta  " + calcolaMeta(x));
		System.out.println("ne calcolo il doppio " + calcolaRaddoppio(x));
		System.out.println("L'area del cerchio di raggio " + x + " vale "+ calcolaAreaCerchio(x));

	}
	
public static Double calcolaAreaCerchio (double x) {
		
		double y = x * x *Math.PI;
		return y;
}
		
public static int calcolaQuadro (int x) {
			
			int y = x * x;
			return y;
}

public static int calcolaMeta (int x) {
	
	int y = x / 2;
	return y;
}
	
public static int calcolaRaddoppio (int x) {
	
	int y = x * 2;
	return y;
}



}


