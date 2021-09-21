package controller;

import br.edu.fateczl.brunosantos.Pilha;

public class PalindromoController {
	Pilha p = new Pilha();
	public String invertePalavra(String palavra, Pilha p) throws Exception{
		 
		 for(int i = 0; i < palavra.length(); i++) {
			 p.push(Character.toString(palavra.charAt(i)));
		 }
		
		 String palavraInvertida = "";
		 while(!p.pilhaVazia()) {
			 palavraInvertida += p.pop();
		 }
		 return palavraInvertida;	
	}
	
	public boolean comparaPalavra(String palavra, String palavraInvertida) {
		if(palavra.equals(palavraInvertida)) {
			return true;
		}else {
			return false;
		}
	}
}
