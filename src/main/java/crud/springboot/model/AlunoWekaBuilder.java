package crud.springboot.model;

public class AlunoWekaBuilder {

	private static int MIN_IDADE = 14;
	private static int MAX_IDADE = 68;
		
	private static String MIN_PERIODO_INGRESO = "201000";
	private static String MAX_PERIODO_INGRESO = "201900";
	
	private static double MIN_NOTA_EXAME_ADMISSAO = 0;
	private static double MAX_NOTA_EXAME_ADMISSAO = 100;
	
	private static int MIN_TOTAL_NIVEIS_CURSO = 10;
	private static int MAX_TOTAL_NIVEIS_CURSO = 12;
	
	private static double MIN_TOTAL_CREDITOS_CURSO = 200;
	private static double MAX_TOTAL_CREDITOS_CURSO = 240;
	
	private static double MIN_TOTAL_NIVEIS_CURSADOS = 1;
	private static double MAX_TOTAL_NIVEIS_CURSADOS = 13;
	
	private static double MIN_PORCENTAGEM_NIVEIS_CURSADOS = 8.333333333;
	private static double MAX_PORCENTAGEM_NIVEIS_CURSADOS = 130;
	
	private static double MIN_TOTAL_CREDITOS_CURSADOS = 2;
	private static double MAX_TOTAL_CREDITOS_CURSADOS = 250;
	
	private static double MIN_PORCENTAGEM_CREDITOS_CURSADOS = 0.952380952;
	private static double MAX_PORCENTAGEM_CREDITOS_CURSADOS = 125;
	
	private static String MIN_PERIODO_ULTIMA_MATRICULA = "201000";
	private static String MAX_PERIODO_ULTIMA_MATRICULA = "201900";
	
	private static double MIN_ULTIMO_NIVEL_ESTUDADO = 1;
	private static double MAX_ULTIMO_NIVEL_ESTUDADO = 12;
	
	private static double MIN_PROMEDIO_ULTIMO_PERIODO = 0;
	private static double MAX_PROMEDIO_ULTIMO_PERIODO = 19.67;

	
	
	public static AlunoWeka buildAlunoWeka(Aluno aluno) {
		AlunoWeka alunoWeka = new AlunoWeka();
		return alunoWeka;
	}
	
	private AlunoWeka build(Aluno aluno) {
		AlunoWeka alunoWeka = new AlunoWeka();
		
		makeSexo(aluno, alunoWeka);
		makeIdade(aluno, alunoWeka);
		makeZonaMoradia(aluno, alunoWeka);
		makeTrabalha(aluno, alunoWeka);
		makeEstadoCivil(aluno, alunoWeka);
		makeEscola(aluno, alunoWeka);
		makeReligiao(aluno, alunoWeka);
		makeCursoGraduacao(aluno, alunoWeka);
		makeModalidade(aluno, alunoWeka);
		makePeriodoIngreso(aluno, alunoWeka);
		makeNotaExameAdmissao(aluno, alunoWeka);
		makeTotalNiveisCurso(aluno, alunoWeka);
		makeTotalCreditosCurso(aluno, alunoWeka);
		
		return alunoWeka;
	
	}
	
	private static void makeSexo(Aluno aluno, AlunoWeka alunoWeka) {
		switch(aluno.getSexo().getDescripcion()) {
			case("FEMININO"):{
				alunoWeka.setSexo(0);
				break;
			}
			case("MASCULINO"):{
				alunoWeka.setSexo(1);
				break;
			}
		}
	}
	
	private static void makeIdade(Aluno aluno, AlunoWeka alunoWeka) {
		alunoWeka.setIdade(normalize(MIN_IDADE, MAX_IDADE, aluno.getIdade()));
	}
	
