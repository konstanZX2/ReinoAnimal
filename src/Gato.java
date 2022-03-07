public class Gato extends Mamifero implements Jugar {


public Gato (String nombre){
    super(nombre);

}
public void comunicarse(){
    System.out.println("NYA UwU");
    super.comunicarse();

}
public void jugarConOvillos(){

    System.out.println("Me gusta jugar con ovillos");
}

    @Override
    public void saltarPorUnAro() {
        System.out.println("Se jugar a saltar por el aro");
    }

    @Override
    public void perseguirUnObjeto(String objeto) {
        System.out.println("Se jugar a perseguir un objeto: "+objeto);
    }
}
