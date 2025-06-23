public class Reptil extends Animal {
    //Attributes
    private String corEscamas;

    //methods
    @Override
    public void locomover() {
        System.out.println("Rastejando!!");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Vegetais!!");        
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de reptil");
    }

    //special methods
    public String getCorEscamas() {
        return corEscamas;
    }

    public void setCorEscamas(String corEscamas) {
        this.corEscamas = corEscamas;
    }
    
    //builder
    public Reptil(String corEscamas) {
        this.corEscamas = corEscamas;
    }
}
