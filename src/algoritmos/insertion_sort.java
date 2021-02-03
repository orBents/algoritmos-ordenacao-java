package algoritmos;

public class insertion_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] V = {1, 5, 9, 2, 4, 6, 8, 0};
		int aux;
	
		//print pré organizar
		System.out.print("Vetor desorganizado: ");
		for(int i = 0; i < V.length; i++) {
			System.out.print(V[i]);
			if(i != V.length - 1) System.out.print(", ");
		}
		
		//Algoritmo Insertion Sort
		
		for(int i = 1; i < V.length; i++) {
			
			//guarda o atual na memória
			aux = V[i];
			
			for(int j = i - 1; j >= 0; j--) {
				
				//compara a memória com o anterior, se for maior que a posição atual substitui o 'i' pelo anterior
				if(V[j] > aux) {
					
					V[j + 1] = V[j];
					if( j == 0) V[j] = aux;
					
					//se for menor que a memória, substitui o seguinte pelo 'aux' e inicia outro 'for'
				} else { 
					V[j + 1] = aux;
					j = 0;
					}
				}
			}
		
		//print pós organizar
		System.out.print("\nVetor organizado: ");
		for(int i = 0; i < V.length; i++) {
			System.out.print(V[i]);
			if(i != V.length - 1) System.out.print(", ");
			}
		}
}
