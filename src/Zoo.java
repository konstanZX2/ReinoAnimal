
import java.util.LinkedList;
import java.util.List;

public class Zoo {

    private List<Animal> animales= new LinkedList();

    public void añadir(Animal animal){
        animales.add(animal);
    }

    public void mostrar(){
        for (Animal animal : animales){
            System.out.println("Animal: " + animal.getNombre());
        }
        for (Animal animal: animales){
            animal.respirar();
        }
    }
    }

