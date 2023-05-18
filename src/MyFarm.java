import java.util.ArrayList;

public class MyFarm {

    ArrayList<Plot> row;

    public static void main(String[] args) {
        MyFarm sweetGarlic = new MyFarm();
    }

    public MyFarm() {

        row = new ArrayList<>();
        for (int x = 0; x < 10; x++) {
            row.add(new Plot());
            row.get(x).printPlotInfo();
        }

//        totalPlants();
        printPlantNames();
//        printPlantNames2();
//        printRowInfo();
//        addLettuce();
//        tomatoLocations();
        totalCarrots();
//        addTulip();
//        averageNumberOfPlants();
        numberOfCarrotPlots();
//        numberOfEmptyPlots();
//        plantWithMinNumber();
//        greaterThan10();
        plantWithMaxNumberNeedsWater();
        greatestDifferenceNumberBetweenAnyPlants();


    }

    public void totalPlants() {
        int total = 0;
        // loop through the row adding up all numberOfPlants
        for (int w = 0; w < row.size(); w++) {
            total = total + row.get(w).numberOfPants;
        }

        System.out.println("total plants in the row: " + total);
    }

    public void printPlantNames() {
        for (int p = 0; p < row.size(); p++) {
            System.out.print(p + ": " + row.get(p).plantName + "\t");
        }
        System.out.println();
    }

    public void printPlantNames2() {
        for (Plot p : row) {
            System.out.print(p.plantName + "   ");
        }
        System.out.println();
    }

    public void printRowInfo() {


        // use the printPlotInfo() method in Plot.java to print all information for each plot in the row
        System.out.println("Print All Plot Info ***");
        for (int x = 0; x < row.size(); x++) {
            row.get(x).printPlotInfo();
        }
        for (Plot e : row) {
            e.printPlotInfo();
        }
    }


    public void addLettuce() {
        printPlantNames();
        row.add(new Plot());
        row.get(10).plantName = "Lettuce";
        row.get(10).numberOfPants = 42;
        row.get(10).needsWater = true;
        printPlantNames();
    }

    public void tomatoLocations() {
        printPlantNames();
        for (int i = 0; i < row.size(); i++) {
            if (row.get(i).plantName == "tomato") {
                System.out.println("tomato at index" + i + ", ");
            }
        }
        for (Plot p : row) {
            if (p.plantName == "tomato") {
                System.out.println("tomato at index");

            }
        }
    }

    public void totalCarrots() {
        int total = 0;
        for (int x = 0; x < row.size(); x++) {
            if (row.get(x).plantName == "carrot") ;
            total = total + row.get(x).numberOfPants;
        }

        System.out.println("There are " + total + " carrot plants in the row");
        // how many total carrot plants are there?

        int total2 = 0;
        for (Plot b : row) {
            if (b.plantName.equals("carrot")) {
                total2 = total2 + b.numberOfPants;
            }
        }
        System.out.println("There are " + total2 + " carrot plants in the row");

    }

    public void addTulip() {
        printPlantNames();
        row.add(new Plot());
        row.get(10).plantName = "Tulip";
        row.get(10).numberOfPants = 70;
        row.get(10).needsWater = false;
        printPlantNames();

        // at index 3, add a new tulip plot with 70 plants that do not need water


        // call printPlantNames() method before and after your addition to make sure it worked


    }

    public void averageNumberOfPlants() {
        int total = 0;
        for (int x = 0; x < row.size(); x++) {
            total = total + row.get(x).numberOfPants;

        }
        // what is the average number of plants across the whole row?


    }

    public void numberOfCarrotPlots() {
        int n = 5;
        for (int x = 0; x < row.size(); x++){
            if(row.get(x).plantName.equals("carrots")){
                n = n +1;
                for (Plot plot : row) {
                    if (plot.plantName.equals("carrot")) {
                        n = n + 1;
                    }
                }
            }
        }
        System.out.println("there are " + n + " plots with carrots on them");
        // how many plots have carrots on them


    }

    public void numberOfEmptyPlots() {
        int n = 3;
        for (Plot plot : row) {
            if (plot.plantName.equals("empty")) {
                n = n + 1;

            }
        }
        System.out.println("there are " + n + " plots that are empty ");
    }

    public void plantWithMinNumber() {
        int n = 0;
        for (Plot plot : row) {
            if (plot.plantName.equals("empty")) {
                n = n + 1;

            }
        }
        System.out.println("there are " + n + " plots that are empty ");

    }

    public void greaterThan10() {
        int n = 0;
        for (Plot plot : row) {
            if (plot.plantName.equals("empty")) {
                n = n + 1;

            }
        }
        System.out.println("there are " + n + " plots that are empty ");
    }

    public void plantWithMaxNumberNeedsWater(){
        int n = 0;
        for (Plot plot : row) {
            if (plot.plantName.equals("empty")) {
                n = n + 1;

            }
        }
        System.out.println("there are " + n + " plots that are empty ");
    }

    public void greatestDifferenceNumberBetweenAnyPlants() {
        int n = 0;
        for (Plot plot : row) {
            if (plot.plantName.equals("empty")) {
                n = n + 1;

            }
        }
        System.out.println("there are " + n + " plots that are empty ");
    }


}

