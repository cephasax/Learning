package crud.springboot.wekautils;

import crud.springboot.model.AlunoWekaBuilder;

public class Lixo {

	
	public static void main(String[] args) {
		int quanto1 = AlunoWekaBuilder.calcQtdPeriodo("201000", "201900");
		int quanto2 = AlunoWekaBuilder.calcQtdPeriodo("201001", "201901");
		System.out.println(quanto1);
		System.out.println(quanto2);
	}
	
}
