import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<String> color = List.of("White","black","Yellow","pink");

        color.forEach(col -> System.out.println(col));

        Stream<String> stream = color.stream();

        Stream<String> limit = stream.limit(2);
//        Long count = limit.count();
//        System.out.println(count);
//        System.out.println(limit);

        List<String> list = limit.collect(Collectors.toList());

        System.out.println(list);

        List<String> list1 = color.stream().sorted().limit(3).collect(Collectors.toList());
        System.out.println(list1);

        List<String> list2 = color.stream().sorted((s1,s2)-> s1.compareToIgnoreCase(s2)).collect(Collectors.toList());

        System.out.println(list2);

        List<String> list3 = color.stream().sorted((s1,s2)-> s1.compareToIgnoreCase(s2)).skip(2).collect(Collectors.toList());

        System.out.println(list3);



        List<String> number = List.of("one","Two","Size","eight","nine","Four");

        Stream<String> stringStream = number.stream().limit(4);

        List<String> l1 = stringStream.collect(Collectors.toList());

      //  List<String> l2 = stringStream.collect(Collectors.toList());










    }
}