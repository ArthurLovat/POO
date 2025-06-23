public class App {
    public static void main(String[] args) throws Exception {
        //Pessoa p1 = new Pessoa(); Não podemos instanciar pessoa pois ela é uma classe abstrata

        Visistante v1 = new Visistante("Visitante", 20, "Masculino");
        Aluno a1 = new Aluno("roberto", 19, "m", 1111, "Ti");
        Bolsista b1 = new Bolsista("Bosista", 34, "MAcho", 12222, "Enfermagem", 12233);
        a1.pagarMensalidade();
        b1.pagarMensalidade();

        System.out.println(b1.toString());
        System.out.println(v1.toString());
        System.out.println(a1.toString());

    }
}
