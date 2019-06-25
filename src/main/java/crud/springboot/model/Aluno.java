package crud.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "aluno")
public class Aluno {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id_aluno")
	private int id;

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

	private String matricula;

	@ManyToOne
	@JoinColumn(name = "id_moradia")
	private Moradia moradia;

	@ManyToOne
	@JoinColumn(name = "id_sexo")
	private Sexo sexo;

	@ManyToOne
	@JoinColumn(name = "id_estado_civil")
	private EstadoCivil estadoCivil;

	@ManyToOne
	@JoinColumn(name = "id_escola")
	private Escola escola;

	@ManyToOne
	@JoinColumn(name = "id_religiao")
	private Religiao religiao;

	@ManyToOne
	@JoinColumn(name = "id_curso_graduacao")
	private CursoGraduacao cursoGraduacao;

	@ManyToOne
	@JoinColumn(name = "id_modalidade")
	private Modalidade modalidade;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
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

	public double getNotaExameAdmissao() {
		return notaExameAdmissao;
	}

	public void setNotaExameAdmissao(double notaExameAdmissao) {
		this.notaExameAdmissao = notaExameAdmissao;
	}

	public int getTotalNiveisCurso() {
		return totalNiveisCurso;
	}

	public void setTotalNiveisCurso(int totalNiveisCurso) {
		this.totalNiveisCurso = totalNiveisCurso;
	}

	public int getTotalCreditosCurso() {
		return totalCreditosCurso;
	}

	public void setTotalCreditosCurso(int totalCreditosCurso) {
		this.totalCreditosCurso = totalCreditosCurso;
	}

	public int getTotalNiveisCursados() {
		return totalNiveisCursados;
	}

	public void setTotalNiveisCursados(int totalNiveisCursados) {
		this.totalNiveisCursados = totalNiveisCursados;
	}

	public double getPorcentagemNiveisCursados() {
		return porcentagemNiveisCursados;
	}

	public void setPorcentagemNiveisCursados(double porcentagemNiveisCursados) {
		this.porcentagemNiveisCursados = porcentagemNiveisCursados;
	}

	public int getTotalCreditosCursados() {
		return totalCreditosCursados;
	}

	public void setTotalCreditosCursados(int totalCreditosCursados) {
		this.totalCreditosCursados = totalCreditosCursados;
	}

	public double getPorcentagemCreditosCursados() {
		return porcentagemCreditosCursados;
	}

	public void setPorcentagemCreditosCursados(double porcentagemCreditosCursados) {
		this.porcentagemCreditosCursados = porcentagemCreditosCursados;
	}

	public String getPeriodoUltimaMatricula() {
		return periodoUltimaMatricula;
	}

	public void setPeriodoUltimaMatricula(String periodoUltimaMatricula) {
		this.periodoUltimaMatricula = periodoUltimaMatricula;
	}

	public int getUltimoNivelEstudado() {
		return ultimoNivelEstudado;
	}

	public void setUltimoNivelEstudado(int ultimoNivelEstudado) {
		this.ultimoNivelEstudado = ultimoNivelEstudado;
	}

	public double getPromedioUltimoPeriodo() {
		return promedioUltimoPeriodo;
	}

	public void setPromedioUltimoPeriodo(double promedioUltimoPeriodo) {
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

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

}
