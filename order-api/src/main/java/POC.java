import com.pharma.industries.Dao;
import com.pharma.industries.Drug;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class POC {
    public static void main(String[] args) throws ClassNotFoundException {
     //   int number = generateNumberSum(7);
       // System.out.println("Generated No is :" + number);
        List<String> stringList = Arrays.asList("A","B","C","D","E","A","B","E");
        stringList
                .stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .toList()
                .forEach(System.out::println);

        String inputName = "Java is a programming language";
       Map<Character,Long> characterLongMap = inputName.chars()
               .mapToObj(value -> (char)value)
               .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
           Character name = inputName
                   .chars()
                   .mapToObj(value -> (char)value)
                   .filter(character -> characterLongMap.get(character)==1)
                   .findFirst()
                   .get();
        System.out.println("--------------------- "+name);
        int[] arrayA = new int[]{1,3,2,3};
        int[] arrayB = new int[]{1,3,2,4};
       int aLong = Arrays.stream(arrayA)
                .distinct()
                .findFirst().getAsInt();
        System.out.println("Distinct :::::: "+ aLong);


        double average =IntStream.concat(Arrays.stream(arrayA),Arrays.stream(arrayB))
                .summaryStatistics()
                .getSum()
                ;
        System.out.println("Average of ::::::::::::  "+average);
        List<Drug> drugList = Dao.getDrugList();
        drugList.stream()
                .filter(drug -> drug.getDrugId()!=1)
                .peek(drug -> drug.setDrugName(""))
                .toList();
       Drug dr = drugList
                .stream()
                .filter(drug -> drug.getCategoryList()
                        .stream()
                        .anyMatch(category -> category.getCategoryId() == 1))
                .findFirst().get();
        System.out.println("---------- "+dr);
    }



    private static int generateNumberSum(int i) throws ClassNotFoundException {
        Random random = new Random();
        int thousand, hundred, ten, unit;
        do {
            thousand = random.nextInt(10);
            hundred = random.nextInt(10);
            ten = random.nextInt(10);
            unit = random.nextInt(10);
        } while ((thousand + hundred + ten + unit) != i);


        return thousand * 1000 + hundred * 100 + ten * 10 + unit;
    }

}
