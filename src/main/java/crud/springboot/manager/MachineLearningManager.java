package crud.springboot.manager;

import org.springframework.stereotype.Component;

import crud.springboot.wekautils.MachineLearningModel;

@Component
public class MachineLearningManager {

	private MachineLearningModel mlmAluno;
	
	public MachineLearningManager() {
		mlmAluno = new MachineLearningModel("C:\\Users\\cephas\\Documents\\Workspace\\educaLearning\\Springboot\\src\\main\\resources\\machinelearning\\base03.model");
	}

	public MachineLearningModel getMlmAluno() {
		return mlmAluno;
	}

	public void setMlmAluno(MachineLearningModel mlmAluno) {
		this.mlmAluno = mlmAluno;
	}
	
}
