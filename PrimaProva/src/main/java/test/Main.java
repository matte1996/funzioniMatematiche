package test;





public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 4;
		System.out.println("il numero inserito vale " + x);
		System.out.println("ne calcolo il quadrato " + calcolaQuadro(x));
		System.out.println("ne calcolo la metà " + calcolaMeta(x));
	}
		
public static int calcolaQuadro (int x) {
			
			int y = x * x;
			return y;
}

public static int calcolaMeta (int x) {
	
	int y = x / 2;
	return y;
}



}


