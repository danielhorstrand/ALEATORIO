import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner (System.in);

		System.out.println("Introduce €: ");
		int apuesta = in.nextInt();
		System.out.println("Introduce resultado apuesta: ");
		int resultado = in.nextInt();
		

		int dinero=0;		
		double random = Math.random();
		
		if (random<0.5 && resultado==1){
			dinero=(int)(apuesta*1.5);
			System.out.println("Ganaste apostando a ganar: "+dinero);
		}else {
			if (random>0.5 && random <0.8 && resultado==2){
				dinero=(int)(apuesta*2.5);
				System.out.println("Ganaste apostando al empate: "+dinero);
			}else {
				if (random>0.8 && random <1 && resultado==3){
					dinero=(int)(apuesta*3);
					System.out.println("Ganaste apostando a pierde: "+dinero);
				}else {
					System.out.println("Has perido mazo pasta!");
				}
			}
		}
	}

}
