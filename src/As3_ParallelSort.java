import java.util.Scanner;

public class As3_ParallelSort {

    public static Scanner input = new Scanner(System.in);


    //  Loading Data
    public static String[] allFastFoodChain = MyFiles.loadStringArr("IntelliJ_DataSet/FastFoodStats/FastFood.txt");

    public static String[] allFood = MyFiles.loadStringArr("IntelliJ_DataSet/FastFoodStats/FoodName.txt");
    public static int[] allCalories = MyFiles.loadIntArr("IntelliJ_DataSet/FastFoodStats/Calories.txt");

    public static int[] allProtein = MyFiles.loadIntArr("IntelliJ_DataSet/FastFoodStats/Protein.txt");


    public static void run() {
        while (true) {
            System.out.println("Press 1 to sort by Fast Food Chain");
            System.out.println("Press 2 to sort by Calories");
            System.out.println("Press 3 to filter by Fast Food Chain");
               System.out.println("Press 4 to search by Food");
            System.out.println("Press 5 to End");
            int choice = input.nextInt();
            input.nextLine();



            if (choice == 1) {

                sortByFastFood();
                for (int i = 0; i < allFastFoodChain.length; i++) {
                    System.out.println(allFastFoodChain[i] + " has the item '" + allFood[i] + "' with " + allCalories[i] + " calories and " + allProtein[i] + " protein.");

                }

            }
            if (choice == 2) {
                sortByCalories();
                for (int i = 0; i < allFastFoodChain.length; i++) {
                    System.out.println(allCalories[i] + " calories is included in the " + allFood[i] + ": "+ '"' + allFastFoodChain[i] + '"' );

                }

            }
            if (choice == 3) {
                String filter = input.nextLine();
                for (int i = 0; i < allFastFoodChain.length; i++) {
                    if(filter.equalsIgnoreCase(allFastFoodChain[i])){
                        System.out.println(allFastFoodChain[i] + " has the item '" + allFood[i] + "' with " + allCalories[i] + " calories");
                    }
                }

            }
            if (choice == 4) {
                String search = input.nextLine().toLowerCase();
                for (int i = 0; i < allFood.length; i++) {
                    if(allFood[i].toLowerCase().contains(search)){
                        System.out.println(allFood[i] + " from " + '"' +  allFastFoodChain[i] + '"' + " with " + allCalories[i] + " calories and " + allProtein[i] + " protein." );
                    }
                }
            }
            if (choice == 5){
                break;
            }
            System.out.println();

        }//while


    }
    public static void sortByFastFood(){
            for(int i=0; i<allFastFoodChain.length-1; i++){
                int lowestIndex = i;
                for(int j=i+1; j<allFastFoodChain.length; j++){
                    if(allFastFoodChain[j].compareToIgnoreCase(allFastFoodChain[lowestIndex]) < 0){
                        lowestIndex = j;
                    }
                }
                String temp = allFastFoodChain[i];
                allFastFoodChain[i] = allFastFoodChain[lowestIndex];
                allFastFoodChain[lowestIndex] = temp;

                String temp1 = allFood[i];
                allFood[i] = allFood[lowestIndex];
                allFood[lowestIndex] = temp1;

                int temp2 = allCalories[i];
                allCalories[i] = allCalories[lowestIndex];
                allCalories[lowestIndex] = temp2;

                int temp3 = allProtein[i];
                allProtein[i] = allProtein[lowestIndex];
                allProtein[lowestIndex] = temp3;

            }
     }

    public static void sortByCalories(){
            for(int i=0; i<allCalories.length-1; i++){
                int lowestIndex = i;
                for(int j=i+1; j<allCalories.length; j++){
                    if(allCalories[j] < allCalories[lowestIndex]){
                        lowestIndex = j;
                    }
                }
                int temp = allCalories[i];
                allCalories[i] = allCalories[lowestIndex];
                allCalories[lowestIndex] = temp;

                String temp2 = allFastFoodChain[i];
                allFastFoodChain[i] = allFastFoodChain[lowestIndex];
                allFastFoodChain[lowestIndex] = temp2;

                String temp1 = allFood[i];
                allFood[i] = allFood[lowestIndex];
                allFood[lowestIndex] = temp1;

                int temp3 = allProtein[i];
                allProtein[i] = allProtein[lowestIndex];
                allProtein[lowestIndex] = temp3;

            }




    }
}
