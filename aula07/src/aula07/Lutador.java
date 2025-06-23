/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula07;

/**
 *
 * @author user
 */
public class Lutador {
    //Atributos
    
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    //metodos especiais

    public Lutador(String no, String ne, int id, float al, float pe, int vi, int de, int em){
        this.nome = no;
        this.nacionalidade = ne;
        this.idade =  id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
        
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String no) {
        this.nome = no;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float pe) {
        this.peso = pe;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso < 52.2){
            this.categoria = "Invalido";
        }
        else if (peso <= 70.3){
            this.categoria = "Leve";
        }
        else if (peso <= 83.9){
            this.categoria = "Medio";
        }
        else if (peso <= 120.2 ){
            this.categoria = "Pesado";
        }
        else{
            this.categoria = "Invalido";
        }
        
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    //metodos personalizados
    public void ganharLuta(){
        setVitorias(getVitorias() + 1);
    }
    public void perderLuta(){
        setDerrotas(getDerrotas() + 1);
    }
    public void empatarLuta(){
        setEmpates(getEmpates() + 1);
    }
    public void apresentar(){
        System.out.println("==================================");
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println(this.getIdade() + " Anos...");
        System.out.println(this.getAltura() + " De altura...");
        System.out.println("Pesando " + this.getPeso() + "KG...");
        System.out.println("Ganhou: " + this.getVitorias());
        System.out.println("Pedeou: " + this.getDerrotas());
        System.out.println("Empatou " + this.getEmpates());
        System.out.println("====================================");
    }
    public void status(){
        System.out.println("====================================");
        System.out.println(getNome());
        System.out.println("É um peso: " + getCategoria());
        System.out.println(getVitorias() + " Vitorias!");
        System.out.println(getDerrotas() + " Derrotas!");
        System.out.println(getEmpates() + " Empates!");
        System.out.println("====================================");
    }
    
}
