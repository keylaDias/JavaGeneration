package OrientaçãoAObjetos;

public class Cliente {
	
	//Atributos
	private String name;
	
	private double altura;
	
	private double peso;

	//Construtor
	public Cliente(String keyla, double Ethan, double fofinha) {
		this.name = keyla;
		this.altura = 170;
		this.peso = 67;
	}
	
	public Cliente(String nome, double peso) {
		this.name = nome;
		this.peso = peso;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String imc() {
		// TODO Auto-generated method stub
		return null;
	}
	
