package br.com.fiap.entity;

import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "T_PAGAMENTO")
@SequenceGenerator(name = "npagamento", sequenceName = "SQ_T_PAGAMENTO", allocationSize = 1)
public class Pagamento {

	@Id
	@Column(name = "cd_pagamento", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "npagamento")
	private int cd_pagamento;

	@Column(name = "", nullable = false)
	private Calendar dt_pagamento;

	@Column(name = "", nullable = false)
	private float vl_pagamento;

	@Column(name = "", nullable = false)
	@Enumerated(EnumType.STRING)
	private Forma_Pagamento forma_pagamento;

	public Pagamento() {
		super();
	}

	public Pagamento(int cd_pagamento, Calendar dt_pagamento, float vl_pagamento, Forma_Pagamento forma_pagamento) {
		super();
		this.cd_pagamento = cd_pagamento;
		this.dt_pagamento = dt_pagamento;
		this.vl_pagamento = vl_pagamento;
		this.forma_pagamento = forma_pagamento;
	}

	public int getCd_pagamento() {
		return cd_pagamento;
	}

	public void setCd_pagamento(int cd_pagamento) {
		this.cd_pagamento = cd_pagamento;
	}

	public Calendar getDt_pagamento() {
		return dt_pagamento;
	}

	public void setDt_pagamento(Calendar dt_pagamento) {
		this.dt_pagamento = dt_pagamento;
	}

	public float getVl_pagamento() {
		return vl_pagamento;
	}

	public void setVl_pagamento(float vl_pagamento) {
		this.vl_pagamento = vl_pagamento;
	}

	public Forma_Pagamento getForma_pagamento() {
		return forma_pagamento;
	}

	public void setForma_pagamento(Forma_Pagamento forma_pagamento) {
		this.forma_pagamento = forma_pagamento;
	}
	
	

}
