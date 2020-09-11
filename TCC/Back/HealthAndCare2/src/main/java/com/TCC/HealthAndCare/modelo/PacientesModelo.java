package com.TCC.HealthAndCare.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name="pacientes")
@Entity
public class PacientesModelo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="codigo")
	private int codigo;
	
	@Column(name="paciente")
	private String paciente;
	
	@Column(name="internacao")
	private String internacao;
	
	@Column(name="sexo")
	private String sexo;
	
	@Column(name="idade")
	private int idade;
	
	@Column(name="complicacao")
	private String complicacao;
	
	@Column(name="afeccao")
	private String afeccao;
	
	@Column(name="iniciais")
	private String iniciais;
	
	@Column(name="CPF")
	private String CPF;
	
	@Column (name="endereco")
	private String endereco;
	
	@Column(name="numero")
	private int numero;
	
	@Column(name="telefone")
	private String telefone;
	
	@Column(name="ocupacao")
	private String ocupacao;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getPaciente() {
		return paciente;
	}

	public void setPaciente(String paciente) {
		this.paciente = paciente;
	}

	public String getInternacao() {
		return internacao;
	}

	public void setInternacao(String internacao) {
		this.internacao = internacao;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getComplicacao() {
		return complicacao;
	}

	public void setComplicacao(String complicacao) {
		this.complicacao = complicacao;
	}

	public String getAfeccao() {
		return afeccao;
	}

	public void setAfeccao(String afeccao) {
		this.afeccao = afeccao;
	}

	public String getIniciais() {
		return iniciais;
	}

	public void setIniciais(String iniciais) {
		this.iniciais = iniciais;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getOcupacao() {
		return ocupacao;
	}

	public void setOcupacao(String ocupacao) {
		this.ocupacao = ocupacao;
	}

	
}





