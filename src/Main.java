import Arithmetic.Arithmetic;
import Map.MyMap;

public class Main {
    public static void main(String[] args) {

        Arithmetic<Integer, Long> arithmetic = new Arithmetic<>(3458, (long) 5345);

        System.out.println("The sum is: " + arithmetic.add());

        System.out.println("The difference is: " + arithmetic.subtract());

        System.out.println("The product is: " + arithmetic.multiply());

        System.out.println("The quotient is: " + arithmetic.divide());

        System.out.println("The minimum number is: " + arithmetic.getMin());

        System.out.println("The maximum number is: " + arithmetic.getMax());



        //MAP
        MyMap<String,Integer> map = new MyMap<>();

        map.put("hello",2);
        map.put("world",4);

        System.out.println(map.get("world"));

        System.out.println(map.remove("hello"));
    }
}