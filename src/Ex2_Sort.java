public class Ex2_Sort {
    public static void run(){

        System.out.println("Test Run");

        String[] allCountries = MyFiles.loadStringArr("IntelliJ_DataSet/Populations/countries.txt");
        System.out.println(allCountries.length);
        int[] allPops = MyFiles.loadIntArr("Intellij_DataSet/Populations/populations.txt");
        //Enhanced for  loop
//        for(String country: allCountries){
//            System.out.println(country);
//        }

        //find and print the country with the lowest population
        int lowestIndex = 0;
        for (int i = 0; i < allPops.length; i++) {
                if( allPops[i] < allPops[lowestIndex] ){
                    lowestIndex = i;
                }
        }

//        System.out.println(allPops[lowestIndex]);
//        System.out.println(allCountries[lowestIndex]);
//
        MySort.selectionSorIntArr(allPops);

        for (int i = 0; i < allPops.length; i++) {
            System.out.println(allCountries[i] + "pop of " + allPops[i]);
        }








    }


}
