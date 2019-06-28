package crud.springboot.manager;

import org.springframework.stereotype.Component;

import crud.springboot.model.AlunoWeka;
import crud.springboot.wekautils.AlunoWekaController;
import crud.springboot.wekautils.MachineLearningModel;

@Component
public class MachineLearningManager {

	private MachineLearningModel mlmAluno;
	private AlunoWekaController alunoWekaController;
	
	public MachineLearningManager() {
		mlmAluno = new MachineLearningModel("C:\\Users\\cephas\\Documents\\Workspace\\educaLearning\\Springboot\\src\\main\\resources\\machinelearning\\base03.model");
		alunoWekaController = new AlunoWekaController(mlmAluno);
	}

	public MachineLearningModel getMlmAluno() {
		return mlmAluno;
	}

	public void setMlmAluno(MachineLearningModel mlmAluno) {
		this.mlmAluno = mlmAluno;
	}
	
	public AlunoWeka makePredictionForAluno(AlunoWeka alunoWeka) {
		return alunoWekaController.classifyAlunoWeka(alunoWeka);
	}
	
}
