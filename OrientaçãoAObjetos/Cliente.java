package OrientaçãoAObjetos;

public class Cliente {
	private static int geraId=0;
	private int id;
	private String nome;
	private int idade;
	private String email;
	private String cpf;
	
	{
		geraId++;
		id = geraId;
	}
	public void compraRoupas() {
		if(idade>=29) {
			System.out.println(nome + " tem " + idade +" anos e comprou R$100,00 de roupas");
		}
	
	}
	public static int getGeraId() {
		return geraId;
	}
	public static void setGeraId(int geraId) {
		Cliente.geraId = geraId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}

	
			
			
	
			

	
	