import java.util.Scanner;

public class As5_Haiku {
    public static Scanner input = new Scanner(System.in);
    public static String[] myHaiku = MyFiles.loadStringArr("IntelliJ_DataSet/HaikuPoem1.txt");
    public static String[] myHaiku2 = MyFiles.loadStringArr("IntelliJ_DataSet/HaikuPoem2.txt");
    public static String[] myHaiku3 = MyFiles.loadStringArr("IntelliJ_DataSet/HaikuPoem3.txt");

    public static void run(){

         System.out.println("OG Haiku");
         for (String s : myHaiku) {
             System.out.println(s);
         }
         System.out.println();
         System.out.println("Sorted Haiku (Bubble Sort) ");
         MySort.bubbleSort(myHaiku);
         for (String s: myHaiku){
             System.out.println(s);
         }

        System.out.println();
        System.out.println("Which Haiku do you want? (1, 2, or 3)");
         String[] chosenHaiku = new String[2];
         String HaikuFile = "";
         int answer = input.nextInt();
         input.nextLine();

         if(answer == 1){
             chosenHaiku = myHaiku;
              HaikuFile = "IntelliJ_DataSet/HaikuPoem1.txt";
         }
         else if (answer == 2) {
             chosenHaiku = myHaiku2;
              HaikuFile = "IntelliJ_DataSet/HaikuPoem2.txt";
         }
         else if (answer == 3) {
             chosenHaiku = myHaiku3;
              HaikuFile = "IntelliJ_DataSet/HaikuPoem3.txt";
         }

        System.out.println("OG Haiku");
        for (String s : chosenHaiku) {
            System.out.println(s);
        }
        System.out.println();
        System.out.println("Sorted Haiku (Bubble Sort) ");
        MySort.bubbleSort(chosenHaiku);
        for (String s: chosenHaiku){
            System.out.println(s);
        }

        System.out.println("tell me a word that appears in the Haiku");
        String word = input.nextLine();
        System.out.println("what would you like to replace that word with?");
        String replace = input.nextLine();

        for (int i = 0; i < chosenHaiku.length; i++) {
            chosenHaiku[i] = chosenHaiku[i].replace(word, replace);
            System.out.println(chosenHaiku[i]);
        }

        System.out.println();
        System.out.println("Would you like to save this Haiku?");
        String saveans = input.nextLine();
        if(saveans.toLowerCase().startsWith("y")){
            MyFiles.saveStringArray(HaikuFile, chosenHaiku);
        }
        else{
            System.out.println("ok");
        }








    }
}
