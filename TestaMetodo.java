package byteBank;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaPaulo = new Conta();
		contaPaulo.saldo = 100;
		contaPaulo.deposita(50);
		System.out.println(contaPaulo.saldo);
		
		boolean conseguiuRetirar = contaPaulo.saca(40);
		System.out.println(conseguiuRetirar);
		System.out.println(contaPaulo.saldo);
		
		Conta contaMarcela = new Conta();
		contaMarcela.deposita(1000);
		
		//contaDaMarcela.transfere(300, contaDoPaulo);
	}

}
