package grupo03;

//49.	Exiba os 50 primeiros números da seqüência de Fibonacci (1,1,2,3,5,8,13,21,34,55,89,144,233,377,...).


public class Grupo03Ex19 {
	public static void main (String[] args) {
		
		
		long sequenciaDeFionacci = 0; 
		long sequenciaDeFionacciAnterior = 1;
				
		for(int i = 1; i <= 50; i++) {
			
			sequenciaDeFionacci = sequenciaDeFionacci  + sequenciaDeFionacciAnterior;
			sequenciaDeFionacciAnterior = sequenciaDeFionacci - sequenciaDeFionacciAnterior;			
			System.out.println(i + "º número: " + sequenciaDeFionacci);			
		}		
	}

}