	private static void makeZonaMoradia(Aluno aluno, AlunoWeka alunoWeka) {
		switch (aluno.getMoradia().getDescripcion()){
			case("ASENTAMIENTO HUMANO"): {
				alunoWeka.setZonaMoradia_ASENTAMIENTOHUMANO(1);
				break;
			}
			case("CASCOURBANO"):{
				alunoWeka.setZonaMoradia_CASCOURBANO(1);
				break;
			}
			case("OTROS"):{
				alunoWeka.setZonaMoradia_OTROS(1);
				break;
			}
			case("PUEBLO JOVEN"):{
				alunoWeka.setZonaMoradia_PUEBLOJOVEN(1);
				break;
			}
			case("URBANIZACION"): {
				alunoWeka.setZonaMoradia_URBANIZACION(1);
				break;
			}
			case ("ZONA RESIDENCIAL"):{
				alunoWeka.setZonaMoradia_ZONARESIDENCIAL(1);
				break;
			}
			case ("ZONA RURAL"):{
				alunoWeka.setZonaMoradia_ZONARURAL(1);
				break;
			}
		}
	}
	
	private static void makeTrabalha(Aluno aluno, AlunoWeka alunoWeka) {
		alunoWeka.setTrabalha(Integer.valueOf(aluno.getTrabalha()));
	}
	
	private static void makeEstadoCivil(Aluno aluno, AlunoWeka alunoWeka) {
		
		switch(aluno.getEstadoCivil().getDescripcion()){
			case("CASADO"):{
				alunoWeka.setEstadoCivil_CASADO(1);
				break;
			}
			case("CONVIVIENTE"):{
				alunoWeka.setEstadoCivil_CONVIVIENTE(1);
				break;
			}
			case("DESCONOCIDO"):{
				alunoWeka.setEstadoCivil_DESCONOCIDO(1);
				break;
			}
			case("DIVORCIADO"):{
				alunoWeka.setEstadoCivil_DIVORCIADO(1);
				break;
			}
			case("SEPARADO"):{
				alunoWeka.setEstadoCivil_SEPARADO(1);
				break;
			}
			case("SOLTERO"):{
				alunoWeka.setEstadoCivil_SEPARADO(1);
				break;
			}
			case("VIUDO"):{
				alunoWeka.setEstadoCivil_VIUDO(1);
				break;
			}
			
		}
	}

	//CHECAR COM CARLOS - estava 1 e 2 e na base do modelo tem 0 e 1
	private static void makeEscola(Aluno aluno, AlunoWeka alunoWeka) {
		switch(aluno.getEscola().getDescripcion()) {
			case("NACIONAL"):{
				alunoWeka.setEscola(0);
				break;
			}
			case("PARTICULAR"):{
				alunoWeka.setEscola(1);
				break;
			}
		}
	}

	private static void makeReligiao(Aluno aluno, AlunoWeka alunoWeka) {
		switch(aluno.getReligiao().getDescripcion()){
			case("AGNOSTICO"):{
				alunoWeka.setReligiao_AGNOSTICO(1);
				break;
			}
			case("CRISTIANOCATOLICO"):{
				alunoWeka.setReligiao_CRISTIANOCATOLICO(1);
				break;
			}	
			case("CRISTIANOEVANGELICO"):{
				alunoWeka.setReligiao_CRISTIANOEVANGELICO(1);
				break;
			}
			case("OTRARELIGION"):{
				alunoWeka.setReligiao_OTRARELIGION(1);
				break;
			}
		}
	}

