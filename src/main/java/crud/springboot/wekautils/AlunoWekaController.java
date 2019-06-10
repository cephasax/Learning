package crud.springboot.wekautils;

import crud.springboot.model.Aluno;
import weka.core.Instance;

public class AlunoWekaController{

	private MachineLearningModel mlm;

	public AlunoWekaController(MachineLearningModel mlm) {
		this.mlm = mlm;
	}
	
	public Aluno classifyAluno(Aluno alunoInstance) {
		Aluno aluno = alunoInstance;

		String classValue = new String(predictClassForAluno(alunoInstance));
		aluno.setAlunoClass(classValue);

		return aluno;
	}
	
	private String predictClassForAluno(Aluno alunoInstance) {
		AlunoWekaUtils awu = new AlunoWekaUtils();

		Instance instance = awu.alunoToWekaInstance(alunoInstance);

		awu.getDataset().add(instance);

		double value = -1;
		try {
			value = mlm.getCls().classifyInstance(awu.getDataset().get(0));
		} catch (Exception e) {
			e.printStackTrace();
		}

		//get the diabetsClass value
		String prediction = null;
		prediction = new String(awu.getDataset().classAttribute().value((int) value));

		return prediction;

	}

}
