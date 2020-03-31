
public class Main {

	public static void main(String[] args) {
		LojaDirector loja = new LojaDirector(
	            new AppleBuilder());
	 
	    loja.construirSmart();
	    Smartfone smart = loja.getSmart();
	    System.out.println("Smartefone: " + smart.modelo + "/" + smart.marca
	            + "\nTela: " + smart.tela + "\nProcessador: "
	            + smart.processador+ "\nMemoria: "+ smart.memoriaRam 
	            + "\nValor: " + smart.preco);
	 
	    System.out.println();
	 
	    LojaDirector loja2 = new LojaDirector(
	            new XiaomiBuilder());
	 
	    loja2.construirSmart();
	    Smartfone smart2 = loja2.getSmart();
	    System.out.println("Smartefone: " + smart2.modelo + "/" + smart2.marca
	            + "\nTela: " + smart2.tela + "\nProcessador: "
	            + smart2.processador+ "\nMemoria: "+ smart2.memoriaRam 
	            + "\nValor: " + smart2.preco);
	 
	    System.out.println();
	}

}
