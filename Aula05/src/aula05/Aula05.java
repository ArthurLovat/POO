package aula05;

public class Aula05 {
    
    public static void main(String[] args) {
        
        ContaBanco p1 = new ContaBanco();
        
        p1.setNumConta(0001);
        p1.setDono("Codorna");
        p1.abrirConta("CC");
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(1001);
        p2.setDono("Roberta");
        p2.abrirConta("CP");
        
        p1.depositar(300);
        p2.depositar(500);
                
        p1.estadoAtual();
        p2.estadoAtual();
        
        System.out.println("Apos os saques:");
        
        p2.sacar(1000.0f);
        p2.estadoAtual();
    }
    
}
