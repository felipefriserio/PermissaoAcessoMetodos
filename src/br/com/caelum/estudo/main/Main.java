package br.com.caelum.estudo.main;

import br.com.caelum.estudo.interfaces.RelatorioComercial;
import br.com.caelum.estudo.interfaces.RelatorioFinanceiro;
import br.com.caelum.estudo.modelo.Relatorio;

public class Main {
	
	public static void main(String[] args) {
		
		RelatorioFinanceiro relatorioFinanceiro = new Relatorio("Relatorio Financeiro soh pode acessar metodos do financeiro");
		System.out.println(relatorioFinanceiro.getValorFinanceiro());

		RelatorioComercial relatorioComercial = new Relatorio("Relatorio Comercial soh pode acessar metodos do comercial");
		System.out.println(relatorioComercial.getValorComercial());
		
		Relatorio relatorio = new Relatorio("Relatorio");
		System.out.println(relatorio.getValorComercial());
		System.out.println(relatorio.getValorFinanceiro());
	}

}
