package heranca;
public class Professor extends Pessoa {
    //Attributes
    private String especialidade;
    private float salario;

    //methods
    public void receberAumento(float aum){
        this.salario += aum;
    }

    //builder
    public Professor(String nome, int idade, String sexo, String especialidade, float salario) {
        super(nome, idade, sexo);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    //Special methods
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    
    
    
}
