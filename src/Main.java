public class Main {
    public static void main(String[] args) {


        Gato gato1 = new Gato("Juan");
        Perro perro1 = new Perro("Carlos");
        Tiburon tibu1 = new Tiburon("Manuel");
        Entrenador entrenador1 = new Entrenador("Jose");
        Zoo zoo1 = new Zoo();
        zoo1.añadir(gato1);
        zoo1.añadir(perro1);
        zoo1.añadir(tibu1);

        for (Animal animal: animales){
            animal.respirar();
        }

    }
    }
