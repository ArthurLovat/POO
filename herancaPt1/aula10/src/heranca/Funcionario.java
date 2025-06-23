package heranca;
public class Funcionario extends Pessoa{
    //attributes
    private String setor;
    private boolean trabalhando;

    //methods
    public void mudarTrabalho(){
        this.trabalhando = ! this.trabalhando;
    }

    //builder
    public Funcionario(String nome, int idade, String sexo, String setor, boolean trabalhando) {
        super(nome, idade, sexo);
        this.setor = setor;
        this.trabalhando = trabalhando;
    }

    //Special Methods
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }    
}
