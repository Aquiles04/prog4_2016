package br.silveiraalexand.bsi.model;

import java.util.Date;

import javax.validation.constraints.*;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

public class Cliente {
	
	private Long id;
	
	@Size(min=7, message="Nome deve conter pelo menos 7 caracteres")
	private String nome;
	
	@NotNull(message="CPF não pode estar em branco")
	@Digits(integer=11, fraction=0, message="Informe o CPF, somente numeros.")
	private Long cpf;
	
	@NotNull(message="Data de nascimento deve ser preenchida")
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	private Date dataNascimento;
	
	@Pattern(regexp="(M|F)", message = "Sexo inválido")
	private String sexo;
	
	@Size(min=6, max=15)
	private String senha;
	
	@NotNull
	private Boolean receberOfertaPorEmail;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Long getCpf() {
		return cpf;
	}
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Boolean getReceberOfertaPorEmail() {
		return receberOfertaPorEmail;
	}
	public void setReceberOfertaPorEmail(Boolean receberOfertaPorEmail) {
		this.receberOfertaPorEmail = receberOfertaPorEmail;
	}
	

}
