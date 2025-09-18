
public class Principal {

	public static void main(String[] args) {

		// Objeto chamado e1
		// Regra do que precisa ser passado definida no construtor
		Enderecos e1 = new Enderecos("Av. Rui Barbosa", 160);

		System.out.println(e1.getRuaAt()); // sysout + ctrl + space
		System.out.println(e1.getNumeroAt());
		
		// Alterar sempre com set
		e1.setRuaAt("Rua Mel de Cândido Mota");
		e1.setNumeroAt(323);

		// Pegar informações
		System.out.println(e1.getRuaAt()); 
		System.out.println(e1.getNumeroAt());

	}

}
