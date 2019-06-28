package crud.springboot.model;

public class AlunoWekaBuilder {

	private static int MIN_IDADE = 14;
	private static int MAX_IDADE = 68;
	
	//logica para contar os semestres a partir de 2010 -> inicia em 0
	private static String MIN_PERIODO_INGRESO = "201000";
	private static String MAX_PERIODO_INGRESO = "201900";
	private static int MIN_PERIODO_INGRESO_CONT = 0;
	private static int MAX_PERIODO_INGRESO_CONT = 18;
	
	private static int MIN_ID_CURSO_GRADUCAO = 1;
	private static int MAX_ID_CURSO_GRADUCAO = 34;
	
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
	private static int MIN_PERIODO_ULTIMA_MATRICULA_CONT = 0;
	private static int MAX_PERIODO_ULTIMA_MATRICULA_CONT = 18;
	
	private static double MIN_ULTIMO_NIVEL_ESTUDADO = 1;
	private static double MAX_ULTIMO_NIVEL_ESTUDADO = 12;
	
	private static double MIN_PROMEDIO_ULTIMO_PERIODO = 0;
	private static double MAX_PROMEDIO_ULTIMO_PERIODO = 19.67;

	public static AlunoWeka buildAlunoWeka(Aluno aluno) {
		AlunoWeka alunoWeka = build(aluno);
		return alunoWeka;
	}
	
	private static AlunoWeka build(Aluno aluno) {
		AlunoWeka alunoWeka = new AlunoWeka();
		
		makeIdAlunoWeka(aluno, alunoWeka);
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
		makeTotalNiveisCursados(aluno, alunoWeka);
		makePercentNiveisCursados(aluno, alunoWeka);
		makeTotalCreditosCursados(aluno, alunoWeka);
		makePercentCreditosCursados(aluno, alunoWeka);
		makePeriodoUltimaMatricula(aluno, alunoWeka);
		makeUltimoNivelEstudado(aluno, alunoWeka);
		makePromedioUltimoAno(aluno, alunoWeka);
		
		return alunoWeka;
	
	}
	
