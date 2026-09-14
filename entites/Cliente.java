package Entites;

public class Cliente {
	private String nome;
	private String cpf;
	private Computador[] computador;
	private int Q;
	
	public Cliente(String nome, String cpf) {
	
		this.nome = nome;
		this.cpf = cpf;
		this.computador = new Computador[10];
		Q = 0;
	}
	
	 public void adicionarComputador(Computador computador) {
	        this.computador[Q] = computador;
	        Q = Q + 1;
	    }
	
	public float calculaTotalCompra() {
		float total = 0;
		for (int i = 0; i < Q; i ++) {
			total = total + computador[i].getPreco();
		}
		
		return total;
	}

	public Computador[] getComputador() {
		return computador;
	}


	public String getNome() {
		return nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void mostrarComputadores() {

	    for (int i = 0; i < Q; i++) {
	        computador[i].mostraPCConfigs();
	        System.out.println();
	    }
	}
}

