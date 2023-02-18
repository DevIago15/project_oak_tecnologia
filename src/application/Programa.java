package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import entities.Produto;

public class Programa {

	public static void main(String[] args) {
		// criação da arrayList
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		Scanner sc = new Scanner(System.in);
		int opcao;

		// listagem de opções para dar inicio ao programa
		System.out.print("Olá! Seja bem vindo ao programa de cadastro de produtos simples!");
		do {
			System.out.print("\nSelecione uma das opções abaixo: ");
			System.out.print("\n1 - Adicionar produto");
			System.out.print("\n2 - Listar produtos");
			System.out.print("\n3 - Sair");
			System.out.print("\nResposta: ");

			opcao = sc.nextInt();

			// opção 1: cadastrar produto
			switch (opcao) {
			case 1:
				System.out.print("\nDigite o nome do produto: ");
				String nomeProduto = sc.next();
				System.out.print("Digite a descrição do produto: "); // escreva a descricao somente com uma palavra
				String descricaoProduto = sc.next();
				System.out.print("Digite o preço do produto: "); // digite o numero entre virgulas, exemplo: 2,50
				double precoProduto = sc.nextDouble();
				System.out.print("Disponivel para venda (sim/nao): ");
				String disponivel = sc.next();

				Produto produto = new Produto(nomeProduto, descricaoProduto, disponivel, precoProduto);
				produtos.add(produto);
				System.out.println("\nProduto adicionado com sucesso!\n");

				// listagem automatica dos produtos em ordem crescente
				System.out.println("Produtos cadastrados:");
				Collections.sort(produtos);
				for (Produto p : produtos) {
					System.out.println(p.toString());
				}

				break;

			// opção 2: listar produto
			case 2:
				System.out.println("\nListando produtos:");

				Collections.sort(produtos); // coloca os produtos em ordem crescente a partir do valor
				for (Produto p : produtos) {
					System.out.println(p.toString());
				}
				break;

			// opção 3: sair do programa
			case 3:
				System.out.println("\nSaindo do programa...\n");
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}

		} while (opcao != 3); // fechando o programa
		sc.close();
	}

}