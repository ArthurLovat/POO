public abstract class Animal {
    //atributes
    protected float peso;
    protected int idade;
    protected int menbros;

    //Animal methods
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();

    //especial methods
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getMenbros() {
        return menbros;
    }
    public void setMenbros(int menbros) {
        this.menbros = menbros;
    }
   
    
}
