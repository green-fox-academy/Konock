import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) {
    // Write a Stream Expression to get the even numbers from the following array:
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

    System.out.println("Even numbers: ");
    numbers.stream()
        .filter(n -> n % 2 == 0)
        .forEach(System.out::println);

    // Write a Stream Expression to get the average value of the odd numbers from the array
    System.out.println("Average of the odd numbers: ");
    numbers.stream()
        .filter(n -> n % 2 != 0)
        .mapToInt(n -> n)
        .average()
        .ifPresent(System.out::println);

    // Write a Stream Expression to get the squared value of the positive numbers from the array
    System.out.println("Squared values of the positive numbers: ");
    numbers.stream()
        .filter(n -> n > 0)
        .map(n -> n * n)
        .forEach(System.out::println);

    // Write a Stream Expression to find which number squared value is more then 20 from the following array:
    System.out.println("Squared values that are greater than 20: ");
    ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(3, 9, 2, 8, 6, 5));

    numbers2.stream()
        .map(n -> n * n)
        .filter(n -> n > 20)
        .forEach(System.out::println);

    // Write a Stream Expression to find the uppercase characters in a string!
    System.out.println("Here are the uppercase characters: ");
    String string = "KoNi";
    string.chars()
        .filter(c -> Character.isUpperCase(c))
        .mapToObj(c -> Character.toString((char)c))
        .forEach(System.out::println);

    // Write a Stream Expression to find the strings which starts with A and ends with I in the following array:
    ArrayList<String> cities = new ArrayList<>(Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS"));
    System.out.println("Cities starting with A and ending with I: ");
    cities.stream()
        .filter(city -> city.startsWith("A") && city.endsWith("I"))
        .forEach(System.out::println);

    // Write a Stream Expression to find the frequency of characters in a given string!
    String string2 = "apple";
    System.out.println(string2.chars()
        .mapToObj(c -> (char) c)
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));

    // Write a Stream Expression to find the frequency of numbers in the following array:
    ArrayList<Integer> numbers3 = new ArrayList<>(Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2));
    System.out.println(numbers3.stream()
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));

    // Write a Stream Expression to convert a char array to a string!
    System.out.println(Arrays.asList('K', 'o', 'n', 'i').stream()
        .map(c -> Character.toString(c))
        .reduce("", String::concat));

    // Create a Fox class with 3 properties(name, type, color) Fill a list with at least 5 foxes, it's up to you how you name/create them! Write a Stream Expression to find the foxes with green color! Write a Stream Expression to find the foxes with green color and pallida type!

    List<Fox> foxes = new ArrayList<>();
    foxes.add(new Fox("Koni", "alopex", "green"));
    foxes.add(new Fox("Krisztian", "fulvipes", "green"));
    foxes.add(new Fox("Sanyi", "pallida", "green"));
    foxes.add(new Fox("Barni", "pallida", "green"));
    foxes.add(new Fox("Egg", "boss", "black"));

    foxes.stream()
        .filter(fox -> fox.getColor() == "green" && fox.getType() == "pallida")
        .forEach(fox -> System.out.println(fox.getName()));
  }
}
