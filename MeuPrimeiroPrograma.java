public class MeuPrimeiroPrograma {
	public static void main (String args[]) {
		//int x = 10;
		//int y = 25;
		//int z = x + y;
	    //System.out.println("Soma de x + y: " + z);
		//System.out.println("argumento 1: " + args[0] + "---" +args[1]);
		
		// for(int i= x; i< y; i++){
			//if(i%19 == 0){
				//System.out.println("Achei um numero divisivel por 19 entre x e y");
				//break;
			//}
		//}
		
		//for(int i =0; i<100;i++){
			//if(i>50 && i<60) {
				//continue;
			//}
			//Sistem.out.println(i);
		//}
		
		//  ------------------------------------
		// Exercicio 1) Imprima de 150 ate 300: 		
		
		//for(int i = 150; i<=300;i++){			
			//System.out.println(i);
		//}
		// -------------------------------------
		
		// Exercicio 2) Imprima a soma de 1 ate 100:		
		
		//int soma = 0;
		//for(int i = 0; i<=1000;i++){
			//soma += i;
			//System.out.println(soma);
		//}
		// -------------------------------------
		// Exercicio 3) Imprima todos os multiplos de 3, entre 1 ate 100: 
		
		//for(int i=0; i<100; i++){
			//if (i%3 == 0){
			//System.out.println( i + " e multiplo de 3");
			//}
		//}
		// -------------------------------------
		// Exercicio 4) Imprima os fatores de 1 até 10:
		
		int fatorial = 1;
		for(int n = 1;n <= 10; n++) {
			fatorial = fatorial *n;
			System.out.println("Fatorial de " +n+ "=" +fatorial);
		}
		
		
		
		
	}

}