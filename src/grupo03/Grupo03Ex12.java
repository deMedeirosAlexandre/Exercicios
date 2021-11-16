package grupo03;

import java.util.Random;

//42.	Aproveitando o algoritmo do exercício anterior, 
//exiba uma lista de 40 grupos de números sorteados de 0 a 59. 
//Cada grupo possui 3 números e deve exibido em ordem crescente.

public class Grupo03Ex12 {
	public static void main (String[] args) {		
		
		Random aleatorio = new Random();	
		
		int[] grupo1 = new int [3];
		int[] grupo2 = new int [3];
		int[] grupo3 = new int [3];	
		int[] grupo4 = new int [3];
		int[] grupo5 = new int [3];
		int[] grupo6 = new int [3];
		int[] grupo7 = new int [3];
		int[] grupo8 = new int [3];
		int[] grupo9 = new int [3];
		int[] grupo10 = new int [3];
		int[] grupo11 = new int [3];
		int[] grupo12 = new int [3];
		int[] grupo13 = new int [3];
		int[] grupo14 = new int [3];
		int[] grupo15 = new int [3];
		int[] grupo16 = new int [3];
		int[] grupo17 = new int [3];
		int[] grupo18 = new int [3];
		int[] grupo19 = new int [3];
		int[] grupo20 = new int [3];
		int[] grupo21 = new int [3];
		int[] grupo22 = new int [3];
		int[] grupo23 = new int [3];	
		int[] grupo24 = new int [3];
		int[] grupo25 = new int [3];
		int[] grupo26 = new int [3];
		int[] grupo27 = new int [3];
		int[] grupo28 = new int [3];
		int[] grupo29 = new int [3];
		int[] grupo30 = new int [3];
		int[] grupo31 = new int [3];
		int[] grupo32 = new int [3];
		int[] grupo33 = new int [3];
		int[] grupo34 = new int [3];
		int[] grupo35 = new int [3];
		int[] grupo36 = new int [3];
		int[] grupo37 = new int [3];
		int[] grupo38 = new int [3];
		int[] grupo39 = new int [3];
		int[] grupo40 = new int [3];		
		int maior1 = 0;
		int menor1 = 0;
		int meio1 = 0;		
		int maior2 = 0;
		int menor2 = 0;
		int meio2 = 0;		
		int maior3 = 0;
		int menor3 = 0;
		int meio3 = 0;		
		int maior4 = 0;
		int menor4 = 0;
		int meio4 = 0;		
		int maior5 = 0;
		int menor5 = 0;
		int meio5 = 0;		
		int maior6 = 0;
		int menor6 = 0;
		int meio6 = 0;		
		int maior7 = 0;
		int menor7 = 0;
		int meio7 = 0;		
		int maior8 = 0;
		int menor8 = 0;
		int meio8 = 0;		
		int maior9 = 0;
		int menor9 = 0;
		int meio9 = 0;		
		int maior10 = 0;
		int menor10 = 0;
		int meio10 = 0;		
		int maior11 = 0;
		int menor11 = 0;
		int meio11 = 0;		
		int maior12 = 0;
		int menor12 = 0;
		int meio12 = 0;		
		int maior13 = 0;
		int menor13 = 0;
		int meio13 = 0;		
		int maior14 = 0;
		int menor14 = 0;
		int meio14 = 0;		
		int maior15 = 0;
		int menor15 = 0;
		int meio15 = 0;		
		int maior16 = 0;
		int menor16 = 0;
		int meio16 = 0;		
		int maior17 = 0;
		int menor17 = 0;
		int meio17 = 0;		
		int maior18 = 0;
		int menor18 = 0;
		int meio18 = 0;		
		int maior19 = 0;
		int menor19 = 0;
		int meio19 = 0;		
		int maior20 = 0;
		int menor20 = 0;
		int meio20 = 0;		
		int maior21 = 0;
		int menor21 = 0;
		int meio21 = 0;		
		int maior22 = 0;
		int menor22 = 0;
		int meio22 = 0;		
		int maior23 = 0;
		int menor23 = 0;
		int meio23 = 0;		
		int maior24 = 0;
		int menor24 = 0;
		int meio24 = 0;		
		int maior25 = 0;
		int menor25 = 0;
		int meio25 = 0;		
		int maior26 = 0;
		int menor26 = 0;
		int meio26 = 0;		
		int maior27 = 0;
		int menor27 = 0;
		int meio27 = 0;		
		int maior28 = 0;
		int menor28 = 0;
		int meio28 = 0;		
		int maior29 = 0;
		int menor29 = 0;
		int meio29 = 0;		
		int maior30 = 0;
		int menor30 = 0;
		int meio30 = 0;		
		int maior31 = 0;
		int menor31 = 0;
		int meio31 = 0;		
		int maior32 = 0;
		int menor32 = 0;
		int meio32 = 0;		
		int maior33 = 0;
		int menor33 = 0;
		int meio33 = 0;		
		int maior34 = 0;
		int menor34 = 0;
		int meio34 = 0;		
		int maior35 = 0;
		int menor35 = 0;
		int meio35 = 0;		
		int maior36 = 0;
		int menor36 = 0;
		int meio36 = 0;		
		int maior37 = 0;
		int menor37 = 0;
		int meio37 = 0;		
		int maior38 = 0;
		int menor38 = 0;
		int meio38 = 0;		
		int maior39 = 0;
		int menor39 = 0;
		int meio39 = 0;		
		int maior40 = 0;
		int menor40 = 0;
		int meio40 = 0;		
			
		for(int i = 0; i <= 2; i++) {				
			grupo1 [i] = aleatorio.nextInt(60);				
			if(grupo1 [i] >= maior1) {
				maior1 = grupo1 [i];					
			}
			if(grupo1 [i] <= grupo1[0]) {
				menor1 = grupo1[i];
			}
			if(grupo1[i] >= menor1 && grupo1[i] <= maior1) {
				meio1 = grupo1[i];
			}				
			grupo2 [i] = aleatorio.nextInt(60);
			if(grupo2 [i] >= maior2) {
				maior2 = grupo2 [i];					
			}
			if(grupo2 [i] <= grupo2[0]) {
				menor2 = grupo2[i];
			}
			if(grupo2[i] >= menor2 && grupo2[i] <= maior2) {
				meio2 = grupo2[i];
			}				
			grupo3 [i] = aleatorio.nextInt(60);
			if(grupo3 [i] >= maior3) {
				maior3 = grupo3 [i];					
			}
			if(grupo3 [i] <= grupo3[0]) {
				menor3 = grupo3[i];
			}
			if(grupo3[i] >= menor3 && grupo3[i] <= maior3) {
				meio3 = grupo3[i];
			}				
			grupo4 [i] = aleatorio.nextInt(60);
			if(grupo4 [i] >= maior4) {
				maior4 = grupo4 [i];					
			}
			if(grupo4 [i] <= grupo4[0]) {
				menor4 = grupo4[i];
			}
			if(grupo4[i] >= menor4 && grupo4[i] <= maior4) {
				meio4 = grupo4[i];
			}				
			grupo5 [i] = aleatorio.nextInt(60);
			if(grupo5 [i] >= maior5) {
				maior5 = grupo5 [i];					
			}
			if(grupo5 [i] <= grupo5[0]) {
				menor5 = grupo5[i];
			}
			if(grupo5[i] >= menor5 && grupo5[i] <= maior5) {
				meio5 = grupo5[i];
			}				
			grupo6 [i] = aleatorio.nextInt(60);
			if(grupo6 [i] >= maior6) {
				maior6 = grupo6 [i];					
			}
			if(grupo6 [i] <= grupo6[0]) {
				menor6 = grupo6[i];
			}
			if(grupo6[i] >= menor6 && grupo6[i] <= maior6) {
				meio6 = grupo6[i];
			}				
			grupo7 [i] = aleatorio.nextInt(60);
			if(grupo7 [i] >= maior7) {
				maior7 = grupo7 [i];					
			}
			if(grupo7 [i] <= grupo7[0]) {
				menor7 = grupo7[i];
			}
			if(grupo7[i] >= menor7 && grupo7[i] <= maior7) {
				meio7 = grupo7[i];
			}				
			grupo8 [i] = aleatorio.nextInt(60);
			if(grupo8 [i] >= maior8) {
				maior8 = grupo8 [i];					
			}
			if(grupo8 [i] <= grupo8[0]) {
				menor8 = grupo8[i];
			}
			if(grupo8[i] >= menor8 && grupo8[i] <= maior8) {
				meio8 = grupo8[i];
			}				
			grupo9 [i] = aleatorio.nextInt(60);
			if(grupo9 [i] >= maior9) {
				maior9 = grupo9 [i];					
			}
			if(grupo9 [i] <= grupo9[0]) {
				menor9 = grupo9[i];
			}
			if(grupo9[i] >= menor9 && grupo9[i] <= maior9) {
				meio9 = grupo9[i];
			}				
			grupo10 [i] = aleatorio.nextInt(60);
			if(grupo10 [i] >= maior10) {
				maior10 = grupo10 [i];					
			}
			if(grupo10 [i] <= grupo10[0]) {
				menor10 = grupo10[i];
			}
			if(grupo10[i] >= menor10 && grupo10[i] <= maior10) {
				meio10 = grupo10[i];
			}				
			grupo11 [i] = aleatorio.nextInt(60);
			if(grupo11 [i] >= maior11) {
				maior11 = grupo11 [i];					
			}
			if(grupo11 [i] <= grupo11 [0]) {
				menor11 = grupo11[i];
			}
			if(grupo11 [i] >= menor11 && grupo11[i] <= maior11) {
				meio11 = grupo11[i];
			}				
			grupo12 [i] = aleatorio.nextInt(60);
			if(grupo12 [i] >= maior12) {
				maior12 = grupo12 [i];					
			}
			if(grupo12 [i] <= grupo12[0]) {
				menor12 = grupo12[i];
			}
			if(grupo12[i] >= menor12 && grupo12[i] <= maior12) {
				meio12 = grupo12[i];
			}				
			grupo13 [i] = aleatorio.nextInt(60);
			if(grupo13 [i] >= maior13) {
				maior13 = grupo13 [i];					
			}
			if(grupo13 [i] <= grupo13[0]) {
				menor13 = grupo13[i];
			}
			if(grupo13[i] >= menor13 && grupo13[i] <= maior13) {
				meio13 = grupo13[i];
			}				
			grupo14 [i] = aleatorio.nextInt(60);
			if(grupo14 [i] >= maior14) {
				maior14 = grupo14 [i];					
			}
			if(grupo14 [i] <= grupo14[0]) {
				menor14 = grupo14[i];
			}
			if(grupo14[i] >= menor14 && grupo14[i] <= maior14) {
				meio14 = grupo14[i];
			}				
			grupo15 [i] = aleatorio.nextInt(60);
			if(grupo15 [i] >= maior15) {
				maior15 = grupo15 [i];					
			}
			if(grupo15 [i] <= grupo15[0]) {
				menor15 = grupo15[i];
			}
			if(grupo15[i] >= menor15 && grupo15[i] <= maior15) {
				meio15 = grupo15[i];
			}
			grupo16 [i] = aleatorio.nextInt(60);
			if(grupo16 [i] >= maior16) {
				maior16 = grupo16 [i];					
			}
			if(grupo16 [i] <= grupo16[0]) {
				menor16 = grupo16[i];
			}
			if(grupo16[i] >= menor16 && grupo16[i] <= maior16) {
				meio16 = grupo16[i];
			}				
			grupo17 [i] = aleatorio.nextInt(60);
			if(grupo17 [i] >= maior17) {
				maior17 = grupo17 [i];					
			}
			if(grupo17 [i] <= grupo17[0]) {
				menor17 = grupo17[i];
			}
			if(grupo17[i] >= menor17 && grupo17[i] <= maior17) {
				meio17 = grupo17[i];
			}
				
			grupo18 [i] = aleatorio.nextInt(60);
			if(grupo18 [i] >= maior18) {
				maior18 = grupo18 [i];					
			}
			if(grupo18 [i] <= grupo18[0]) {
				menor18 = grupo18[i];
			}
			if(grupo18[i] >= menor18 && grupo18[i] <= maior18) {
				meio18 = grupo18[i];
			}				
			grupo19 [i] = aleatorio.nextInt(60);
			if(grupo19 [i] >= maior19) {
				maior19 = grupo19 [i];					
			}
			if(grupo19 [i] <= grupo19[0]) {
				menor19 = grupo19[i];
			}
			if(grupo19[i] >= menor19 && grupo19[i] <= maior19) {
				meio19 = grupo19[i];
			}
				
			grupo20 [i] = aleatorio.nextInt(60);
			if(grupo20 [i] >= maior20) {
				maior20 = grupo20 [i];					
			}
			if(grupo20 [i] <= grupo20[0]) {
				menor20 = grupo20[i];
			}
			if(grupo20[i] >= menor20 && grupo20[i] <= maior20) {
				meio20 = grupo20[i];
			}				
			grupo21 [i] = aleatorio.nextInt(60);
			if(grupo21 [i] >= maior21) {
				maior21 = grupo21 [i];					
			}
			if(grupo21 [i] <= grupo21[0]) {
				menor21 = grupo21[i];
			}
			if(grupo21[i] >= menor21 && grupo21[i] <= maior21) {
				meio21 = grupo21[i];
			}				
			grupo22 [i] = aleatorio.nextInt(60);
			if(grupo22 [i] >= maior22) {
				maior22 = grupo22 [i];					
			}
			if(grupo22 [i] <= grupo22[0]) {
				menor22 = grupo22[i];
			}
			if(grupo22[i] >= menor22 && grupo22[i] <= maior22) {
				meio22 = grupo22[i];
			}				
			grupo23 [i] = aleatorio.nextInt(60);
			if(grupo23 [i] >= maior23) {
				maior23 = grupo23 [i];					
			}
			if(grupo23 [i] <= grupo23[0]) {
				menor23 = grupo23[i];
			}
			if(grupo23[i] >= menor23 && grupo23[i] <= maior23) {
				meio23 = grupo23[i];
			}				
			grupo24 [i] = aleatorio.nextInt(60);
			if(grupo24 [i] >= maior24) {
				maior24 = grupo24 [i];					
			}
			if(grupo24 [i] <= grupo24[0]) {
				menor24 = grupo24[i];
			}
			if(grupo24[i] >= menor24 && grupo24[i] <= maior24) {
				meio24 = grupo24[i];
			}				
			grupo25 [i] = aleatorio.nextInt(60);
			if(grupo25 [i] >= maior25) {
				maior25 = grupo25 [i];					
			}
			if(grupo25 [i] <= grupo25[0]) {
				menor25 = grupo25[i];
			}
			if(grupo25[i] >= menor25 && grupo25[i] <= maior25) {
				meio25 = grupo25[i];
			}				
			grupo26 [i] = aleatorio.nextInt(60);
			if(grupo26 [i] >= maior26) {
				maior26 = grupo26 [i];					
			}
			if(grupo26 [i] <= grupo26[0]) {
				menor26 = grupo26[i];
			}
			if(grupo26[i] >= menor26 && grupo26[i] <= maior26) {
				meio26 = grupo26[i];
			}				
			grupo27 [i] = aleatorio.nextInt(60);
			if(grupo27 [i] >= maior27) {
				maior27 = grupo27 [i];					
			}
			if(grupo27 [i] <= grupo27[0]) {
				menor27 = grupo27[i];
			}
			if(grupo27[i] >= menor27 && grupo27[i] <= maior27) {
				meio27 = grupo27[i];
			}				
			grupo28 [i] = aleatorio.nextInt(60);
			if(grupo28 [i] >= maior28) {
				maior28 = grupo28 [i];					
			}
			if(grupo28 [i] <= grupo28[0]) {
				menor28 = grupo28[i];
			}
			if(grupo28[i] >= menor28 && grupo28[i] <= maior28) {
				meio28 = grupo28[i];
			}				
			grupo29 [i] = aleatorio.nextInt(60);
			if(grupo29 [i] >= maior29) {
				maior29 = grupo29 [i];					
			}
			if(grupo29 [i] <= grupo29[0]) {
				menor29 = grupo29[i];
			}
			if(grupo29[i] >= menor29 && grupo29[i] <= maior29) {
				meio29 = grupo29[i];
			}				
			grupo30 [i] = aleatorio.nextInt(60);
			if(grupo30 [i] >= maior30) {
				maior30 = grupo30 [i];					
			}
			if(grupo30 [i] <= grupo30[0]) {
				menor30 = grupo30[i];
			}
			if(grupo30[i] >= menor30 && grupo30[i] <= maior30) {
				meio30 = grupo30[i];
			}				
			grupo31 [i] = aleatorio.nextInt(60);
			if(grupo31 [i] >= maior31) {
				maior31 = grupo31 [i];					
			}
			if(grupo31 [i] <= grupo31[0]) {
				menor31 = grupo31[i];
			}
			if(grupo31[i] >= menor31 && grupo31[i] <= maior31) {
				meio31 = grupo31[i];
			}				
			grupo32 [i] = aleatorio.nextInt(60);
			if(grupo32 [i] >= maior32) {
				maior32 = grupo32 [i];					
			}
			if(grupo32 [i] <= grupo32[0]) {
				menor32 = grupo32[i];
			}
			if(grupo32[i] >= menor32 && grupo32[i] <= maior32) {
				meio32 = grupo32[i];
			}				
			grupo33 [i] = aleatorio.nextInt(60);
			if(grupo33 [i] >= maior33) {
				maior33 = grupo33 [i];					
			}
			if(grupo33 [i] <= grupo33[0]) {
				menor33 = grupo33[i];
			}
			if(grupo33[i] >= menor33 && grupo33[i] <= maior33) {
				meio33 = grupo33[i];
			}				
			grupo34 [i] = aleatorio.nextInt(60);
			if(grupo34 [i] >= maior34) {
				maior34 = grupo34 [i];					
			}
			if(grupo34 [i] <= grupo34[0]) {
				menor34 = grupo34[i];
			}
			if(grupo34[i] >= menor34 && grupo34[i] <= maior34) {
				meio34 = grupo34[i];
			}				
			grupo35 [i] = aleatorio.nextInt(60);
			if(grupo35 [i] >= maior35) {
				maior35 = grupo35 [i];					
			}
			if(grupo35 [i] <= grupo35[0]) {
				menor35 = grupo35[i];
			}
			if(grupo35[i] >= menor35 && grupo35[i] <= maior35) {
				meio35 = grupo35[i];
			}				
			grupo36 [i] = aleatorio.nextInt(60);
			if(grupo36 [i] >= maior36) {
				maior36 = grupo36 [i];					
			}
			if(grupo36 [i] <= grupo36[0]) {
				menor36 = grupo36[i];
			}
			if(grupo36[i] >= menor36 && grupo36[i] <= maior36) {
				meio36 = grupo36[i];
			}				
			grupo37 [i] = aleatorio.nextInt(60);
			if(grupo37 [i] >= maior37) {
				maior37 = grupo37 [i];					
			}
			if(grupo37 [i] <= grupo37[0]) {
				menor37 = grupo37[i];
			}
			if(grupo37[i] >= menor37 && grupo37[i] <= maior37) {
				meio37 = grupo37[i];
			}				
			grupo38 [i] = aleatorio.nextInt(60);
			if(grupo38 [i] >= maior38) {
				maior38 = grupo38 [i];					
			}
			if(grupo38 [i] <= grupo38[0]) {
				menor38 = grupo38[i];
			}
			if(grupo38[i] >= menor38 && grupo38[i] <= maior38) {
				meio38 = grupo38[i];
			}				
			grupo39 [i] = aleatorio.nextInt(60);
			if(grupo39 [i] >= maior39) {
				maior39 = grupo39 [i];					
			}
			if(grupo39 [i] <= grupo39[0]) {
				menor39 = grupo39[i];
			}
			if(grupo39[i] >= menor39 && grupo39[i] <= maior39) {
				meio39 = grupo39[i];
			}				
			grupo40 [i] = aleatorio.nextInt(60);
			if(grupo40 [i] >= maior40) {
				maior40 = grupo40 [i];					
			}
			if(grupo40 [i] <= grupo40[0]) {
				menor40 = grupo40[i];
			}
			if(grupo40[i] >= menor40 && grupo40[i] <= maior40) {
				meio40 = grupo40[i];
			}				
			}	
			
		System.out.println(menor1 + " " +  meio1 + " " +  maior1);		
		System.out.println(menor2 + " " +  meio2 + " " +  maior2);		
		System.out.println(menor3 + " " +  meio3 + " " +  maior3);		
		System.out.println(menor4 + " " +  meio4 + " " +  maior4);		
		System.out.println(menor5 + " " +  meio5 + " " +  maior5);		
		System.out.println(menor6 + " " +  meio6 + " " +  maior6);		
		System.out.println(menor7 + " " +  meio7 + " " +  maior7);		
		System.out.println(menor8 + " " +  meio8 + " " +  maior8);		
		System.out.println(menor9 + " " +  meio9 + " " +  maior9);		
		System.out.println(menor10 + " " +  meio10 + " " +  maior10);		
		System.out.println(menor11 + " " +  meio11 + " " +  maior11);		
		System.out.println(menor12 + " " +  meio12 + " " +  maior12);		
		System.out.println(menor13 + " " +  meio13 + " " +  maior13);		
		System.out.println(menor14 + " " +  meio14 + " " +  maior14);		
		System.out.println(menor15 + " " +  meio15 + " " +  maior15);		
		System.out.println(menor16 + " " +  meio16 + " " +  maior16);		
		System.out.println(menor17 + " " +  meio17 + " " +  maior17);		
		System.out.println(menor18 + " " +  meio18 + " " +  maior18);		
		System.out.println(menor19 + " " +  meio19 + " " +  maior19);		
		System.out.println(menor20 + " " +  meio20 + " " +  maior20);				
		System.out.println(menor21 + " " +  meio21 + " " +  maior21);		
		System.out.println(menor22 + " " +  meio22 + " " +  maior22);		
		System.out.println(menor23 + " " +  meio23 + " " +  maior23);				
		System.out.println(menor24 + " " +  meio24 + " " +  maior24);		
		System.out.println(menor25 + " " +  meio25 + " " +  maior25);		
		System.out.println(menor26 + " " +  meio26 + " " +  maior26);		
		System.out.println(menor27 + " " +  meio27 + " " +  maior27);		
		System.out.println(menor28 + " " +  meio28 + " " +  maior28);		
		System.out.println(menor29 + " " +  meio29 + " " +  maior29);		
		System.out.println(menor30 + " " +  meio30 + " " +  maior30);		
		System.out.println(menor31 + " " +  meio31 + " " +  maior31);		
		System.out.println(menor32 + " " +  meio32 + " " +  maior32);		
		System.out.println(menor33 + " " +  meio33 + " " +  maior33);		
		System.out.println(menor34 + " " +  meio34 + " " +  maior34);		
		System.out.println(menor35 + " " +  meio35 + " " +  maior35);		
		System.out.println(menor36 + " " +  meio36 + " " +  maior36);		
		System.out.println(menor37 + " " +  meio37 + " " +  maior37);		
		System.out.println(menor38 + " " +  meio38 + " " +  maior38);		
		System.out.println(menor39 + " " +  meio39 + " " +  maior39);		
		System.out.println(menor40 + " " +  meio40 + " " +  maior40);		
	}
}