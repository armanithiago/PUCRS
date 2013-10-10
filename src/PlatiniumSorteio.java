import java.util.*;

import javax.activity.InvalidActivityException;


public class PlatiniumSorteio {

	private String nomeSorteio;
	private String codigoSorteio;
	private boolean faseVendas = true;
	private boolean possuiGanhador = false;
	private Cliente ganhador = null;
	private Cartela[] cartelas;
	private int[] numeroSorteados = new int[5];

	public PlatiniumSorteio(String nomeSorteio, String codigoSorteio){
		this.nomeSorteio = nomeSorteio;
		this.codigoSorteio = codigoSorteio;
	}

	public void encerrarVendas(){ 
		faseVendas = false;
	}

	public void sortear() throws Exception{
		if(faseVendas == true){throw new InvalidActivityException("O sorteio ainda está nas fase de vendas");}
		// Gera os 5 números aleatórios.
		Random r = new Random();
		for(int i = 0; i < numeroSorteados.length; i++){
			numeroSorteados[i] = r.nextInt(100);
		}
		Arrays.sort(numeroSorteados);
		
		//TODO Verifica campeões
		
	}


}



}
