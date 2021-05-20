import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class PrincipalLambda {
    public static void main(String[] args) {
        List<String> frases = Arrays.asList("Hola mundo","Bienvenido","¡Quien eres tu?", "Estudiando en casa","Trabajando en casa","Edgar Olvera Flores","Mi nombre es");

        Consumer<String> longitud = System.out::println;
        Consumer<String> alfabetico = System.out::println;

        System.out.println("------------------------------");
        System.out.println("\n(ORIGINAL)");
        frases.forEach(longitud);

        System.out.println("\nORDENANDO ALFABETICAMENTE");
        Collections.sort(frases);
        for (String elemento:frases){
            System.out.println(elemento);
        }

        System.out.println("\nORDEN  POR LONGITUD");
        frases.set(0,"¿Cuantos años tienes");
        frases.set(1,"Donde vives");
        Collections.sort(frases,Collections.reverseOrder());
        for (String elemento:frases){
            System.out.println(elemento);
        }
    }
}
