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
@Table(name = "T_CORRIDA")
@SequenceGenerator(name = "ncorrida", sequenceName = "SQ_T_CORRIDA", allocationSize = 1)
public class Corrida {

	@Id
	@Column(name = "cd_corrida", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ncorrida")
	private int cd_corrida;

	@Column(name = "ds_origem")
	private String origem;

	@Column(name = "ds_destino")
	private String destino;

	@Column(name = "dt_corrida")
	private Calendar dt_corrida;

	@Column(name = "vl_corrida", nullable = false)
	private float vl_corrida;

	public Corrida() {
		super();
	}

	public Corrida(int cd_corrida, String origem, String destino, Calendar dt_corrida, float vl_corrida) {
		super();
		this.cd_corrida = cd_corrida;
		this.origem = origem;
		this.destino = destino;
		this.dt_corrida = dt_corrida;
		this.vl_corrida = vl_corrida;
	}

	public int getCd_corrida() {
		return cd_corrida;
	}

	public void setCd_corrida(int cd_corrida) {
		this.cd_corrida = cd_corrida;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Calendar getDt_corrida() {
		return dt_corrida;
	}

	public void setDt_corrida(Calendar dt_corrida) {
		this.dt_corrida = dt_corrida;
	}

	public float getVl_corrida() {
		return vl_corrida;
	}

	public void setVl_corrida(float vl_corrida) {
		this.vl_corrida = vl_corrida;
	}

}
