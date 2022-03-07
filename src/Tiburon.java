public class Tiburon extends Pez implements Jugar{

    public Tiburon (String nombre){

        super(nombre);
    }
public void comunicarse(){

    System.out.println("Arqueo el cuerpo para comunicarme");
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
