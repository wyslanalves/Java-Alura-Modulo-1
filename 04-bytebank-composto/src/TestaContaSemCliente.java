
public class TestaContaSemCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta contaDaMarcela = new Conta();
		System.out.println(contaDaMarcela.getSaldo());
		
		contaDaMarcela.titular = new Cliente();
		
		
		contaDaMarcela.titular.nome = "Wyslan";
		System.out.println(contaDaMarcela.titular.nome);

	}

}
