package aula2;

public class Carro {
	private String modelo;
	private String marca;
	private String cor;
	
	private float tanque = 0;
	private float odometro = 0;
	private float consumoMedio = 0;
	
	private int velocidade = 0;
	private boolean ligado = false;
	
	public Carro () {
		System.out.println("criei essa merda sem construtor");
	}
	
//	public Carro(float consumo) {
//		this.setConsumoMedio(consumo);
//		this.odometro = 0;
//		this.tanque = 40;
//	}
	
	public Carro (String modelo, String marca, String cor, float odometro, float consumoMedio, float tanque) {
		this.modelo = modelo;
		this.marca = marca;
		this.cor = cor;
		this.odometro = odometro;
		this.consumoMedio = consumoMedio;
		this.tanque = tanque;
	}
	
	public  void setarVelocidade(float vm, float tempo) {
		this.odometro += vm * tempo;
		this.tanque -= (vm * tempo) / this.consumoMedio;
		if(this.tanque < 0) this.tanque = 0;
	}
	
	public void ligar() {
		this.ligado = true;
		System.out.println("Carro ligado!");
	}
	public void acelerar(int velocidade) {
		this.setVelocidade(this.getVelocidade() + velocidade);
	}
	public void frear() {
		this.setVelocidade(0);
		System.out.println("Agora a velocidade é " + this.getVelocidade());
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public float getOdometro() {
		return odometro;
	}
	public void setOdometro(float odometro) {
		this.odometro = odometro;
	}
	public boolean isLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public float getTanque() {
		return tanque;
	}

	public void setTanque(float tanque) {
		this.tanque = tanque;
	}

	public float getConsumoMedio() {
		return consumoMedio;
	}

	public void setConsumoMedio(float consumoMedio) {
		this.consumoMedio = consumoMedio;
	}
}
