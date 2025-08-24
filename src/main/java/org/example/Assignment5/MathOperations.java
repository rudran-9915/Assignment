package org.example.Assignment5;

public class MathOperations {
    public int add(int a,int b) {
        return a + b;
    }

    public double add(double a,double b) {
        return a + b;
    }

    public int add(int[] numbers){
        int sum = 0;
        for(int number : numbers){
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {
        MathOperations m = new MathOperations();

        System.out.println("Integer Addition: "+m.add(1,2));
        System.out.println("Double Addition: "+m.add(1.0,2.0));
        int[] numbers = {10,20,30,40,50};
        System.out.println("Array Addition: "+m.add(numbers));
        int[] moreNumbers = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Array Addition: "+m.add(moreNumbers));
    }

}
