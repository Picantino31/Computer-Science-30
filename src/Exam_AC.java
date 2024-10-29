/*
Error in Binary Search - does not work consistently
- 2 marks given for calling the function correctly
- 2 marks given for partially correct function code
4/10
Otherwise works well

94%
*/


import java.util.Scanner;
public class Exam_AC {

    public static Scanner input = new Scanner(System.in);
    public static String[] abbreviation = {"CHF",  "CZK",  "EUR",  "JPY",  "MOD"};
    public static String[] longName = {"Swiss Franc",  "Czech Koruna",  "Euro",  "Japanese Yen",   "Moroccan Dirham" };
    public static double[] value = {0.65,  13.47,  0.68,  109.97,  7.40};
    public static void run() {
        System.out.println("World Currencies Database");
        System.out.println("");
        while (true) {


            System.out.println("Press 1 to Print All\nPress 2 to Find Average\nPress 3 to Search by Value\nPress 4 to Search by Abbreviation\nPress 5 to Filter Long Names\nPress 6 to Sort by Values\nPress 7 to Print Unofficial Abbreviations\nPress 8 to Exit");

            int choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {
                for (int i = 0; i < abbreviation.length; i++) {
                    System.out.println(abbreviation[i] + " " + longName[i] + " " + value[i]);
                }

            }
            if (choice == 2) {
                double Total = 0;
                for (int i = 0; i < value.length; i++) {
                    Total += value[i];
                }
                double Average = Total / 5;
                System.out.println("The average of all the value is " + Average);
            }

            if (choice == 3) {
                System.out.println("What currency do you wanna find by value? ");
                double searchTerm = input.nextDouble();
                input.nextLine();
                int foundIndex = LinearSearch(value, searchTerm);
                    if (foundIndex == -1) {
                        System.out.println( "not found ");


                    }
                    else{
                        System.out.println("One canadian Dollar is worth " + value[foundIndex] + " " + abbreviation[foundIndex]);
                    }




            }
            if (choice == 4) {
                //couldnt figure out  binary search
                System.out.println("What currency do you wanna find by abbreviation? ");
                String seachTerm = input.nextLine();
                int foundIndex = binarySearch(longName, seachTerm);

                if (foundIndex == -1) {
                    System.out.println("not found");
                } else {
                    System.out.println("One canadian Dollar is worth " + value[foundIndex] + " " + abbreviation[foundIndex]);
                }


            }
            if (choice == 5) {
                System.out.println("What do you wanna find");
                String filterTerm = input.nextLine();
                for (int i = 0; i < longName.length; i++) {
                    if(longName[i].toLowerCase().contains(filterTerm.toLowerCase()) ) {
                        System.out.println(longName[i]);
                    }
                }


            }
            if (choice == 6) {
                sortByvalue();
                System.out.println("Data sorted by Value");
            }

            if (choice == 7) {
                for (int i = 0; i < abbreviation.length; i++) {
                    System.out.println(abbreviation[i] + " " + longName[i] + " " + value[i] + " " + longName[i].substring(0, 3));
                }
            }
            if (choice == 8) {
                break;
            }
            System.out.println();
            System.out.println("Good bye");
        }//while


    }






    public static int binarySearch(String[] arr, String searchTerm){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = (start + end)/2;
            if(searchTerm.equalsIgnoreCase(arr[mid])  ){
                return mid;
            }
//            else if(searchTerm > arr[mid] ){
//                start = mid + 1;
//            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int LinearSearch ( double[] arr, double searchTerm){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] ==  searchTerm ){
                return i;
            }
        }
        return -1;
    }


    public static void sortByvalue(){
        for(int i=0; i<value.length-1; i++){
            int lowestIndex = i;
            for(int j=i+1; j<value.length; j++){
                if(value[j] < value[lowestIndex]){
                    lowestIndex = j;
                }
            }
            double temp = value[i];
            value[i] = value[lowestIndex];
            value[lowestIndex] = temp;

            String temp2 = longName[i];
            longName[i] = longName[lowestIndex];
            longName[lowestIndex] = temp2;

            String temp1 = abbreviation[i];
            abbreviation[i] = abbreviation[lowestIndex];
            abbreviation[lowestIndex] = temp1;

        }
    }
}
