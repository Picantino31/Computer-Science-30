public class Ex3_PrimeMinisters {

    public static String[] allPms = MyFiles.loadStringArr("IntelliJ_DataSet/PrimeMinisters/names.txt");
    public static int[] allYears = MyFiles.loadIntArr("IntelliJ_DataSet/PrimeMinisters/years.txt");
    public static String[] allParties = MyFiles.loadStringArr("IntelliJ_DataSet/PrimeMinisters/party.txt");

    public static void run(){

        sortByPM();
//        sortByParty();



        for (int i = 0; i < allPms.length ; i++) {
            System.out.println(allPms[i] + "is a " + allParties[i] + " - first elected in " + allYears[i]);
        }

    }//run

    public static void sortByPM(){
        for(int i=0; i<allPms.length-1; i++){
            int lowestIndex = i;
            for(int j=i+1; j<allPms.length; j++){
                if(allPms[j].compareToIgnoreCase(allPms[lowestIndex]) < 0){
                    lowestIndex = j;
                }
            }
            String temp = allPms[i];
            allPms[i] = allPms[lowestIndex];
            allPms[lowestIndex] = temp;

            String temp1 = allParties[i];
            allParties[i] = allParties[lowestIndex];
            allParties[lowestIndex] = temp1;

            int temp2 = allYears[i];
            allYears[i] = allYears[lowestIndex];
            allYears[lowestIndex] = temp2;

        }


    }//sortByPM



}
