package view;

import javax.swing.JOptionPane;

import br.edu.fateczl.brunosantos.Pilha;
import controller.PalindromoController;

public class Principal {

	public static void main(String[] args) {
		Pilha p = new Pilha();
		String palavra = JOptionPane.showInputDialog("Digite uma palavra");
		PalindromoController pc = new PalindromoController();
		String resultado;
			try {
				resultado = pc.invertePalavra(palavra, p);
				System.out.println(resultado);
				boolean compara = pc.comparaPalavra(palavra, resultado);
				System.out.print(compara);
			} catch (Exception e) {
				e.printStackTrace();
			}	
	}

}
