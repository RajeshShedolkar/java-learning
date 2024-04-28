import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Palindrone {

    public static void main(String [] args){
       Palindrone obj =  new Palindrone();
//       obj.checkPass();
       int sal=0;
       float c;
       c = 1.2f;
        System.out.println(c);
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter salary");
       sal = sc.nextInt();
       System.out.println("Monthly Salary: "+ obj.taxCal(sal));
    }

    public boolean isPalindriome(int num){
        System.out.println("Palindrome");
        if(num < 0){
            return false;
        }
        return false;
    }


    public void checkPass(){
        byte m1, m2, m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Math's marks");
        m1 = sc.nextByte();
        System.out.println("Enter Physics's marks");
        m2 = sc.nextByte();
        System.out.println("Enter Bio's marks");
        m3 = sc.nextByte();

        if ((m1+m2+m3)/3 < 40){
            System.out.println("student failed");
            return;
        }
        if (m1 < 30 || m2 < 30 || m3 < 30){
            System.out.println("Student failed");
            return;
        }

        System.out.println("Student passed");
    }

    public double taxCal(int sal){
        int pf = 144000;
        int taxableIncome = sal - pf;
//        ArrayList<Integer> taxSlab = new ArrayList<>();
        double inHandSal = 0;
        inHandSal = (300000 + 300000*0.95 + 300000*0.90 + 300000*0.85+ 300000*0.80 + (taxableIncome-1500000)*0.70)/12;

        return inHandSal;
    }

    public int[] twoSum(int[] nums){
        int a, b;
        for (int i=0; i<nums.length;i++){
            a = nums[i];
            for (int j=0; j<nums.length; j++){
                if (i==j){
                    continue;
                }
            }
        }
        return new int[] {};
    }

}
