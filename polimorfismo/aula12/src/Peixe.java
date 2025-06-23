public class Peixe extends Animal{
    //Attributes
    private String corEscamas;

    //methods
    public void soltarBolha(){
        System.out.println("Soltou uma bolha");
    }
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
       System.out.println("Come minhoca");
    }

    @Override
    public void emitirSom() {
        System.out.println("Faz som de peixe");
    }

    //special methods
    public String getCorEscamas() {
        return corEscamas;
    }
    public void setCorEscamas(String corEscamas) {
        this.corEscamas = corEscamas;
    }
    
}
