
public class Enderecos {
	
	// Atributos
	private String ruaAt;
	private int numeroAt;
	
	// Construtor
	public Enderecos(String ruaAt, int numeroAt) {
		super();
		this.ruaAt = ruaAt;
		this.numeroAt = numeroAt;
	}
	
	// Getters
	public String getRuaAt() {
		return ruaAt;
	}
	
	public int getNumeroAt() {
		return numeroAt;
	}
	
	//Setters
	public void setRuaAt(String ruaAt) {
		this.ruaAt = ruaAt;
	}

	public void setNumeroAt(int numeroAt) {
		this.numeroAt = numeroAt;
	}
	

}
