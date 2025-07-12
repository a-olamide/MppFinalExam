package property_management_system;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Function<String, String> toUpperCase = s -> s.toUpperCase();
        //Address standardization
        System.out.println(toUpperCase.apply("100 North 4th Street, fairfied IA"));

        BiFunction<Double, Double, Double> rentCalculation = (d1, d2) -> d1 + d2;
        System.out.println(rentCalculation.apply(10.5, 10.5));

        Function<List<Integer>, List<Integer>> sortLists = s -> {
            return s.stream().sorted(Comparator.comparing(Integer::intValue)).collect(Collectors.toList());
        };
        List<Integer> sorted = sortLists.apply(List.of(13, 2, 5, 4, 8, 6, 1, 8, 3));
        System.out.println(sorted);

        BiFunction<String, String, String> getFullName = (s1, s2) -> s1.concat(s2);
        System.out.println(getFullName.apply("1", "2"));

        Function<String, String> generateUniquePropertyId = s -> {
            Random rand = new Random(10);
            return s+"-"+rand.nextInt(50);
        };
        System.out.println(generateUniquePropertyId.apply("PROPP77"));
    }
}
