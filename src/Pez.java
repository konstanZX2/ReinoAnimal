public abstract class Pez extends Animal {


    public Pez(String nombre) {
        super(nombre);
    }

    public void respirar(){
        System.out.println("Respiro por branquias");
    }



    public void moverse(){
        System.out.println("Nado con aletas");
    }


}
