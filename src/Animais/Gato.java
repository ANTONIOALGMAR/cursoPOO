package Animais;

public class Gato extends Animal {

    static int numeroDEGatos;

    public Gato (String name, String cor, double peso){
        super(name, cor, peso);
    }



    @Override
    public String toString() {
        return "Gato{" +
                "name='" + name + '\'' +
                '}';
    }
    @Override
    public void soar(){
        System.out.println("MIAU MIAU");
    }
}
