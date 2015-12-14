package homework_01;

public class homework_01 {
	
	private static int[] splice(int[] array) {
		int[] result = new int[array.length-1];
		for(int i=0;i<result.length;i++) {
			result[i] = array[i+1];
		}
		return result;
	}
	/*
	Esercizio 1
	Dato un array di interi, restituire la loro somma fino a che non viene ritrovato un valore
	negativo
*/
	static int ex_1_i(int[]myarray){
		int somma=0;
		for(int i=0;i< myarray.length;i++){		
			if(myarray[i]>0){	
				somma += myarray[i];		
			}else{
				i=myarray.length;	
			}	
		}	
       return somma;
	}
	
	static int ex_1_r(int[]myarray){
		
		if(myarray.length==0){
			return 0;
		}else{
			return myarray[0]+ex_1_r(splice(myarray));
		}
	}
	/*
	  Esercizio 2
      Dato un numero n, restituire la somma dei primi n numeri interi positivi dispari
	 */	
	static int ex_2_i(int n){
		int somma=0;
		for(int i=0;i<n;i++){
			somma +=(2*i)+1;			
		}		
		return somma;
	}
	static int ex_2_r(int n){
		if(n==0){
			return 0;
		}else {
			return (2*n)-1+ex_2_r(n-1);
		}
	}	
	/*
	 * Esercizio 3
       Dato un array di 10 elementi, calcolarne la media
	 */
	static double ex_3_i(int[] myarray){
		double somma=0;
		
		for(int i=0;i<myarray.length;i++){
			somma += myarray[i];		
		}
		somma=somma/myarray.length;
		return somma;
	}

	static double ex_3_r(int[] myarray){
		
		if(myarray.length==0){
			return 0;
		}else{
			return myarray[0]+ex_3_r(splice(myarray));
		}	
	}
	/* Esercizio 4
	 * Dato un intervallo [a, b] con a e b due interi positivi, restituire la somma di tutti i numeri
       compresi all’interno dell’intervallo, estremi inclusi. Nel caso che b fosse minore di a,
       calcolare la somma nell’intervallo [b,a]
       Esempio:				a, b
  				sumInterval(3, 5) => 12
				sumInterval(5, 3) => 12
	 */
	static int ex_4_i(int a,int b){
		int somma=0;
		int c = 0;
		
		if(a>b){	
			c=b;
			b=a;
			a=c;		
		}	
		for(;a<=b;a++){
			somma +=a;	
		}
		return somma;
	}
	
	static int ex_4_r(int a,int b){
		if(a==b){
			return b;
		}else {
			if(a>b){	
				int c=b;
				b=a;
				a=c;		
			}		
			return a+ex_4_r(a+1,b);
		}
	}
	
	
	
	public static void main(String[] args) {
		
		int[] array1 = {1,2,3,-2,2};
		int[] media = {0,1,2,3,4,5,6,7,8,9};
		
		System.out.println("Eserczio 1_I: "+ex_1_i(array1));
		System.out.println("Eserczio 1_I: "+ex_1_r(array1));
		
		System.out.println("\nEsercizio 2_I "+ex_2_i(2));
		System.out.println("Esercizio 2_R "+ex_2_r(2));
		
		System.out.println("\nEsercizio 3_I: "+ex_3_i(media));
		System.out.println("Esercizio 3_I: "+ex_3_r(media));
		
		System.out.println("\nEsercizio 4_I: "+ex_4_i(5,3));
		System.out.println("Esercizio 4_r: "+ex_4_r(5,3));
		 
	}

}
