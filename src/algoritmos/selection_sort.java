package algoritmos;

public class selection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] V = {1, 5, 9, 2, 4, 6, 8, 0};
		int aux, inter = 0;
		
		//print pré organizar
		System.out.print("Vetor desorganizado: ");
		for(int i = 0; i < V.length; i++) {
			System.out.print(V[i]);
			if(i != V.length - 1) System.out.print(", ");
		}
		
		//Algoritmo
		for(int i = 0; i < V.length; i++) {

			for(int j = inter; j < V.length; j++) {
				
				if(V[j] < V[i]) {
					
					aux = V[i];
					V[i] = V[j];
					V[j] = aux;
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
