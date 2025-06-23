public class App {
    public static void main(String[] args) throws Exception {
        
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa("Maria", 25, "F");

        l[0] = new Livro("Aprendendo Java", "José da Silva Azevedo", 300, 0, false, p[0]);
        l[1] = new Livro("Poo para Iniciantes", "Pedro Paulo", 500, 0, false, p[1]);
        l[2] = new Livro("Java Avançado", "Maria Candido", 800, 0, false, p[0]);
        
        l[0]. abrir();
        l[0].folhear(200);
        System.out.print(l[0].detalhes());
    }
}
