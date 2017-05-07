package setor;

import java.sql.Date;

public class Setor {
	
	private long idSetor;
	private String setor;
	private Date dataCriacao;
	private Date dataAtualizacao;
	private String criador;
	private String atualizador;
	private boolean ativo;
	
	//getters e setters:
	public long getIdSetor() {
		return idSetor;
	}
	public void setIdSetor(long idSetor) {
		this.idSetor = idSetor;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public Date getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	public Date getDataAtualizacao() {
		return dataAtualizacao;
	}
	public void setDataAtualizacao(Date dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}
	public String getCriador() {
		return criador;
	}
	public void setCriador(String criador) {
		this.criador = criador;
	}
	public String getAtualizador() {
		return atualizador;
	}
	public void setAtualizador(String atualizador) {
		this.atualizador = atualizador;
	}
	public boolean getAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	
	
	

}
