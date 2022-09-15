package view;

import java.util.Random;

import controller.ReController.ThreadVetor;

public class main {

	public static void main(String[] args) {
		int numerico;
		int i;
		int vetnumerico[];
		vetnumerico = new int[1000];
		Random gerador = new Random();
		for(i=0;i<1000;i++) 
		{
			vetnumerico[i]= gerador.nextInt(100);
		}
		
		for(numerico=1;numerico<3;numerico++)
		{
			ThreadVetor th = new ThreadVetor(numerico, vetnumerico);
			th.start();
	
		}
	}

}