package Quest�esdo1ao6;

import java.util.Scanner;

public class Quest3 {
	
public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int idade = 0, grupo1 = 0, grupo2 = 0;
		
		while(idade <= 100) {
			System.out.println("Digite sua idade: ");
			idade = ler.nextInt();
			idade++;
			
			if(idade <=21) {
				grupo1= grupo1 +1;
				System.out.println("Quantidade de pessoas menor de idade: " + grupo1);
			}else if(idade >=51 && idade<=99) {
				grupo2 = grupo2 + 1;
				System.out.println("Quantidade de pessoas com mais de 50 anos: " + grupo2);
			}
		ler.close();
		}
	}

}
	

