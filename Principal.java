package exercicio1;

public class Principal {
    public static void main(String[] args) {
        
    	Carro carro1 = new Carro("WWWWWWWWWWW");
    	Carro carro2 = new Carro();
    	
    	carro1.setCor("vermelho");
    	
    	carro2.setCor("preto");
    	
    	System.out.println(carro1.getNumChassi());
    	System.out.println(carro1.getVelocidadeMaxima());
    	System.out.println(carro1.getQuilometragem());
    	System.out.println(carro1.getPotencia());
    	System.out.println(carro1.getCor());
    	System.out.println(carro1.getQtdePortas());
    	System.out.println(carro1.getVelocidade());
    	System.out.println(carro1.isLigado());
    	
    	System.out.println(carro2.getNumChassi());
    	System.out.println(carro2.getVelocidadeMaxima());
    	System.out.println(carro2.getQuilometragem());
    	System.out.println(carro2.getPotencia());
    	System.out.println(carro2.getCor());
    	System.out.println(carro2.getQtdePortas());
    	System.out.println(carro2.getVelocidade());
    	System.out.println(carro2.isLigado());
    	
    	while(carro1.getVelocidade() < 90 && carro1.getVelocidade() < carro1.getVelocidadeMaxima())carro1.acelerar();
    	
    	while(carro2.getVelocidade() < 90 && carro2.getVelocidade() < carro2.getVelocidadeMaxima())carro2.acelerar();
        
    	System.out.println(carro1.getVelocidade());

    	System.out.println(carro2.getVelocidade());
    	
    }
}