	private static void makeIdAlunoWeka(Aluno aluno, AlunoWeka alunoWeka) {
		alunoWeka.setId(aluno.getId());
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
		switch(aluno.getTrabalha()){
			case("N"):{
				alunoWeka.setTrabalha(0);
				break;
			}
			case("S"):{
				alunoWeka.setTrabalha(1);
				break;
			}
		}
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
		Double d = normalize(MIN_ID_CURSO_GRADUCAO, MAX_ID_CURSO_GRADUCAO, aluno.getCursoGraduacao().getId());
		alunoWeka.setCursoGraduacao(d);
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

	private static void makePeriodoIngreso(Aluno aluno, AlunoWeka alunoWeka) {
		int qtdPeriodos = calcQtdPeriodo(MIN_PERIODO_INGRESO, aluno.getPeriodoIngresso());
		alunoWeka.setPeriodoIngreso(normalize(MIN_PERIODO_INGRESO_CONT, MAX_PERIODO_INGRESO_CONT, qtdPeriodos));
	}

	private static void makeNotaExameAdmissao(Aluno aluno, AlunoWeka alunoWeka) {
		Double d = normalize(MIN_NOTA_EXAME_ADMISSAO, MAX_NOTA_EXAME_ADMISSAO, aluno.getNotaExameAdmissao());
		alunoWeka.setNotaExameAdmissao(d);
	}
	
	//Por enquanto só a cursos com 10 níveis e com 12 níveis, ajeitar essa lógica sem quebrar a base original
	private static void makeTotalNiveisCurso(Aluno aluno, AlunoWeka alunoWeka) {
	
		if (aluno.getTotalNiveisCurso() == MIN_TOTAL_NIVEIS_CURSO) {
			alunoWeka.setNotaExameAdmissao(0);
		}
		else if (aluno.getTotalNiveisCurso() == MAX_TOTAL_NIVEIS_CURSO) {
			alunoWeka.setTotalNiveisCurso(1);
		}
	}
	
	private static void makeTotalCreditosCurso(Aluno aluno, AlunoWeka alunoWeka) {
		Double d = normalize(MIN_TOTAL_CREDITOS_CURSO, MAX_TOTAL_CREDITOS_CURSO, aluno.getTotalCreditosCurso());
		alunoWeka.setTotalCreditosCurso(d);
	}

	private static void makeTotalNiveisCursados(Aluno aluno, AlunoWeka alunoWeka) {
		double d = normalize(MIN_TOTAL_NIVEIS_CURSADOS, MAX_TOTAL_NIVEIS_CURSADOS, aluno.getTotalNiveisCursados());
		alunoWeka.setTotalNiveisCursados(d);
	}
	
	private static void makePercentNiveisCursados(Aluno aluno, AlunoWeka alunoWeka) {
		double d = (double)aluno.getTotalNiveisCursados() / aluno.getTotalNiveisCurso();
		alunoWeka.setPorcentagemNC(d);
	}
	
	//porcentagem de niveis e creditos curso são o valor absoluto dele dividido pelo total do curso
	private static void makeTotalCreditosCursados(Aluno aluno, AlunoWeka alunoWeka) {
		double d = normalize(MIN_TOTAL_CREDITOS_CURSADOS, MAX_TOTAL_CREDITOS_CURSADOS, aluno.getTotalCreditosCursados());
		alunoWeka.setTotalCreditosCursados(d);
	}
	
	private static void makePercentCreditosCursados(Aluno aluno, AlunoWeka alunoWeka) {
		double d = (double)aluno.getTotalCreditosCursados() / aluno.getTotalCreditosCurso();
		alunoWeka.setPorcentagemCC(d);
	}
	
	private static void makePeriodoUltimaMatricula(Aluno aluno, AlunoWeka alunoWeka) {
		int ultimoPeriodo = calcQtdPeriodo(MIN_PERIODO_ULTIMA_MATRICULA, aluno.getPeriodoUltimaMatricula());
		alunoWeka.setPeriodoUltimaMatricula(normalize(MIN_PERIODO_ULTIMA_MATRICULA_CONT, 
				MAX_PERIODO_ULTIMA_MATRICULA_CONT, ultimoPeriodo));
	}
	
	private static void makeUltimoNivelEstudado(Aluno aluno, AlunoWeka alunoWeka) {
		double d = normalize(MIN_ULTIMO_NIVEL_ESTUDADO,MAX_ULTIMO_NIVEL_ESTUDADO, aluno.getUltimoNivelEstudado());
		alunoWeka.setUltimoNivelEstudado(d);
	}

	private static void  makePromedioUltimoAno(Aluno aluno, AlunoWeka alunoWeka) {
		double d = normalize(MIN_PROMEDIO_ULTIMO_PERIODO, MAX_PROMEDIO_ULTIMO_PERIODO, aluno.getPromedioUltimoPeriodo());
		alunoWeka.setPromedioUltimoPeriodo(d);
	}
	
 	private static double normalize(double min, double max, double actual) {
		return (actual - min) / (max - min);
	}

	public static int calcQtdPeriodo(String periodoMinimo, String periodo) {

		int anoMinimoInt = Integer.valueOf(periodoMinimo.substring(0, 4));
		int semestreMinimoInt = Integer.valueOf(periodoMinimo.substring(4, 6));
		
		int reduzir;
		if(semestreMinimoInt == 0) {
			reduzir = 0;
		}
		else {
			reduzir = 1;
		}
		
		int ano = Integer.valueOf(periodo.substring(0, 4));
		int semestre = Integer.valueOf(periodo.substring(4, 6));
		
		int result = ((ano % anoMinimoInt) * 2) + semestre - reduzir;
		
		return result;
	}
	
}
