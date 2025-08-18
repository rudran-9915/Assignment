package org.example.Assignment2;

public class Assignment2c {
    public static void main(String[] args) {
        String[] vehicle = {"Car","Truck","Bike","Car","Bus"};
        int total = 0;
        int CarCount = 0;
        int TruckCount = 0;
        int BikeCount = 0;
        int BusCount = 0;
        for(String type:vehicle){
            switch(type){
                case "Car":
                    total+=100;
                    CarCount++;
                    break;
                case "Truck":
                    total+=250;
                    TruckCount++;
                    break;
                case "Bike":
                    total+=50;
                    BikeCount++;
                    break;
                case "Bus":
                    total+=200;
                    BusCount++;
                    break;
            }
        }

        System.out.println("Total toll collection :"+total);
        System.out.println("Total Car Count :"+CarCount);
        System.out.println("Total Truck Count :"+TruckCount);
        System.out.println("Total BikeCount :"+BikeCount);
        System.out.println("Total Bus Count :"+BusCount);
    }
}
