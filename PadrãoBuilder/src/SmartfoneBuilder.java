
public abstract class SmartfoneBuilder {
	protected Smartfone smart;
	
	public SmartfoneBuilder() {
        smart = new Smartfone();
    }
 
    public abstract void buildProcessador();
    
    public abstract void buildtela();
 
    public abstract void buildMemoriaRam();
 
    public abstract void buildPreco();
 
    public abstract void buildModelo();
 
    public abstract void buildMarca();
    
    public Smartfone getSmart() {
        return smart;
    }

}
