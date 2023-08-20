package view;

import controller.RecursivaInteiros;

public class Principal {

	public static void main(String[] args) {
		RecursivaInteiros ri = new RecursivaInteiros();
		int n = 400028922;

		
		int res = ri.rint(n);
		
		System.out.println(res);
	}

}
