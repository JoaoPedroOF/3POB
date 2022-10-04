package br.com.prova3pob;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ControlaProduto {

	List<Produto> produtos = new ArrayList<>();

	public void adicionar(Produto cp) {
		produtos.add(cp);
	}

	public void listaProdutos() {
		produtos.forEach((p) -> {
			System.out.println("Nome: " + p.getNome());
			System.out.println("Modelo: " + p.getModelo());
			System.out.println("Tamanho: " + p.getTamanho());
			System.out.println("Preço: " + p.getPreco());
			System.out.println("-----------------------------");
		});
	}
}
