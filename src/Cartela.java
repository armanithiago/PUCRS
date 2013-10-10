import java.util.Arrays;
import java.util.Random;


public class Cartela {

	private Cliente cliente;
	private int[] numeros = new int[5];

	public Cartela(Cliente cliente, int[] numeros){
		this.cliente = cliente;
		this.numeros = numeros;		
	}

	public Cartela(Cliente cliente){
		this.cliente = cliente;
		gerarNumeros();
	}

	public void gerarNumeros(){
		Random r = new Random();

		for(int i = 0; i < numeros.length; i++){
			numeros[i] = r.nextInt(100);
		}
		Arrays.sort(numeros);
	}
}
