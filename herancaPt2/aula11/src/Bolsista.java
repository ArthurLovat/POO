public class Bolsista extends Aluno{
    //atributes
    private float bolsa;
    
    //methods
    public void renovarBolsa(){
        System.out.println("Bolsa renovada com sucesso!!" + this.getNome());
    }

    //special methods
    public Bolsista(String nome, int idade, String sexo, int matricula, String curso, int bolsa) {
        super(nome, idade, sexo, matricula, curso);
        this.bolsa = bolsa;
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
    
    @Override
    public void pagarMensalidade(){
        System.out.println("O aluno bolsista pagou a mensalidade" + this.getNome());
    }
    
    
}
