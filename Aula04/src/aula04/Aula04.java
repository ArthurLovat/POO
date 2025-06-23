package aula04;

public class Aula04 {

    public static void main(String[] args) {
        
        Caneta c1 = new Caneta("Nic", 0.4f, "Amarelo");
        //c1.setModelo("Bic");
        //c1.setPonta(0.5f);
        c1.status();
        
        System.out.println("=============================");
        
        Caneta c2 = new Caneta("Kib", 0.5f, "Roxa");
        c2.status();
    }
    
}
