import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreams {
    public static void main(String[] args) {
        /*ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(23);
        list1.add(45);
        list1.add(5);
        list1.add(11);
        list1.add(96);
        list1.add(27);*/
        List<Integer> list1 = Arrays.asList(10, 1, 12, 27, 37, 3, 26);
        List<Integer> oddNumbers = new ArrayList<>();
        List<Integer> oddNumbers1 = new ArrayList<>();
        //without using streams
        /*for(int n : list1){
            if(n % 2 != 0){
                oddNumbers.add(n);
            }
        }
        System.out.println(oddNumbers);*/
        //With streams
        oddNumbers = list1.stream().filter(n -> n % 2 != 0).toList();
        System.out.println(oddNumbers);
        oddNumbers1 = list1.stream().filter(n -> n % 2 == 1).collect(Collectors.toList());
        System.out.println(oddNumbers1);
        list1.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
        list1.stream().filter(n -> n % 2 != 0).forEach(System.out::println);
    }

}