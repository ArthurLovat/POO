package heranca;
public class Aluno extends Pessoa{
    //Attributes
    private int matricula;
    private String curso;

    
    //builder
    public Aluno(String nome, int idade, String sexo, int matricula, String curso) {
        super(nome, idade, sexo);
        this.matricula = matricula;
        this.curso = curso;
    }

    //methods
    public void cancelarMat(){
        System.out.println("Matricula será cancelada!!");
    }

    //Special methods
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    
    
}
