package crud.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "aluno")
public class Aluno {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "idaluno")
	private Integer id;

	private String nombre;
	private int idade;
	private String trabalha;
	private String periodoIngresso;
	private double notaExameAdmissao;
	private int totalNiveisCurso;
	private int totalCreditosCurso;
	private int totalNiveisCursados;
	private double porcentagemNiveisCursados;
	private int totalCreditosCursados;
	private double porcentagemCreditosCursados;
	private String periodoUltimaMatricula;
	private int ultimoNivelEstudado;
	private double promedioUltimoPeriodo;

	@Column(name = "class")
	private String alunoClass;

	@ManyToOne
	@JoinColumn(name = "idmoradia")
	private Moradia moradia;

	@ManyToOne
	@JoinColumn(name = "idsexo")
	private Sexo sexo;

	@ManyToOne
	@JoinColumn(name = "idestadocivil")
	private EstadoCivil estadoCivil;

	@ManyToOne
	@JoinColumn(name = "idescola")
	private Escola escola;

	@ManyToOne
	@JoinColumn(name = "idreligiao")
	private Religiao religiao;

	@ManyToOne
	@JoinColumn(name = "idcursograduacao")
	private CursoGraduacao cursoGraduacao;

	@ManyToOne
	@JoinColumn(name = "idmodalidade")
	private Modalidade modalidade;

	@OneToOne
	@JoinColumn(name = "idalunoweka")
	private AlunoWeka alunoWeka;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getTrabalha() {
		return trabalha;
	}

	public void setTrabalha(String trabalha) {
		this.trabalha = trabalha;
	}

	public String getPeriodoIngresso() {
		return periodoIngresso;
	}

	public void setPeriodoIngresso(String periodoIngresso) {
		this.periodoIngresso = periodoIngresso;
	}

	public Double getNotaExameAdmissao() {
		return notaExameAdmissao;
	}

	public void setNotaExameAdmissao(Double notaExameAdmissao) {
		this.notaExameAdmissao = notaExameAdmissao;
	}

	public Integer getTotalNiveisCurso() {
		return totalNiveisCurso;
	}

	public void setTotalNiveisCurso(Integer totalNiveisCurso) {
		this.totalNiveisCurso = totalNiveisCurso;
	}

	public Integer getTotalCreditosCurso() {
		return totalCreditosCurso;
	}

	public void setTotalCreditosCurso(Integer totalCreditosCurso) {
		this.totalCreditosCurso = totalCreditosCurso;
	}

	public Integer getTotalNiveisCursados() {
		return totalNiveisCursados;
	}

	public void setTotalNiveisCursados(Integer totalNiveisCursados) {
		this.totalNiveisCursados = totalNiveisCursados;
	}

	public Double getPorcentagemNiveisCursados() {
		return porcentagemNiveisCursados;
	}

	public void setPorcentagemNiveisCursados(Double porcentagemNiveisCursados) {
		this.porcentagemNiveisCursados = porcentagemNiveisCursados;
	}

	public Integer getTotalCreditosCursados() {
		return totalCreditosCursados;
	}

	public void setTotalCreditosCursados(Integer totalCreditosCursados) {
		this.totalCreditosCursados = totalCreditosCursados;
	}

	public Double getPorcentagemCreditosCursados() {
		return porcentagemCreditosCursados;
	}

	public void setPorcentagemCreditosCursados(Double porcentagemCreditosCursados) {
		this.porcentagemCreditosCursados = porcentagemCreditosCursados;
	}

	public String getPeriodoUltimaMatricula() {
		return periodoUltimaMatricula;
	}

	public void setPeriodoUltimaMatricula(String periodoUltimaMatricula) {
		this.periodoUltimaMatricula = periodoUltimaMatricula;
	}

	public Integer getUltimoNivelEstudado() {
		return ultimoNivelEstudado;
	}

	public void setUltimoNivelEstudado(Integer ultimoNivelEstudado) {
		this.ultimoNivelEstudado = ultimoNivelEstudado;
	}

	public Double getPromedioUltimoPeriodo() {
		return promedioUltimoPeriodo;
	}

	public void setPromedioUltimoPeriodo(Double promedioUltimoPeriodo) {
		this.promedioUltimoPeriodo = promedioUltimoPeriodo;
	}

	public Moradia getMoradia() {
		return moradia;
	}

	public void setMoradia(Moradia moradia) {
		this.moradia = moradia;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public Escola getEscola() {
		return escola;
	}

	public void setEscola(Escola escola) {
		this.escola = escola;
	}

	public Religiao getReligiao() {
		return religiao;
	}

	public void setReligiao(Religiao religiao) {
		this.religiao = religiao;
	}

	public CursoGraduacao getCursoGraduacao() {
		return cursoGraduacao;
	}

	public void setCursoGraduacao(CursoGraduacao cursoGraduacao) {
		this.cursoGraduacao = cursoGraduacao;
	}

	public Modalidade getModalidade() {
		return modalidade;
	}

	public void setModalidade(Modalidade modalidade) {
		this.modalidade = modalidade;
	}

	public String getAlunoClass() {
		return alunoClass;
	}

	public void setAlunoClass(String alunoClass) {
		this.alunoClass = alunoClass;
	}

	public AlunoWeka getAlunoWeka() {
		return alunoWeka;
	}

	public void setAlunoWeka(AlunoWeka alunoWeka) {
		this.alunoWeka = alunoWeka;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setNotaExameAdmissao(double notaExameAdmissao) {
		this.notaExameAdmissao = notaExameAdmissao;
	}

	public void setTotalNiveisCurso(int totalNiveisCurso) {
		this.totalNiveisCurso = totalNiveisCurso;
	}

	public void setTotalCreditosCurso(int totalCreditosCurso) {
		this.totalCreditosCurso = totalCreditosCurso;
	}

	public void setTotalNiveisCursados(int totalNiveisCursados) {
		this.totalNiveisCursados = totalNiveisCursados;
	}

	public void setPorcentagemNiveisCursados(double porcentagemNiveisCursados) {
		this.porcentagemNiveisCursados = porcentagemNiveisCursados;
	}

	public void setTotalCreditosCursados(int totalCreditosCursados) {
		this.totalCreditosCursados = totalCreditosCursados;
	}

	public void setPorcentagemCreditosCursados(double porcentagemCreditosCursados) {
		this.porcentagemCreditosCursados = porcentagemCreditosCursados;
	}

	public void setUltimoNivelEstudado(int ultimoNivelEstudado) {
		this.ultimoNivelEstudado = ultimoNivelEstudado;
	}

	public void setPromedioUltimoPeriodo(double promedioUltimoPeriodo) {
		this.promedioUltimoPeriodo = promedioUltimoPeriodo;
	}

	@Override
	public String toString() {
		return "Aluno [id=" + id + ", nombre=" + nombre + ", idade=" + idade + ", trabalha=" + trabalha
				+ ", periodoIngresso=" + periodoIngresso + ", notaExameAdmissao=" + notaExameAdmissao
				+ ", totalNiveisCurso=" + totalNiveisCurso + ", totalCreditosCurso=" + totalCreditosCurso
				+ ", totalNiveisCursados=" + totalNiveisCursados + ", porcentagemNiveisCursados="
				+ porcentagemNiveisCursados + ", totalCreditosCursados=" + totalCreditosCursados
				+ ", porcentagemCreditosCursados=" + porcentagemCreditosCursados + ", periodoUltimaMatricula="
				+ periodoUltimaMatricula + ", ultimoNivelEstudado=" + ultimoNivelEstudado + ", promedioUltimoPeriodo="
				+ promedioUltimoPeriodo + ", alunoClass=" + alunoClass + ", moradia=" + moradia + ", sexo=" + sexo
				+ ", estadoCivil=" + estadoCivil + ", escola=" + escola + ", religiao=" + religiao + ", cursoGraduacao="
				+ cursoGraduacao + ", modalidade=" + modalidade + "]";
	}

}
