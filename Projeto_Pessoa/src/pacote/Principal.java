package pacote;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		ArrayList<Pessoa> listaCredito = new ArrayList<Pessoa>();
		ArrayList<Pessoa> listaDebito = new ArrayList<Pessoa>();
		ArrayList<Pessoa> listaPix = new ArrayList<Pessoa>();
		ArrayList<Double> listaValorCredito = new ArrayList<Double>();
		ArrayList<Double> listaValorDebito = new ArrayList<Double>();
		ArrayList<Double> listaValorPix = new ArrayList<Double>();
		ArrayList<Integer> listaChavesPix = new ArrayList<Integer>();

		Scanner sc = new Scanner(System.in);
		Scanner scNumeros = new Scanner(System.in);
		int chavePix;
		double valorCredito;
		String opcao;
		int opcaoRelatorio;
		boolean rodando = true;

		while (rodando) {
			System.out.println("======= MENU DE  OP��ES DO USUARIO ======");
			System.out.println("[1] - Cadastro de usuarios // Colocar Credito por cart�o de credito");
			System.out.println("[2] - Cadastro de usuarios // Colocar Credtio por cart�o de debito");
			System.out.println("[3] - Cadastro de usuarios // Colocar credito via PIX");
			System.out.println("[4] - Sair");
			opcao = sc.next();

			switch (opcao) {
			case "1":
				System.out.println("===== CADASTRO DE USUARIO P COLOCAR CREDITO POR CART�O DE CREDITO =====");
				System.out.print("Informe seu Nome: ");
				sc.nextLine();
				String nome = sc.nextLine();
				System.out.print("Informe seu N�mero de telefone: ");
				int numTelefone = scNumeros.nextInt();
				System.out.print("Informe o N�mero do seu Cart�o: ");
				String numCartao = sc.nextLine();
				System.out.print("Informe o CVV do seu Cart�o: ");
				int cvv = scNumeros.nextInt();
				System.out.print("Informe o seu CPF: ");
				String cpf = sc.nextLine();
				Pessoa pessoa = new Pessoa();
				pessoa.setNome(nome);
				pessoa.setNumTelefone(numTelefone);
				pessoa.setNumCartao(numCartao);
				pessoa.setCvv(cvv);
				pessoa.setCpf(cpf);
				listaCredito.add(pessoa);
				//
				System.out.print("Informe o valor que deseja colocar de Credito: ");
				valorCredito = scNumeros.nextDouble();
				System.out.printf("Voc� digitou R$: %.2f%n", valorCredito);
				listaValorCredito.add(valorCredito);
				System.out.println("Deseja ver seu relatorio? [0]- N�o // [1] - Sim");
				opcaoRelatorio = scNumeros.nextInt();
				if (opcaoRelatorio == 1) {
					for (int i = 0; i < listaCredito.size(); i++) {
						System.out.println("====== RELATORIO DE USUARIO CREDITO =======");
						System.out.println("Nome do Usuario " + i + ": " + listaCredito.get(i).getNome());
						System.out.println(
								"N�mero do telefone do Usuario " + i + ": " + listaCredito.get(i).getNumTelefone());
						System.out.println(
								"N�mero do Cart�o do Usuario " + i + ": " + listaCredito.get(i).getNumCartao());
						System.out.println("CVV Do Usuario " + i + ": " + listaCredito.get(i).getCvv());
						System.out.println("CPF Do Usuario " + i + ": " + listaCredito.get(i).getcpf());
						System.out.printf("Valor de Credito adicionado R$: %.2f%n: ", listaValorCredito.get(i));

					}

				} else {
					System.out.println("Voc� digitou [0] Voltando ao MENU...");
				}
				break;
			// CASO 2 DEBITO
			case "2":
				System.out.println("====== CADASTRO DE USUARIO P COLOCAR CREDITO POR CART�O DE DEBITO ======");
				System.out.print("Informe seu Nome: ");
				sc.nextLine();
				nome = sc.nextLine();
				System.out.print("Informe seu N�mero de telefone: ");
				numTelefone = scNumeros.nextInt();
				System.out.print("Informe o N�mero do seu Cart�o: ");
				numCartao = sc.nextLine();
				System.out.print("Informe o CVV do seu Cart�o: ");
				cvv = scNumeros.nextInt();
				System.out.print("Informe o seu CPF: ");
				cpf = sc.nextLine();
				pessoa = new Pessoa();
				pessoa.setNome(nome);
				pessoa.setNumTelefone(numTelefone);
				pessoa.setNumCartao(numCartao);
				pessoa.setCvv(cvv);
				pessoa.setCpf(cpf);
				listaDebito.add(pessoa);
				System.out.print("Informe o valor que deseja colocar de Credito: ");
				valorCredito = scNumeros.nextDouble();
				System.out.printf("Voc� digitou R$: %.1f%n", valorCredito);
				listaValorDebito.add(valorCredito);
				System.out.println("Deseja ver seu relatorio? [0]- N�o // [1] - Sim");
				opcaoRelatorio = scNumeros.nextInt();
				if (opcaoRelatorio == 1) {
					for (int i = 0; i < listaDebito.size(); i++) {
						System.out.println("====== RELATORIO DE USUARIO DEBITO =======");
						System.out.println("Nome do Usuario " + i + ": " + listaDebito.get(i).getNome());
						System.out.println(
								"N�mero do telefone do Usuario " + i + ": " + listaDebito.get(i).getNumTelefone());
						System.out
								.println("N�mero do Cart�o do Usuario " + i + ": " + listaDebito.get(i).getNumCartao());
						System.out.println("CVV Do Usuario " + i + ": " + listaDebito.get(i).getCvv());
						System.out.println("CPF Do Usuario " + i + ": " + listaDebito.get(i).getcpf());
						System.out.printf("Valor de Credito adicionado R$: %.2f%n: ", listaValorDebito.get(i));

					}
				} else {
					System.out.println("Voc� digitou [0] Voltando ao MENU...");
				}

				break;

			case "3":
				System.out.println("====== CADASTRO DE USUARIO P COLOCAR CREDITO POR PIX  ======");
				chavePix = aleatorio.nextInt(100000000);
				System.out.println("====== CHAVE PIX DO SISTEMA --- > " + chavePix);
				System.out.print("Informe seu Nome: ");
				sc.nextLine();
				nome = sc.nextLine();
				System.out.print("Informe seu N�mero de telefone: ");
				numTelefone = scNumeros.nextInt();
				System.out.print("Informe o seu CPF: ");
				cpf = sc.nextLine();
				pessoa = new Pessoa();
				pessoa.setNome(nome);
				pessoa.setNumTelefone(numTelefone);
				pessoa.setCpf(cpf);
				listaPix.add(pessoa);
				System.out.println("Informe a chave PIX do sistema que voc� quer transferir ");
				int lerChavePix = scNumeros.nextInt();
				listaChavesPix.add(lerChavePix);
				System.out.print("Informe o valor que deseja colocar de Credito: ");
				valorCredito = scNumeros.nextDouble();
				System.out.printf("Voc� digitou R$: %.1f%n", valorCredito);
				listaValorPix.add(valorCredito);
				System.out.println("Deseja ver seu relatorio? [0]- N�o // [1] - Sim");
				opcaoRelatorio = scNumeros.nextInt();
				if (opcaoRelatorio == 1) {
					for (int i = 0; i < listaPix.size(); i++) {
						System.out.println("====== RELATORIO DE USUARIO PIX =======");
						System.out.println("Nome do Usuario " + i + ": " + listaPix.get(i).getNome());
						System.out.println(
								"N�mero do telefone do Usuario " + i + ": " + listaPix.get(i).getNumTelefone());
						System.out.println("CPF Do Usuario " + i + ": " + listaPix.get(i).getcpf());
						System.out.println("Chave do PIX Transferida: " + listaChavesPix.get(i));
						System.out.printf("Valor de Credito adicionado R$: %.1f%n: ", listaValorPix.get(i));

					}
				} else {
					System.out.println("Voc� digitou [0] Voltando ao MENU...");
				}

				break;

			case "4":
				rodando = false;
				break;
			}

		}

		scNumeros.close();
		sc.close();
	}
}
