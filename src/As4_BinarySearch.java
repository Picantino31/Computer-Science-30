import java.util.Scanner;

public class As4_BinarySearch {

 public static Scanner input = new Scanner(System.in);
 public static String[] allAnimals = {"American Lobster" , "Antarctica Krill" , "Bluebottle" , "Christmas Tree Worm" , "False Killer Whale", "Fin Whale", "Gray Seal", "Jackass Penguin", "King Penguin", "Zebra Shark"};
 public static String[] allAnimalsType = {"Crustacean" , "Crustacean", "Invertebrate" , "Coral", "Mammal", "Mammal", "Mammal", "SeaBird", "SeaBird", "Shark"};
 public static Boolean[] isEndangered = {false, false, false, false, true, true, false, true, false, true};


  public static void run(){

   for (String allAnimal : allAnimals) {
    System.out.println(allAnimal);
   }

   while(true) {

    System.out.println();
    System.out.println("Enter a Sea Creatures Name");
    String answer = input.nextLine();

    if(answer.equalsIgnoreCase("exit")){
     break;
    }

    int foundIndex = MySearch.binarySearch(allAnimals, answer);
    if(foundIndex == -1){
     System.out.println("not found, please try again");
    }
    else{
     System.out.println("Found it, a " + allAnimals[foundIndex] + " is a " + allAnimalsType[foundIndex] );
     if(isEndangered[foundIndex]){
      System.out.println("Species is endangered");
     }
     else{
      System.out.println("Species is not endangered");
     }

    }





     }
   }
 }
