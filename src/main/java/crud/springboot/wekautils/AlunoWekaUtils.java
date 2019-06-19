package crud.springboot.wekautils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import crud.springboot.model.AlunoWeka;
import weka.core.Attribute;
import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;

/**
 * 
 * @author Cephas
 *
 * @see this class works like an interface between aluno objects in Java and Weka instance needed
 * by classification method. It is a bit more than a parser but its function is to build and
 * allow the classification with Weka ".model" file loaded.
 *
 */

@Component
public class AlunoWekaUtils {

	private Instances dataset;
	private ArrayList<Attribute> attributes;

	public AlunoWekaUtils() {
			createInstances();
	}

	private void createInstances() {
		this.dataset = new Instances("dataset", createAttributesToDiabets(), 0);
		this.dataset.setClassIndex(this.dataset.numAttributes() - 1);
		;
	}

	private ArrayList<Attribute> createAttributesToDiabets() {

		this.attributes = new ArrayList<Attribute>();

		attributes.add(new Attribute("Sexo"));
		attributes.add(new Attribute("Idade"));
		attributes.add(new Attribute("ZonaMoradia_ZONARESIDENCIAL"));
		attributes.add(new Attribute("ZonaMoradia_ASENTAMIENTOHUMANO"));
		attributes.add(new Attribute("ZonaMoradia_URBANIZACION"));
		attributes.add(new Attribute("ZonaMoradia_CASCOURBANO"));
		attributes.add(new Attribute("ZonaMoradia_PUEBLOJOVEN"));
		attributes.add(new Attribute("ZonaMoradia_OTROS"));
		attributes.add(new Attribute("ZonaMoradia_ZONARURAL"));
		attributes.add(new Attribute("Trabalha"));
		attributes.add(new Attribute("EstadoCivil_SOLTERO"));
		attributes.add(new Attribute("EstadoCivil_CASADO"));
		attributes.add(new Attribute("EstadoCivil_DIVORCIADO"));
		attributes.add(new Attribute("EstadoCivil_DESCONOCIDO"));
		attributes.add(new Attribute("EstadoCivil_SEPARADO"));
		attributes.add(new Attribute("EstadoCivil_CONVIVIENTE"));
		attributes.add(new Attribute("EstadoCivil_VIUDO"));
		attributes.add(new Attribute("Escola"));
		attributes.add(new Attribute("Religiao_CRISTIANOCATOLICO"));
		attributes.add(new Attribute("Religiao_OTRARELIGION"));
		attributes.add(new Attribute("Religiao_CRISTIANOEVANGELICO"));
		attributes.add(new Attribute("Religiao_AGNOSTICO"));
		attributes.add(new Attribute("CursoGraduacao"));
		attributes.add(new Attribute("Modalidade"));
		attributes.add(new Attribute("PeriodoIngreso"));
		attributes.add(new Attribute("NotaExameAdmissao"));
		attributes.add(new Attribute("TotalNiveisCurso"));
		attributes.add(new Attribute("TotalCreditosCurso"));
		attributes.add(new Attribute("TotalNiveisCursados"));
		attributes.add(new Attribute("PorcentagemNC"));
		attributes.add(new Attribute("TotalCreditosCursados"));
		attributes.add(new Attribute("PorcentagemCC"));
		attributes.add(new Attribute("PeriodoUltimaMatricula"));
		attributes.add(new Attribute("UltimoNivelEstudado"));
		attributes.add(new Attribute("PromedioUltimoPeriodo"));

		// Create Class Attribute
		attributes.add(new Attribute("Class", createValuesForClass()));

		return attributes;
	}

	private List<String> createValuesForClass() {

		List<String> classValues = new ArrayList<String>();
		
		classValues.add(new String("CONCLUIDO"));
		classValues.add(new String("DESERTOU"));
		return classValues;
	}

	public Instance alunoToWekaInstance(AlunoWeka alunoInstance) {
		this.dataset.clear();
		
		double[] values = new double[dataset.numAttributes()];

		values[0] = alunoInstance.getSexo();
		values[1] = alunoInstance.getIdade();
		values[2] = alunoInstance.getZonaMoradia_ZONARESIDENCIAL();
		values[3] = alunoInstance.getZonaMoradia_ASENTAMIENTOHUMANO();
		values[4] = alunoInstance.getZonaMoradia_URBANIZACION();
		values[5] = alunoInstance.getZonaMoradia_CASCOURBANO();
		values[6] = alunoInstance.getZonaMoradia_PUEBLOJOVEN();
		values[7] = alunoInstance.getZonaMoradia_OTROS();
		values[8] = alunoInstance.getZonaMoradia_ZONARURAL();
		values[9] = alunoInstance.getTrabalha();
		values[10] = alunoInstance.getEstadoCivil_SOLTERO();
		values[11] = alunoInstance.getEstadoCivil_CASADO();
		values[12] = alunoInstance.getEstadoCivil_DIVORCIADO();
		values[13] = alunoInstance.getEstadoCivil_DESCONOCIDO();
		values[14] = alunoInstance.getEstadoCivil_SEPARADO();
		values[15] = alunoInstance.getEstadoCivil_CONVIVIENTE();
		values[16] = alunoInstance.getEstadoCivil_VIUDO();
		values[17] = alunoInstance.getEscola();
		values[18] = alunoInstance.getReligiao_CRISTIANOCATOLICO();
		values[19] = alunoInstance.getReligiao_OTRARELIGION();
		values[20] = alunoInstance.getReligiao_CRISTIANOEVANGELICO();
		values[21] = alunoInstance.getReligiao_AGNOSTICO();
		values[22] = Double.valueOf(alunoInstance.getCursoGraduacao());
		values[23] = alunoInstance.getModalidade();
		values[24] = alunoInstance.getPeriodoIngreso();
		values[25] = alunoInstance.getNotaExameAdmissao();
		values[26] = alunoInstance.getTotalNiveisCurso();
		values[27] = alunoInstance.getTotalCreditosCurso();
		values[28] = alunoInstance.getTotalNiveisCursados();
		values[29] = alunoInstance.getPorcentagemNC();
		values[30] = alunoInstance.getTotalCreditosCursados();
		values[31] = alunoInstance.getPorcentagemCC();
		values[32] = alunoInstance.getPeriodoUltimaMatricula();
		values[33] = alunoInstance.getUltimoNivelEstudado();
		values[34] = alunoInstance.getPromedioUltimoPeriodo();

		values[35] = dataset.attribute(35).indexOfValue(alunoInstance.getAlunoClass());

		Instance instance = new DenseInstance(1, values);

		return instance;
	}

	public Instances getDataset() {
		return dataset;
	}

	public void setDataset(Instances dataset) {
		this.dataset = dataset;
	}

}
