package test;





public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ciao");
		int x = 4;
		System.out.println(calcolaQuadro(x));
		System.out.println(calcolaMeta(x));
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


