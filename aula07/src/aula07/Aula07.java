package aula07;

public class Aula07 {

    public static void main(String[] args) {
        
        Lutador l[] = new Lutador[6]; //declara como um vetor para ser possivel adicionar mais de um
        
        l[0] = new Lutador("Pretty boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
        
        l[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        
        l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        
        l[3] = new Lutador("Dead Code", "Austrálha", 28, 1.93f, 81.6f, 13, 0, 2);
        
        l[4] = new Lutador("UFOCobol", "Brasil", 37, 1.70f, 119.f, 5, 4, 3);
        
        l[5] = new Lutador("Nerdart", "EUA", 30, 1.81f, 105.f, 12, 2, 4);
        
        Luta UEC01 = new Luta();
        
        UEC01.marcarLuta(l[0], l[1]);
        UEC01.lutar();
        
        l[0].status();
        l[1].status();
    }
    
}
