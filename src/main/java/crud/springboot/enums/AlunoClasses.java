package crud.springboot.enums;

public enum AlunoClasses {

	//it's only a fake for put
    NULL("DESERTOU");

    private String info;

    AlunoClasses(String info){
        this.info = info;
    }

    public String getInfo(){
        return this.info;
    }

	
}
