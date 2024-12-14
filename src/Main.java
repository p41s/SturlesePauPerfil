import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Añadir listas
        ArrayList<String> hobbies = new ArrayList<>();
        hobbies.add("\uD83C\uDFB5");
        hobbies.add("\uD83C\uDFC2");
        hobbies.add("\uD83E\uDD3F");

        ArrayList<String> foods = new ArrayList<>();
        foods.add("\uD83C\uDF55");
        foods.add("\uD83C\uDF56");
        foods.add("\uD83C\uDF66");

        ArrayList<String> funFacts = new ArrayList<>();
        funFacts.add("Escucho musica a todas horas!");
        funFacts.add("Podria pasarme el dia haciendo deporte");
        funFacts.add("Duermo menos de lo que deberia \uD83D\uDE02");

        //Crear el objeto perfil y mostrar la información
        Perfil perfil = new Perfil("Pau", "Soy una persona muy casera", hobbies, foods, funFacts);
        //perfil.mostrarPerfil();

        //Creacion del Scanner para poder interactuar
        Scanner scanner = new Scanner(System.in);
        int option;

        System.out.println("\nABOUT ME: " + perfil.getName());
        do {
            System.out.println("\nSelecciona una opción:\n");
            System.out.println("[1] Historia");
            System.out.println("[2] Favoritos");
            System.out.println("[3] Curiosidades");
            System.out.println("[4] Salir");

            option = scanner.nextInt();
            scanner.nextLine();
            switch(option){
                case 1:
                    System.out.println("\nEsta es mi historia!: \n" + perfil.getStory());
                    break;

                case 2:
                    System.out.println("\nFavoritos de " + perfil.getName()+"\n Comidas: " + foods + "\n Hobbies: " + hobbies);

                    break;

                case 3:
                    System.out.println("\nSabias que... " + " " + funFacts);

                    break;

                case 4:
                    System.out.println("\n Hasta la proxima!");
                    break;

                default:
                    System.out.println("\n Porfavor, elige una opción correcta");
            }

        }while ( option !=4);

    }

}
