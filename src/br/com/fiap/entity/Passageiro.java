package br.com.fiap.entity;

import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "T_PASSAGEIRO")
@SequenceGenerator(name = "npassageiro", sequenceName = "SQ_T_PASSAGEIRO", allocationSize = 1)
public class Passageiro {

	@Id
	@Column(name = "cd_passageiro", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "npagamento")
	private int cd_passageiro;

	@Column(name = "nm_passageiro", nullable = false, length = 100)
	private String nome;

	@Column(name = "dt_nascimento")
	private Calendar dt_nascimento;

	@Column(name = "ds_genero")
	private String genero;

	public Passageiro() {
		super();
	}

	public Passageiro(int cd_passageiro, String nome, Calendar dt_nascimento, String genero) {
		super();
		this.cd_passageiro = cd_passageiro;
		this.nome = nome;
		this.dt_nascimento = dt_nascimento;
		this.genero = genero;
	}

	public int getCd_passageiro() {
		return cd_passageiro;
	}

	public void setCd_passageiro(int cd_passageiro) {
		this.cd_passageiro = cd_passageiro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDt_nascimento() {
		return dt_nascimento;
	}

	public void setDt_nascimento(Calendar dt_nascimento) {
		this.dt_nascimento = dt_nascimento;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

}
