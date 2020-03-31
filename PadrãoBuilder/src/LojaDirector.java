
public class LojaDirector {
	
	protected SmartfoneBuilder loja;
	 
    public LojaDirector(SmartfoneBuilder loja) {
        this.loja = loja;
    }
 
    public void construirSmart() {
    	loja.buildProcessador();
    	loja.buildtela();
    	loja.buildMemoriaRam();
    	loja.buildPreco();
    	loja.buildModelo();
    	loja.buildMarca();
    }
 
    public Smartfone getSmart() {
        return loja.getSmart();
    }

}