	private static void makeCursoGraduacao(Aluno aluno, AlunoWeka alunoWeka) {
		
		switch(aluno.getCursoGraduacao().getDescripcion()) {
			case("ENGENHARIA CIVIL"):{
				alunoWeka.setCursoGraduacao("ENGENHARIA CIVIL");
				break;
			}
			case("ODONTOLOGIA"):{
				alunoWeka.setCursoGraduacao("ODONTOLOGIA");
				break;
			}
			case("ADMINISTRACAO"):{
				alunoWeka.setCursoGraduacao("ADMINISTRACAO");
				break;
			}
			case("ENFERMAGEM"):{
				alunoWeka.setCursoGraduacao("ENFERMAGEM");
				break;
			}
			case("OBSTETRICIA"):{
				alunoWeka.setCursoGraduacao("OBSTETRICIA");
				break;
			}
			case("ADMINISTRACAO TURISTICA"):{
				alunoWeka.setCursoGraduacao("ADMINISTRACAO TURISTICA");
				break;
			}
			case("PSICOLOGIA"):{
				alunoWeka.setCursoGraduacao("PSICOLOGIA");
				break;
			}
			case("CONTABILIDADE"):{
				alunoWeka.setCursoGraduacao("CONTABILIDADE");
				break;
			}
			case("EDUCACAO SECUNDARIA ESP. MATEMATICA, FIS E COM"):{
				alunoWeka.setCursoGraduacao("EDUCACAO SECUNDARIA ESP. MATEMATICA, FIS E COM");
				break;
			}
			case("EDUCACAO SECUNDARIA ESP. LINGUA, LIT E COM"):{
				alunoWeka.setCursoGraduacao("EDUCACAO SECUNDARIA ESP. LINGUA, LIT E COM");
				break;
			}
			case("EDUCACAO SECUNDARIA ESP. HISTORIA, GEO E CIE"):{
				alunoWeka.setCursoGraduacao("EDUCACAO SECUNDARIA ESP. HISTORIA, GEO E CIE");
				break;
			}
			case("EDUCACAO EM CIENCIAS RELIGIOSAS"):{
				alunoWeka.setCursoGraduacao("EDUCACAO EM CIENCIAS RELIGIOSAS");
				break;
			}
			case("EDUCACAO PRIMARIA"):{
				alunoWeka.setCursoGraduacao("EDUCACAO PRIMARIA");
				break;
			}
			case("DIREITO"):{
				alunoWeka.setCursoGraduacao("DIREITO");
				break;
			}
			case("EDUCACAO INICIAL"):{
				alunoWeka.setCursoGraduacao("EDUCACAO INICIAL");
				break;
			}
			case("FARMACIA E BIOQUIMICA"):{
				alunoWeka.setCursoGraduacao("FARMACIA E BIOQUIMICA");
				break;
			}
			case("ENGENHARIA DE SISTEMAS"):{
				alunoWeka.setCursoGraduacao("ENGENHARIA DE SISTEMAS");
				break;
			}
		}
	}

	private static void makeModalidade(Aluno aluno, AlunoWeka alunoWeka) {
		switch(aluno.getModalidade().getDescripcion()) {
			case("PRESENCIAL"):{
				alunoWeka.setModalidade(0);
				break;
			}
			case("DISTANCIA"):{
				alunoWeka.setModalidade(1);
				break;
			}
		}
	}

	//CHECAR COM CARLOS
	private static void makePeriodoIngreso(Aluno aluno, AlunoWeka alunoWeka) {
		if (aluno.getPeriodoIngresso().equals(MIN_PERIODO_INGRESO)) {
			alunoWeka.setPeriodoIngreso(0);
		} 
		else if (aluno.getPeriodoIngresso().equals(MAX_PERIODO_INGRESO)) {
			alunoWeka.setPeriodoIngreso(1);
		}
	}

	//CHECAR COM CARLOS
	private static void makeNotaExameAdmissao(Aluno aluno, AlunoWeka alunoWeka) {
		Double d = normalize(MIN_NOTA_EXAME_ADMISSAO, MAX_NOTA_EXAME_ADMISSAO, aluno.getNotaExameAdmissao());
		alunoWeka.setNotaExameAdmissao(d);
	}
	
	//CHECAR COM CARLOS
	private static void makeTotalNiveisCurso(Aluno aluno, AlunoWeka alunoWeka) {
	
		if (aluno.getTotalNiveisCurso() == MIN_TOTAL_NIVEIS_CURSO) {
			alunoWeka.setNotaExameAdmissao(0);
		}
		else if (aluno.getTotalNiveisCurso() == MAX_TOTAL_NIVEIS_CURSO) {
			alunoWeka.setNotaExameAdmissao(1);
		}
	}
	
	//CHECAR COM CARLOS
	private static void makeTotalCreditosCurso(Aluno aluno, AlunoWeka alunoWeka) {
		Double d = normalize(MIN_TOTAL_CREDITOS_CURSO, MAX_TOTAL_CREDITOS_CURSO, aluno.getTotaCreditosCurso());
		alunoWeka.setTotalCreditosCurso(d);
	}

	
	
	private static double normalize(double min, double max, double actual) {
		return (actual - min) / (max - min);
	}

}
