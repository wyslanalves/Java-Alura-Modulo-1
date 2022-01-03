
public class Program {

	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario();
		Endereco endereco = new Endereco("58300-000", "rua Jornal o combate", "Marcos moura", "casa", 466, "santa rita");
		funcionario1.setEndereco(endereco);
		
		System.out.println(funcionario1.getEndereco().getCep());
		System.out.println(funcionario1.getEndereco().getRua());
		System.out.println(funcionario1.getEndereco().getBarrio());
		System.out.println(funcionario1.getEndereco().getCidade());
		System.out.println(funcionario1.getEndereco().getRua());
		System.out.println(funcionario1.getEndereco().getNumero());
		System.out.println(funcionario1.getEndereco().getComplemento());

	}

}
