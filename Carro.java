package exercicio1;

public class Carro {
    
    private String numChassi;
    private double velocidadeMaxima;
    private double quilometragem;
    private double potencia;
    private String cor;
    private int qtdePortas;
    private double velocidade;
    private int marcha;
    private boolean ligado;
    
	public Carro() {
		super();
		this.numChassi = "XXXXXXXXXXXXXX";
		this.velocidadeMaxima = 0;
		this.quilometragem = 0;
		this.potencia = 0;
		this.cor = "branco";
		this.qtdePortas = 0;
		this.velocidade = 0;
		this.marcha = 0;
		this.ligado = false;
	}

	public Carro(String numChassi) {
		super();
		this.numChassi = numChassi;
		this.velocidadeMaxima = 180;
		this.quilometragem = 0;
		this.potencia = 80;
		this.cor = "branco";
		this.qtdePortas = 4;
		this.velocidade = 0;
		this.marcha = 0;
		this.ligado = false;
	}
	
	public String getNumChassi() {
		return numChassi;
	}

	public void setNumChassi(String numChassi) {
		this.numChassi = numChassi;
	}

	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public double getQuilometragem() {
		return quilometragem;
	}

	public void setQuilometragem(double quilometragem) {
		this.quilometragem = quilometragem;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getQtdePortas() {
		return qtdePortas;
	}

	public void setQtdePortas(int qtdePortas) {
		this.qtdePortas = qtdePortas;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

	public int getMarcha() {
		return marcha;
	}

	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public void ligar() {
		this.ligado = true;
	}
	
	public void desligar() {
		this.ligado = false;
	}
	
	public void acelerar() {
		
		this.velocidade += 5;
		//System.out.println(this.velocidade);

	}
	
	public void frear() {
		if (this.velocidade > 0) velocidade -= 5;
	}
	
	public void girarVolante() {
		
	}	
    
	public void reduzirMarcha() {
		if (this.marcha > 0) this.marcha--;
	}
	
	public void subirMarcha() {
		if (this.marcha < 4) this.marcha++;
	}
    
}
