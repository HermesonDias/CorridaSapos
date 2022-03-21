package view;

import controller.tSapo;

public class Principal {

	public static void main(String[] args) {
		
		for(int idSapo=1; idSapo<=5;idSapo ++) {
			Thread sapo = new tSapo(idSapo);
			sapo.start();
		}
	}

}
