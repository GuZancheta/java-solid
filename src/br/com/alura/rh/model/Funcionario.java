package br.com.alura.rh.model;

import br.com.alura.rh.ValidacaoException;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class Funcionario {

	private DadosPessoais dadosPessoais;
	private LocalDate dataUltimoReajuste;

	public Funcionario(String nome, String cpf, Cargo cargo, BigDecimal salario, LocalDate dataUltimoReajuste) {
		this.dadosPessoais = new DadosPessoais(nome, cpf, cargo, salario);
		this.dataUltimoReajuste = dataUltimoReajuste;
	}

	public void atualizarSalario(BigDecimal novoSalario) {
		dadosPessoais.setSalario(novoSalario);
		this.dataUltimoReajuste = LocalDate.now();
	}


	public LocalDate getDataUltimoReajuste() {
		return dataUltimoReajuste;
	}

	public void setDataUltimoReajuste(LocalDate dataUltimoReajuste) {
		this.dataUltimoReajuste = dataUltimoReajuste;
	}

	public void promover(Cargo novoCargo) {
		dadosPessoais.setCargo(novoCargo);
	}

	public DadosPessoais getDadosPessoais() {
		return dadosPessoais;
	}

	public void setDadosPessoais(DadosPessoais dadosPessoais) {
		this.dadosPessoais = dadosPessoais;
	}
}
