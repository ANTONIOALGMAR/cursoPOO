package Animais;

public class Passaro extends Animal{
    static int numeroDePassaros;

    public Passaro(String name, String cor, double peso) {
        super(name, cor, peso);
    }
    @Override
    public void soar(){
        System.out.println("fiu fiu");
    }
}

