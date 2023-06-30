package Animais;

public class Animal {
    protected String name;
    protected String cor;
    protected int altura;
    protected double peso;
    protected String estadoDeEspirito;

    public Animal(String name, String cor, double peso) {
        this.name = name;
        this.cor = cor;
        this.peso = peso;

    }

    protected void comer (){}
    protected void dormir(){}
    public void soar() {
        System.out.println("cri cri");
    }
}
