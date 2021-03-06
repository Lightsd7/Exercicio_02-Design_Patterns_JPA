package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_VEICULO")
public class Veiculo {

	@Id
	@Column(name = "cd_veiculo", nullable = false)
	private int veiculo;

	@Column(name = "ds_placa", nullable = false, length = 9)
	private String placa;

	@Column(name = "ds_cor", nullable = false, length = 20)
	private String cor;

	@Column(name = "nr_ano")
	private int ano;

	public Veiculo() {
		super();
	}

	public Veiculo(int veiculo, String placa, String cor, int ano) {
		super();
		this.veiculo = veiculo;
		this.placa = placa;
		this.cor = cor;
		this.ano = ano;
	}

	public int getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(int veiculo) {
		this.veiculo = veiculo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

}
