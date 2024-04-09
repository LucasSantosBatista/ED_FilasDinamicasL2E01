package view;

import model.FilaGeneric;

public class Main {
	public static void main(String[] args) {
		FilaGeneric<Integer> f = new FilaGeneric<>();
		int[] vetor = { 100, 200, 1, 50, 39, 44, 25, 16, 99, 45, 33, 18, 102, 92 };
		int tamanhoVetor = vetor.length;

		for (int i = 0; i < tamanhoVetor; i++) {
			if (f.isEmpty()) {
				f.insert(vetor[i] - 10);
			} else if (vetor[i] % 5 == 0) {
				f.insert(vetor[i] / 5);
			} else if (vetor[i] % 3 == 0) {
				f.insert(vetor[i] * 3);
			} else {
				int v1 = 0;
				try {
					v1 = f.remove();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println((v1 * vetor[i]));
//		
			}
		}
	}
}
