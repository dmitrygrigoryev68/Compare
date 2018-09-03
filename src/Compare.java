import java.util.Arrays;

public class Compare {

    public static void main (String [] args){

        String [] strings = {"ccc","bbb","aaa","ddd"};

        for (String s:strings) {
            System.out.println(s);
        }
        Arrays.sort(strings);
        System.out.println("\nAfter:  \n");

        for (String s:strings) {
            System.out.println(s);
        }

        MyNumber [] numbers = {new MyNumber(3, "aaa"),
                    new MyNumber(2, "ddd"),
                    new MyNumber(5, "bbb"),
                    new MyNumber(1,"ccc")};

        Arrays.sort(numbers);
        for(MyNumber number:numbers){
            System.out.println(number);
        }
    }
}
