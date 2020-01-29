import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner (System.in);
		
		for (int i=1;i<15;i++){
			
			double quiniela= Math.random();	
			if (quiniela*100<33){
				System.out.println("Resultado "+i+" = 1");
			}else {
				if (quiniela*100<66){
					System.out.println("Resultado "+i+" = 2");
				}else {
					System.out.println("Resultado "+i+" = X");
				}
			}
		}
	}

}
