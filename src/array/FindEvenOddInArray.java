package array;

import java.util.Scanner;

public class FindEvenOddInArray {
    public static void main(String[] args) {

//        int arr[] = {10,3,632,3,24,5,6,3,5,2};
//
//        for (int i= 0 ; i<arr.length; i++){
//            System.out.println("arr["+i+"] : "+arr[i]+" is = " + getEvenOdd(arr[i]));
//        }

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        String result = getEvenOdd(input);
        System.out.println(result);
    }


    public static String getEvenOdd(int num){
        if (num%2 == 0)
            return "Even";
        else
            return "Odd";
    }

    static String p2(){
        String s = "killed him";
        return s;
    }

    static void printSomething(){
        System.out.println("kiil him");
    }
}
