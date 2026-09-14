package Applicates;

import java.util.Scanner;

import Entites.Cliente;
import Entites.Computador;
import Entites.HardwareBasico;
import Entites.Interface;
import Entites.MemoriaUSB;
import Entites.ProcessarPedido;
import Entites.SistemaOperacional;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		//Promoção 1
		//Hardware Basico
		HardwareBasico HB1P1 = new HardwareBasico("Pentium Core i5", 2200);
		HardwareBasico HB2P1 = new HardwareBasico("Memoria RAM", 8);
		HardwareBasico HB3P1 = new HardwareBasico("HD", 500);
		//USB
		MemoriaUSB USBP1 = new MemoriaUSB("Pen-drive", 16);
		// Sistema Operacional
		SistemaOperacional SOP1 = new SistemaOperacional ("macOS",64);
		//Computador
		Computador CP1 = new Computador("Apple Sequoia", 864, HB1P1, HB2P1, HB3P1,SOP1);
		CP1.addMemoriaUSB(USBP1);
		
		//Promoção2
		//Hardware Basico
		HardwareBasico HB1P2 = new HardwareBasico("Pentium Core i7", 3370);
		HardwareBasico HB2P2 = new HardwareBasico("Memoria RAM", 16);
		HardwareBasico HB3P2 = new HardwareBasico("HD", 1000);
		//USB
		MemoriaUSB USBP2 = new MemoriaUSB("Pen-drive", 32);
		// Sistema Operacional
		SistemaOperacional SOP2 = new SistemaOperacional ("Windows 8",64);
		//Computador
		Computador CP2 = new Computador("Samsung", 864 + 1, HB1P2, HB2P2, HB3P2, SOP2);
		CP2.addMemoriaUSB(USBP2);

		//Promoção3
		//Hardware Basico
		HardwareBasico HB1P3 = new HardwareBasico("Pentium Core i7", 4500);
		HardwareBasico HB2P3 = new HardwareBasico("Memoria RAM", 32);
		HardwareBasico HB3P3 = new HardwareBasico("HD", 2000);
		//USB
		MemoriaUSB USBP3 = new MemoriaUSB("HD Externo", 1000);
		// Sistema Operacional
		SistemaOperacional SOP3 = new SistemaOperacional ("Windows 10",64);
		//Computador
		Computador CP3 = new Computador("Dell", 864 + 2, HB1P3, HB2P3, HB3P3,SOP3);
		CP3.addMemoriaUSB(USBP3);
		
		Cliente cliente = new Cliente ( "Igor ", "01929019291");
		
		int escolha;
		
		System.out.println("Seja Bem vindo!");
		System.out.println("Qual PC você deseja adquirir?");
		Interface.tabela();
		System.out.println("Digite o numero da promoção desejada: ");
		System.out.println("0 - Sair");
		escolha = sc.nextInt();
		
		while(escolha != 0) {
			
			//logica
			if (escolha == 1) {
				 cliente.adicionarComputador(CP1);
				    System.out.println("Promoção 1 adicionada!");
			}
			
			else if (escolha == 2) {
				 cliente.adicionarComputador(CP2);
				    System.out.println("Promoção 2 adicionada!");
			}
			
			else if (escolha == 3) {
				 cliente.adicionarComputador(CP3);
				    System.out.println("Promoção 3 adicionada!");
			}
			
			else {
				System.out.println("Digite uma opção valida!!!");
			}
			System.out.println("Deseja mais algum PC?");
			System.out.println("Digite o numero da promoção desejada: ");
			System.out.println("0 - Sair");
			escolha = sc.nextInt();
		}
		
		System.out.println("Cliente Nome: " + cliente.getNome() + " CPF:" + cliente.getCpf());
		System.out.println("Pcs: ");
		cliente.mostrarComputadores();
		System.out.println("Total: R$" + cliente.calculaTotalCompra());
		
		ProcessarPedido.processar(cliente.getComputador());
		
		sc.close();
	}

}

