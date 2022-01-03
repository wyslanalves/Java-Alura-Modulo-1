
public class Endereco {

	private String cep;
	private String rua;
	private String barrio;
	private String complemento;
	private int numero;
	private String cidade;
	
	
	public Endereco(String cep, String rua, String barrio, String complemento, int numero, String cidade) {
		
		this.cep = cep;
		this.rua = rua;
		this.barrio = barrio;
		this.complemento = complemento;
		this.numero = numero;
		this.cidade = cidade;
	}
	
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBarrio() {
		return barrio;
	}
	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	
	
}
