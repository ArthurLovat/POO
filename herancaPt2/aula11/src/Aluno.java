public class Aluno extends Pessoa{
    //herança para diferença ou extensão
    //Atributes
    private int matricula;
    private String curso;

    //methods
    public void pagarMensalidade(){
        System.out.println("Pagamento da mensalidade concluido!!" + this.getNome());
    }

    //builder
    public Aluno(String nome, int idade, String sexo, int matricula, String curso) {
        super(nome, idade, sexo);
        this.matricula = matricula;
        this.curso = curso;
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
