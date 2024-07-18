import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListaPersonas {
    public static void main(String[] args) {
        List<persona> personas = new ArrayList<>();
        personas.add(new persona("Panqui", "Bermudez", 35));
        personas.add(new persona("Nepo", "Bellado", 23));
        personas.add(new persona("Enrique", "Sabio", 45));
        personas.add(new persona("Sofia", "Velazques", 25));

        List<persona> personMenoresDe32 = personas.stream()
                .filter(p -> p.getEdad() < 30)
                .collect(Collectors.toList());

        System.out.println("Personas menores de 32" );
        personMenoresDe32.forEach(p -> System.out.println("Nombre: " + p.getNombre() + "\nApellido: "
        + p.getApellido() + "\nEdad: " + p.getEdad()));


    }
}
