package br.com.projetofinal.model;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="tb_solicitacoes")
@Entity
public class Solicitacao {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="num_seq")
	private int numSeq;
	
	@Column(name="pdv_id")
	private int pdvId;
	
	@Column(name="nome_tecnico", length=100)
	private String nomeTec;
	
	@Column(name="operadora", length=50)
	private String operadora;
	
	@Column(name="telefone", length=20)
	private String telefone;
	
	@Column(name="doc", length=20)
	private String doc;
	
	@Column(name="data")
	private Date data;
	
	@Column(name="hora")
	private Time hora;
	
	@Column(name="status")
	private int status;

	public Solicitacao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Solicitacao(int numSeq, int pdvId, String nomeTec, String operadora, String telefone, String doc, Date data,
			Time hora, int status) {
		super();
		this.numSeq = numSeq;
		this.pdvId = pdvId;
		this.nomeTec = nomeTec;
		this.operadora = operadora;
		this.telefone = telefone;
		this.doc = doc;
		this.data = data;
		this.hora = hora;
		this.status = status;
	}

	public int getNumSeq() {
		return numSeq;
	}

	public void setNumSeq(int numSeq) {
		this.numSeq = numSeq;
	}

	public int getPdvId() {
		return pdvId;
	}

	public void setPdvId(int pdvId) {
		this.pdvId = pdvId;
	}

	public String getNomeTec() {
		return nomeTec;
	}

	public void setNomeTec(String nomeTec) {
		this.nomeTec = nomeTec;
	}

	public String getOperadora() {
		return operadora;
	}

	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getDoc() {
		return doc;
	}

	public void setDoc(String doc) {
		this.doc = doc;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Time getHora() {
		return hora;
	}

	public void setHora(Time hora) {
		this.hora = hora;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	
	
	
}
