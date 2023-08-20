package controller;

public class RecursivaInteiros {
		public RecursivaInteiros() {
			super();
		}
		
		/* Explicação: Recebe um número n, que vai sendo dividido por 10 até ser menor que dez, depois disso, retorna somando 1 para cada divisão.
		   A cada vez que é dividido por 10, um dígito é perdido. Ex: 942/10 = 94,2 ou int 94.
		   Caso o número seja menor que 10, ele retorna 1, pois é o limite de dígitos que um número pode ter.
		   O código não leva em consideração números negativos.
		 */
		
		public int rint (int n) {
			if (n < 10) {
				return 1;
			}else {
				return 1 + rint (n/10);
			}
		}
}
