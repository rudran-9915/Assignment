package org.example.Assignment2;

public class Assignment2d {
    public static void main(String[] args) {
        char[][] attendance = {
                {'P','P','A','P','L','P','P'},
                {'P','A','A','P','P','P','L'},
                {'P','P','P','P','P','P','P'},
        };
        int i=0;
        for(char[] eachEmployee : attendance){
            int p=0,a=0,l=0;
            for(char x : eachEmployee){
                if(x == 'P'){
                    p++;
                }if(x == 'A'){
                    a++;
                }if(x == 'L'){
                    l++;
                }
            }
            i++;
            System.out.println("Employee "+i+"-> P:"+p+" ,A:"+a+" ,L:"+l);
            System.out.println();
        }
    }
}
