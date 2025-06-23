package aula04;

public class Caneta {
    
    //atributos
    public String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;
    
    //metodo construtor
    public Caneta(String m, float p, String c){
        this.setModelo(m);
        this.setCor(c);
        this.setPonta(p);
        this.tampar();
    }
    
    //metodo tampar e destampar
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }
    
    
    //getters e setters
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String m){
        this.modelo = m;
    }
    
    public float getPonta(){
        return this.ponta;
    }
    
    public void setPonta(float p){
        this.ponta = p;
    }
    
    public String getCor(){
        return this.cor;
    }
    public void setCor(String c){
        this.cor = c;
    }
    
    public boolean getTampar(){
        return this.tampada;
    }
    public void setTampar(boolean t){
        this.tampada = t;
    }
    
    //end getterns e setters
    
    
    public void status(){
        System.out.println("SOBRE A CANETA: ");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Tampada: " + this.getTampar());
    }
}
