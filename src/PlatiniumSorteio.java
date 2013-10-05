import java.util.Date;


public class PlatiniumSorteio {

	private String nomeSorteio;
	private String codigoSorteio;
	private boolean faseVendas = true;
	private boolean possuiGanhador = false;
	private Cliente ganhador = null;
	private Cartela[] cartelas;
	
	public PlatiniumSorteio(String nomeSorteio, String codigoSorteio){
		this.nomeSorteio = nomeSorteio;
		this.codigoSorteio = codigoSorteio;
	}
	
	public void encerrarVendas(){ 
		faseVendas = false;
	}
	
	
}
