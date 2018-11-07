package br.com.caelum.estudo.modelo;

import java.time.LocalDate;

import br.com.caelum.estudo.interfaces.RelatorioComercial;
import br.com.caelum.estudo.interfaces.RelatorioFinanceiro;

public class Relatorio implements RelatorioComercial, RelatorioFinanceiro{
	
	private String nome;
	private LocalDate data;
	private double valorFinanceiro = 20d;
	private double valorComercial  = 40d;
	
	public Relatorio(String nome) {
		this.nome = nome;
		this.data = LocalDate.now();
	}
	
	
	public String getNome() {
		return nome;
	}

	public LocalDate getData() {
		return data;
	}

	public double getValorFinanceiro() {
		return valorFinanceiro;
	}

	public double getValorComercial() {
		return valorComercial;
	}

}
