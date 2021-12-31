
public class TestaMetodo {

	public static void main(String[] args) {
	
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(100);
		contaDoPaulo.deposita(100);
		
		System.out.println(contaDoPaulo.saldo);
		contaDoPaulo.saca(0);
		System.out.println(contaDoPaulo.saldo);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(0);
		if(contaDaMarcela.transfere(100, contaDoPaulo)) {
			System.out.println("transferencia com sucesso!");
		}else{
			System.out.println("transferencia não realizada!");
			
		};
		System.out.println(contaDoPaulo.saldo);
		
		contaDoPaulo.titular = "paulo silveira";
		System.out.println(contaDoPaulo.titular);
		
		
	}

}
