package heranca;
public class App {
    public static void main(String[] args) throws Exception {
        //main
        Pessoa p1 = new Pessoa(null, 0, null);
        Aluno p2 = new Aluno(null, 0, null, 0, null);
        Professor p3 = new Professor(null, 0, null, null, 0);
        Funcionario p4 = new Funcionario(null, 0, null, null, false);

        p1.setNome("Pascoval");
        p2.setNome("Maria");
        p2.setNome("Roberton");
        p3.setNome("Roberlitttle");

        p1.setSexo("M");
        p4.setSexo("F");
        p2.setIdade(18);

        p2.setCurso("Desenvolvimento de Software");
        p3.setSalario(2300.00f);
        p4.setTrabalhando(true);
        p4.setSetor("Estoque");

        p3.receberAumento(300);
        p4.mudarTrabalho();
        p2.cancelarMat();
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
