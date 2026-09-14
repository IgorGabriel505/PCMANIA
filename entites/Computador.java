package Entites;

public class Computador {
	private String marca;
	private float preco;
	private HardwareBasico[] HB;
	private SistemaOperacional SO;
	private MemoriaUSB MUSB;
	
	public Computador(String marca, float preco,HardwareBasico HB, HardwareBasico HB2, HardwareBasico HB3, SistemaOperacional SO) {
		this.marca = marca;
		this.preco = preco;
		
		this.HB = new HardwareBasico[3];
		
		this.HB[0] = HB;
		this.HB[1] = HB2;
		this.HB[2] = HB3;
		
		this.SO = SO;
	}
	
	public void mostraPCConfigs() {
		 System.out.println("Marca: " + marca);
		    System.out.println("Preço: R$ " + preco);

		    for (int i = 0; i < HB.length; i++) {
		        System.out.println(HB[i].getNome() + ": " +HB[i].getCapacidade());
		    }

		    System.out.println("Sistema Operacional: " +SO.getNome() + " - " +SO.getTipo() + " bits");

		    if (MUSB != null) {
		        System.out.println("Memória USB: " + MUSB.getNome() + " - " +MUSB.getCapacidade());
		    }
	}
	public void addMemoriaUSB(MemoriaUSB musb) {
		this.MUSB = musb;
	}

	public float getPreco() {
		return preco;
	}

}
