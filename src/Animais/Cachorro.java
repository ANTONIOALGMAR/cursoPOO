package Animais;

public class Cachorro extends Animal{
    //atributos
    static int numeroDeCachorros;
    private int tamanhoDoRabo;


    //**** construtor padrao ****

    //*** construtores definido pelo usuario ***
    public Cachorro(String name, String cor, int altura, double peso, String estadoDeEspirito, int tamanhoDoRabo){
        super(name, cor, peso);
        this.name = name;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.estadoDeEspirito = estadoDeEspirito;
        this.tamanhoDoRabo = tamanhoDoRabo;

        numeroDeCachorros ++;
    }
    //*****  metodos  *****


    public static int getNumeroDeCachorros() {
        return numeroDeCachorros;
    }

    public static void setNumeroDeCachorros(int numeroDeCachorros) {
        Cachorro.numeroDeCachorros = numeroDeCachorros;
    }

    public String getName(){
        return this.name;
    }
    public void setName(){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getTamanhoDoRabo() {
        return tamanhoDoRabo;
    }

    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }

    public void comer(){}

    public String pegar(){
        return "Bolinha";
    }


    public String interagir (String acao) {
        // enum pesquisar
        switch (acao) {
            case "carinho": this.estadoDeEspirito = "Feliz"; break;
            case "vai dormir": this.estadoDeEspirito = "Bravo"; break;
            case "nada": this.estadoDeEspirito = "Neutro";break;
            case "pisar na patinha": this.estadoDeEspirito = "Triste"; break;
            default: this.estadoDeEspirito = "Neutro"; break;

        }
        return this.estadoDeEspirito;

    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "name='" + name + '\'' +
                '}';

    }

    @Override
    public void soar(){
        System.out.println("au au");
    }
}
