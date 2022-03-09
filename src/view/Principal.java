package view;

import controller.Sapo1;
import controller.Sapo2;
import controller.Sapo3;
import controller.Sapo4;
import controller.Sapo5;

public class Principal {

	public static void main(String[] args) {

		int pulo = 0;
		int somap = 0;
		int chegada = 0;
		
		Thread sapo1 = new Sapo1(pulo, somap, chegada);
		Thread sapo2 = new Sapo2(pulo, somap, chegada);
		Thread sapo3 = new Sapo3(pulo, somap, chegada);
		Thread sapo4 = new Sapo4(pulo, somap, chegada);
		Thread sapo5 = new Sapo5(pulo, somap, chegada);
		sapo1.start();
		sapo2.start();
		sapo3.start();
		sapo4.start();
		sapo5.start();
	}

}
