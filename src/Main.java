import java.util.ArrayList;

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
        perfil.mostrarPerfil();

    }
}