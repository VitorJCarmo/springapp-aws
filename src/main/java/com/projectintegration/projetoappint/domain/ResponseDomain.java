package com.projectintegration.projetoappint.domain;


public class ResponseDomain{
	private String mensagem;
	private Integer statusCode;
	
	public ResponseDomain() {
		super();
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public Integer getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}
	
	
	
}
