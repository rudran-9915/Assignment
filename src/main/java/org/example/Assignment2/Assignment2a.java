package org.example.Assignment2;

public class Assignment2a {
    public static void main(String[] args) {
        char[] deliveryStatus = new char[]{'P','D','C','F','P','D','C','F','P','D'};
        int pCount=0;
        int dCount=0;
        int cCount=0;
        int fCount=0;


        int orderNo=1;
        for(char x : deliveryStatus){
            String status=null;
            switch (x){
                case 'P':
                    status = "Pending";
                    pCount++;
                    break;
                case 'D':
                    status = "Delivered";
                    dCount++;
                    break;
                case 'C':
                    status = "Cancelled";
                    cCount++;
                    break;
                case 'F':
                    status = "Failed";
                    fCount++;
                    break;
            }
            System.out.println("orderNo "+orderNo+": "+status);
            orderNo++;
        }
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println("No of orders pending : "+pCount);
        System.out.println("No of orders delivered : "+dCount);
        System.out.println("No of orders cancelled : "+cCount);
        System.out.println("No of orders failed : "+fCount);
        
    }
}
