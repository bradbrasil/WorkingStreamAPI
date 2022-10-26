import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;



public class Exercicio {
    public static void main(String[] args) {
        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("Imprima todos os elementos dessa lista de String: ");
        numerosAleatorios.stream()
        .forEach(System.out::println);
        numerosAleatorios.forEach(System.out::println);


        System.out.println("Pegue os 5 ultimos e primeiros e coloque dentro de um Set: ");
//        numerosAleatorios.stream()
//                .limit(5)
//                .collect(Collectors.toList())
//                .forEach(System.out::println);
        Set<String> collectSet = numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet());

//        System.out.println("Transforme essa lista de String em uma lista de numeros inteiros: ");
////        List<Integer> numerosAleatorios1 = numerosAleatorios.stream()
////                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
//                 .forEach(System.out::println);


        System.out.println("Pegue os numeros pares e maior que 2 e coloque em uma lista: ");
////        numerosAleatorios.stream()
////                .map(Integer::parseInt)
        List<Integer> ListParesMaioresQue2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter( i ->i % 2 == 0 && i > 2).collect(Collectors.toList());
        System.out.println(ListParesMaioresQue2);


        System.out.println("Mostre a média dos números: ");
////        numerosAleatorios1.stream()
////                .average()
////                .ifPresent(System.out::println);
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);



        System.out.println("Remova os valores ímpares");
        numerosAleatoriosInteger.removeIf(i -> (i % 2 != 0));
        System.out.println(numerosAleatoriosInteger);

    }
}