package crud.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import crud.springboot.enums.AlunoClasses;

@Entity
@Table(name = "alunoweka")
public class AlunoWeka{

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "idalunoweka")
	private int id;

	@Column(name = "nome", nullable = true)
	private String nome;
	
	@Column(name = "matricula", nullable = true)
	private String matricula;

	@Column(name = "sexo", nullable = true)
	private int Sexo;
	
	@Column(name = "idade", nullable = true)
	private double Idade;
	
	@Column(name = "ZonaMoradia_ZONARESIDENCIAL", nullable = true)
	private int ZonaMoradia_ZONARESIDENCIAL;
	
	@Column(name = "ZonaMoradia_ASENTAMIENTOHUMANO", nullable = true)
	private int ZonaMoradia_ASENTAMIENTOHUMANO;
	
	@Column(name = "ZonaMoradia_URBANIZACION", nullable = true)
	private int ZonaMoradia_URBANIZACION;
	
	@Column(name = "ZonaMoradia_CASCOURBANO", nullable = true)
	private int ZonaMoradia_CASCOURBANO;
	
	@Column(name = "ZonaMoradia_PUEBLOJOVEN", nullable = true)
	private int ZonaMoradia_PUEBLOJOVEN;
	
	@Column(name = "ZonaMoradia_OTROS", nullable = true)
	private int ZonaMoradia_OTROS;
	
	@Column(name = "ZonaMoradia_ZONARURAL", nullable = true)
	private int ZonaMoradia_ZONARURAL;
	
	@Column(name = "Trabalha", nullable = true)
	private int Trabalha;
	
	@Column(name = "EstadoCivil_SOLTERO", nullable = true)
	private int EstadoCivil_SOLTERO;
	
	@Column(name = "EstadoCivil_CASADO", nullable = true)
	private int EstadoCivil_CASADO;
	
	@Column(name = "EstadoCivil_DIVORCIADO", nullable = true)
	private int EstadoCivil_DIVORCIADO;
	
	@Column(name = "EstadoCivil_DESCONOCIDO", nullable = true)
	private int EstadoCivil_DESCONOCIDO;
	
	@Column(name = "EstadoCivil_SEPARADO", nullable = true)
	private int EstadoCivil_SEPARADO;
	
	@Column(name = "EstadoCivil_CONVIVIENTE", nullable = true)
	private int EstadoCivil_CONVIVIENTE;
	
	@Column(name = "EstadoCivil_VIUDO", nullable = true)
	private int EstadoCivil_VIUDO;
	
	@Column(name = "Escola", nullable = true)
	private int Escola;
	
	@Column(name = "Religiao_CRISTIANOCATOLICO", nullable = true)
	private int Religiao_CRISTIANOCATOLICO;
	
	@Column(name = "Religiao_OTRARELIGION", nullable = true)
	private int Religiao_OTRARELIGION;
	
	@Column(name = "Religiao_CRISTIANOEVANGELICO", nullable = true)
	private int Religiao_CRISTIANOEVANGELICO;
	
	@Column(name = "Religiao_AGNOSTICO", nullable = true)
	private int Religiao_AGNOSTICO;
	
	@Column(name = "CursoGraduacao", nullable = true)
	private String CursoGraduacao;
	
	@Column(name = "Modalidade", nullable = true)
	private int Modalidade;
	
	@Column(name = "PeriodoIngreso", nullable = true)
	private double PeriodoIngreso;
	
	@Column(name = "NotaExameAdmissao", nullable = true)
	private double NotaExameAdmissao;
	
	@Column(name = "TotalNiveisCurso", nullable = true)
	private int TotalNiveisCurso;
	
	@Column(name = "TotalCreditosCurso", nullable = true)
	private double TotalCreditosCurso;
	
	@Column(name = "TotalNiveisCursados", nullable = true)
	private double TotalNiveisCursados;
	
	@Column(name = "PorcentagemNC", nullable = true)
	private double PorcentagemNC;
	
	@Column(name = "TotalCreditosCursados", nullable = true)
	private double TotalCreditosCursados;
	
	@Column(name = "PorcentagemCC", nullable = true)
	private double PorcentagemCC;
	
	@Column(name = "PeriodoUltimaMatricula", nullable = true)
	private double PeriodoUltimaMatricula;
	
	@Column(name = "UltimoNivelEstudado", nullable = true)
	private double UltimoNivelEstudado;
	
	@Column(name = "PromedioUltimoPeriodo", nullable = true)
	private double PromedioUltimoPeriodo;
	
	@Column(name = "alunoClass", nullable = true)
	private String alunoClass;

	public AlunoWeka() {
		super();
		this.alunoClass = new String(AlunoClasses.NULL.getInfo());
	}

	public AlunoWeka(int sexo, double idade, int zonaMoradia_ZONARESIDENCIAL, int zonaMoradia_ASENTAMIENTOHUMANO,
			int zonaMoradia_URBANIZACION, int zonaMoradia_CASCOURBANO, int zonaMoradia_PUEBLOJOVEN,
			int zonaMoradia_OTROS, int zonaMoradia_ZONARURAL, int trabalha, int estadoCivil_SOLTERO,
			int estadoCivil_CASADO, int estadoCivil_DIVORCIADO, int estadoCivil_DESCONOCIDO, int estadoCivil_SEPARADO,
			int estadoCivil_CONVIVIENTE, int estadoCivil_VIUDO, int escola, int religiao_CRISTIANOCATOLICO,
			int religiao_OTRARELIGION, int religiao_CRISTIANOEVANGELICO, int religiao_AGNOSTICO, String cursoGraduacao,
			int modalidade, double periodoIngreso, double notaExameAdmissao, int totalNiveisCurso,
			double totalCreditosCurso, double totalNiveisCursados, double porcentagemNC, double totalCreditosCursados,
			double porcentagemCC, double periodoUltimaMatricula, double ultimoNivelEstudado,
			double promedioUltimoPeriodo) {
		super();
		Sexo = sexo;
		Idade = idade;
		ZonaMoradia_ZONARESIDENCIAL = zonaMoradia_ZONARESIDENCIAL;
		ZonaMoradia_ASENTAMIENTOHUMANO = zonaMoradia_ASENTAMIENTOHUMANO;
		ZonaMoradia_URBANIZACION = zonaMoradia_URBANIZACION;
		ZonaMoradia_CASCOURBANO = zonaMoradia_CASCOURBANO;
		ZonaMoradia_PUEBLOJOVEN = zonaMoradia_PUEBLOJOVEN;
		ZonaMoradia_OTROS = zonaMoradia_OTROS;
		ZonaMoradia_ZONARURAL = zonaMoradia_ZONARURAL;
		Trabalha = trabalha;
		EstadoCivil_SOLTERO = estadoCivil_SOLTERO;
		EstadoCivil_CASADO = estadoCivil_CASADO;
		EstadoCivil_DIVORCIADO = estadoCivil_DIVORCIADO;
		EstadoCivil_DESCONOCIDO = estadoCivil_DESCONOCIDO;
		EstadoCivil_SEPARADO = estadoCivil_SEPARADO;
		EstadoCivil_CONVIVIENTE = estadoCivil_CONVIVIENTE;
		EstadoCivil_VIUDO = estadoCivil_VIUDO;
		Escola = escola;
		Religiao_CRISTIANOCATOLICO = religiao_CRISTIANOCATOLICO;
		Religiao_OTRARELIGION = religiao_OTRARELIGION;
		Religiao_CRISTIANOEVANGELICO = religiao_CRISTIANOEVANGELICO;
		Religiao_AGNOSTICO = religiao_AGNOSTICO;
		CursoGraduacao = cursoGraduacao;
		Modalidade = modalidade;
		PeriodoIngreso = periodoIngreso;
		NotaExameAdmissao = notaExameAdmissao;
		TotalNiveisCurso = totalNiveisCurso;
		TotalCreditosCurso = totalCreditosCurso;
		TotalNiveisCursados = totalNiveisCursados;
		PorcentagemNC = porcentagemNC;
		TotalCreditosCursados = totalCreditosCursados;
		PorcentagemCC = porcentagemCC;
		PeriodoUltimaMatricula = periodoUltimaMatricula;
		UltimoNivelEstudado = ultimoNivelEstudado;
		PromedioUltimoPeriodo = promedioUltimoPeriodo;
		this.alunoClass = new String(AlunoClasses.NULL.getInfo());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getSexo() {
		return Sexo;
	}

	public void setSexo(int sexo) {
		Sexo = sexo;
	}

	public double getIdade() {
		return Idade;
	}

	public void setIdade(double idade) {
		Idade = idade;
	}

	public int getZonaMoradia_ZONARESIDENCIAL() {
		return ZonaMoradia_ZONARESIDENCIAL;
	}

	public void setZonaMoradia_ZONARESIDENCIAL(int zonaMoradia_ZONARESIDENCIAL) {
		ZonaMoradia_ZONARESIDENCIAL = zonaMoradia_ZONARESIDENCIAL;
	}

	public int getZonaMoradia_ASENTAMIENTOHUMANO() {
		return ZonaMoradia_ASENTAMIENTOHUMANO;
	}

	public void setZonaMoradia_ASENTAMIENTOHUMANO(int zonaMoradia_ASENTAMIENTOHUMANO) {
		ZonaMoradia_ASENTAMIENTOHUMANO = zonaMoradia_ASENTAMIENTOHUMANO;
	}

	public int getZonaMoradia_URBANIZACION() {
		return ZonaMoradia_URBANIZACION;
	}

	public void setZonaMoradia_URBANIZACION(int zonaMoradia_URBANIZACION) {
		ZonaMoradia_URBANIZACION = zonaMoradia_URBANIZACION;
	}

	public int getZonaMoradia_CASCOURBANO() {
		return ZonaMoradia_CASCOURBANO;
	}

	public void setZonaMoradia_CASCOURBANO(int zonaMoradia_CASCOURBANO) {
		ZonaMoradia_CASCOURBANO = zonaMoradia_CASCOURBANO;
	}

	public int getZonaMoradia_PUEBLOJOVEN() {
		return ZonaMoradia_PUEBLOJOVEN;
	}

	public void setZonaMoradia_PUEBLOJOVEN(int zonaMoradia_PUEBLOJOVEN) {
		ZonaMoradia_PUEBLOJOVEN = zonaMoradia_PUEBLOJOVEN;
	}

	public int getZonaMoradia_OTROS() {
		return ZonaMoradia_OTROS;
	}

	public void setZonaMoradia_OTROS(int zonaMoradia_OTROS) {
		ZonaMoradia_OTROS = zonaMoradia_OTROS;
	}

	public int getZonaMoradia_ZONARURAL() {
		return ZonaMoradia_ZONARURAL;
	}

	public void setZonaMoradia_ZONARURAL(int zonaMoradia_ZONARURAL) {
		ZonaMoradia_ZONARURAL = zonaMoradia_ZONARURAL;
	}

	public int getTrabalha() {
		return Trabalha;
	}

	public void setTrabalha(int trabalha) {
		Trabalha = trabalha;
	}

	public int getEstadoCivil_SOLTERO() {
		return EstadoCivil_SOLTERO;
	}

	public void setEstadoCivil_SOLTERO(int estadoCivil_SOLTERO) {
		EstadoCivil_SOLTERO = estadoCivil_SOLTERO;
	}

	public int getEstadoCivil_CASADO() {
		return EstadoCivil_CASADO;
	}

	public void setEstadoCivil_CASADO(int estadoCivil_CASADO) {
		EstadoCivil_CASADO = estadoCivil_CASADO;
	}

	public int getEstadoCivil_DIVORCIADO() {
		return EstadoCivil_DIVORCIADO;
	}

	public void setEstadoCivil_DIVORCIADO(int estadoCivil_DIVORCIADO) {
		EstadoCivil_DIVORCIADO = estadoCivil_DIVORCIADO;
	}

	public int getEstadoCivil_DESCONOCIDO() {
		return EstadoCivil_DESCONOCIDO;
	}

	public void setEstadoCivil_DESCONOCIDO(int estadoCivil_DESCONOCIDO) {
		EstadoCivil_DESCONOCIDO = estadoCivil_DESCONOCIDO;
	}

	public int getEstadoCivil_SEPARADO() {
		return EstadoCivil_SEPARADO;
	}

	public void setEstadoCivil_SEPARADO(int estadoCivil_SEPARADO) {
		EstadoCivil_SEPARADO = estadoCivil_SEPARADO;
	}

	public int getEstadoCivil_CONVIVIENTE() {
		return EstadoCivil_CONVIVIENTE;
	}

	public void setEstadoCivil_CONVIVIENTE(int estadoCivil_CONVIVIENTE) {
		EstadoCivil_CONVIVIENTE = estadoCivil_CONVIVIENTE;
	}

	public int getEstadoCivil_VIUDO() {
		return EstadoCivil_VIUDO;
	}

	public void setEstadoCivil_VIUDO(int estadoCivil_VIUDO) {
		EstadoCivil_VIUDO = estadoCivil_VIUDO;
	}

	public int getEscola() {
		return Escola;
	}

	public void setEscola(int escola) {
		Escola = escola;
	}

	public int getReligiao_CRISTIANOCATOLICO() {
		return Religiao_CRISTIANOCATOLICO;
	}

	public void setReligiao_CRISTIANOCATOLICO(int religiao_CRISTIANOCATOLICO) {
		Religiao_CRISTIANOCATOLICO = religiao_CRISTIANOCATOLICO;
	}

	public int getReligiao_OTRARELIGION() {
		return Religiao_OTRARELIGION;
	}

	public void setReligiao_OTRARELIGION(int religiao_OTRARELIGION) {
		Religiao_OTRARELIGION = religiao_OTRARELIGION;
	}

	public int getReligiao_CRISTIANOEVANGELICO() {
		return Religiao_CRISTIANOEVANGELICO;
	}

	public void setReligiao_CRISTIANOEVANGELICO(int religiao_CRISTIANOEVANGELICO) {
		Religiao_CRISTIANOEVANGELICO = religiao_CRISTIANOEVANGELICO;
	}

	public int getReligiao_AGNOSTICO() {
		return Religiao_AGNOSTICO;
	}

	public void setReligiao_AGNOSTICO(int religiao_AGNOSTICO) {
		Religiao_AGNOSTICO = religiao_AGNOSTICO;
	}

	public String getCursoGraduacao() {
		return CursoGraduacao;
	}

	public void setCursoGraduacao(String cursoGraduacao) {
		CursoGraduacao = cursoGraduacao;
	}

	public int getModalidade() {
		return Modalidade;
	}

	public void setModalidade(int modalidade) {
		Modalidade = modalidade;
	}

	public double getPeriodoIngreso() {
		return PeriodoIngreso;
	}

	public void setPeriodoIngreso(double periodoIngreso) {
		PeriodoIngreso = periodoIngreso;
	}

	public double getNotaExameAdmissao() {
		return NotaExameAdmissao;
	}

	public void setNotaExameAdmissao(double notaExameAdmissao) {
		NotaExameAdmissao = notaExameAdmissao;
	}

	public int getTotalNiveisCurso() {
		return TotalNiveisCurso;
	}

	public void setTotalNiveisCurso(int totalNiveisCurso) {
		TotalNiveisCurso = totalNiveisCurso;
	}

	public double getTotalCreditosCurso() {
		return TotalCreditosCurso;
	}

	public void setTotalCreditosCurso(double totalCreditosCurso) {
		TotalCreditosCurso = totalCreditosCurso;
	}

	public double getTotalNiveisCursados() {
		return TotalNiveisCursados;
	}

	public void setTotalNiveisCursados(double totalNiveisCursados) {
		TotalNiveisCursados = totalNiveisCursados;
	}

	public double getPorcentagemNC() {
		return PorcentagemNC;
	}

	public void setPorcentagemNC(double porcentagemNC) {
		PorcentagemNC = porcentagemNC;
	}

	public double getTotalCreditosCursados() {
		return TotalCreditosCursados;
	}

	public void setTotalCreditosCursados(double totalCreditosCursados) {
		TotalCreditosCursados = totalCreditosCursados;
	}

	public double getPorcentagemCC() {
		return PorcentagemCC;
	}

	public void setPorcentagemCC(double porcentagemCC) {
		PorcentagemCC = porcentagemCC;
	}

	public double getPeriodoUltimaMatricula() {
		return PeriodoUltimaMatricula;
	}

	public void setPeriodoUltimaMatricula(double periodoUltimaMatricula) {
		PeriodoUltimaMatricula = periodoUltimaMatricula;
	}

	public double getUltimoNivelEstudado() {
		return UltimoNivelEstudado;
	}

	public void setUltimoNivelEstudado(double ultimoNivelEstudado) {
		UltimoNivelEstudado = ultimoNivelEstudado;
	}

	public double getPromedioUltimoPeriodo() {
		return PromedioUltimoPeriodo;
	}

	public void setPromedioUltimoPeriodo(double promedioUltimoPeriodo) {
		PromedioUltimoPeriodo = promedioUltimoPeriodo;
	}

	public String getAlunoClass() {
		return alunoClass;
	}

	public void setAlunoClass(String alunoClass) {
		this.alunoClass = alunoClass;
	}

}
