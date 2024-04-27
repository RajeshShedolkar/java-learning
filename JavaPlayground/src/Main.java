import java.util.ArrayList;
import java.util.Arrays;

class Main {
    public static void main(String [] args){
        System.out.println("Hello World");
//        System.out.println("");
        int num;
        num=123;
        System.out.println(num);
        String str;
        str = "ABCD WXYZ";
        System.out.println(str);

        // Wrapper for Interger
        Integer i = 123;
        System.out.println(i);
        System.out.println(i.byteValue());

        // Wrapper for Boolean
        Boolean b = false;
        System.out.println(b.toString());

        // Wrapper for string for utility functions
        String firstName = "Rajesh";
        String lastName = "Shedolkar";
        System.out.println((firstName+lastName).toUpperCase());

        System.out.println(firstName + " " + lastName);

        // Wrapper for more string utility functions
        StringBuilder stringBuilderObj = new StringBuilder();
        stringBuilderObj.append(firstName);
        stringBuilderObj.append(lastName);
        stringBuilderObj.append(123);

        System.out.println(stringBuilderObj);

        char c = 'r';
        Character cObj = 'r';
        System.out.println(c);

        System.out.println(cObj.getClass());

        // Arrays: size is fix
        int [] arr = new int[3];
        arr[0]=1;
        int [] arr1 = {1, 2, 3};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));


        // Dynamic size Array

        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(1);
        arr2.add(3);
        arr2.add(5);
        System.out.println(arr2);

    }
}