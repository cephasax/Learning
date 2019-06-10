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

	private String periodoingreso;
	private double notaexameadmissao;
	private int totalniveiscurso;
	private int totacreditoscurso;
	private int totalniveiscursados;
	private double porcentagemniveiscursados;
	private int totalcreditoscursados;
	private double porcentagemcreditoscursados;
	private String periodoultimamatricula;
	private int ultimonivelestudado;
	private double promedioultimoperiodo;

	@ManyToOne
	@JoinColumn(name="id_moradia")
	private Moradia moradia;
	
	@ManyToOne
	@JoinColumn(name="id_sexo")
	private Sexo sexo;
	
	@ManyToOne
	@JoinColumn(name="id_estado_civil")
	private EstadoCivil estadoCivil;
	
	@ManyToOne
	@JoinColumn(name="id_escola")
	private Escola escola;
	
	@ManyToOne
	@JoinColumn(name="id_religiao")
	private Religiao religiao;
	
	@ManyToOne
	@JoinColumn(name="id_curso_graduacao")
	private CursoGraduacao cursoGraduacao;
	
	@ManyToOne
	@JoinColumn(name="id_modalidade")
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

	public String getPeriodoingreso() {
		return periodoingreso;
	}

	public void setPeriodoingreso(String periodoingreso) {
		this.periodoingreso = periodoingreso;
	}

	public double getNotaexameadmissao() {
		return notaexameadmissao;
	}

	public void setNotaexameadmissao(double notaexameadmissao) {
		this.notaexameadmissao = notaexameadmissao;
	}

	public int getTotalniveiscurso() {
		return totalniveiscurso;
	}

	public void setTotalniveiscurso(int totalniveiscurso) {
		this.totalniveiscurso = totalniveiscurso;
	}

	public int getTotacreditoscurso() {
		return totacreditoscurso;
	}

	public void setTotacreditoscurso(int totacreditoscurso) {
		this.totacreditoscurso = totacreditoscurso;
	}

	public int getTotalniveiscursados() {
		return totalniveiscursados;
	}

	public void setTotalniveiscursados(int totalniveiscursados) {
		this.totalniveiscursados = totalniveiscursados;
	}

	public double getPorcentagemniveiscursados() {
		return porcentagemniveiscursados;
	}

	public void setPorcentagemniveiscursados(double porcentagemniveiscursados) {
		this.porcentagemniveiscursados = porcentagemniveiscursados;
	}

	public int getTotalcreditoscursados() {
		return totalcreditoscursados;
	}

	public void setTotalcreditoscursados(int totalcreditoscursados) {
		this.totalcreditoscursados = totalcreditoscursados;
	}

	public double getPorcentagemcreditoscursados() {
		return porcentagemcreditoscursados;
	}

	public void setPorcentagemcreditoscursados(double porcentagemcreditoscursados) {
		this.porcentagemcreditoscursados = porcentagemcreditoscursados;
	}

	public String getPeriodoultimamatricula() {
		return periodoultimamatricula;
	}

	public void setPeriodoultimamatricula(String periodoultimamatricula) {
		this.periodoultimamatricula = periodoultimamatricula;
	}

	public int getUltimonivelestudado() {
		return ultimonivelestudado;
	}

	public void setUltimonivelestudado(int ultimonivelestudado) {
		this.ultimonivelestudado = ultimonivelestudado;
	}

	public double getPromedioultimoperiodo() {
		return promedioultimoperiodo;
	}

	public void setPromedioultimoperiodo(double promedioultimoperiodo) {
		this.promedioultimoperiodo = promedioultimoperiodo;
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

}
