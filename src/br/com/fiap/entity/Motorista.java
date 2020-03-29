package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "T_MOTORISTA")
public class Motorista {
	
	@Id
	@Column(name = "nr_carteira", nullable = false)
	private int nr_carteira;
	
	@Column(name = "nm_nome", nullable = false, length = 150)
	private String nome;
	
	@Column(name = "")
	private Calendar dt_nascimento;
	
	@Lob
	@Column(name = "fl_carteiro")
	private byte[] fl_carteira;
	
	@Column(name = "ds_genero")
	private String ds_genero;
	
}
