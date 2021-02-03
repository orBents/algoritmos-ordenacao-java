package algoritmos;

public class bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] V = {1, 5, 9, 2, 4, 6, 8, 0};
		int aux, inter = 1;
		
		//print pré organizar
		System.out.print("Vetor desorganizado: ");
		for(int i = 0; i < V.length; i++) {
			System.out.print(V[i]);
			if(i != V.length - 1) System.out.print(", ");
		}
		
		
		//Algoritmo
		for(int i = 0; i < V.length - 1; i++) {
			
			for(int j = 0; j < (V.length - inter); j++ ) {
				
				if(V[j] > V[j + 1]) {
					
					aux = V[j];
					V[j] = V[j + 1];
					V[j + 1] = aux;
				}
			}
			
			inter++;
		}
		
		//print pós organizar
		System.out.print("\nVetor organizado: ");
		for(int i = 0; i < V.length; i++) {
			System.out.print(V[i]);
			if(i != V.length - 1) System.out.print(", ");
		}
			
	}

}
