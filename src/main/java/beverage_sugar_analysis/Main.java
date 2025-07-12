package beverage_sugar_analysis;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Map<String, String> beverageSugarMap = Map.ofEntries(
                Map.entry("Cold Brew Coffee","0"),
                Map.entry("Iced Green Tea","12"),
                Map.entry("Sparkling Water","N/A")
        );
        beverageSugarMap.entrySet().stream()
                .filter(e -> e.getKey().toLowerCase().contains("juice") || e.getKey().toLowerCase().contains("smoothie"))
                .filter(e-> Optional.ofNullable(parseSugarHelper(e.getValue())).isPresent())
                .filter(e-> Optional.ofNullable((parseSugarHelper(e.getValue()))).get() < 30)
                .sorted(Comparator.comparing(Map.Entry::getValue))
                .map(e -> e.getKey() +": " + e.getValue())
                .forEach(System.out::println);
    }
    private static Integer parseSugarHelper(String beverageSugar) {
        try{
            return Integer.parseInt(beverageSugar);
        } catch (IllegalArgumentException ex) {
            return null;
        }

    }
}
