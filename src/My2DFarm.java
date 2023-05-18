import java.util.Objects;

public class My2DFarm {

    //    public Plot[] row; // normal 1-dimensional array
    public Plot[][] grid; //2-dimensional array


    public static void main(String[] args) {
        My2DFarm blueberryPatch = new My2DFarm();
    }

    public My2DFarm() {
//        row = newPlot[10];
        grid = new Plot[3][4];

        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 4; y++) {
                grid[x][y] = new Plot();
                grid[x][y].printPlotInfo();
            }
        }

        printPlantNames();
        totalPlants();
        totalCarrots();
        averageNumberOfPlants();
        numberOfTomatoPlots();
        averageRows();
//        averageColumns();
        fullestPlotType();
    }

    public void printPlantNames() {
        System.out.println();
        for (int x = 0; x < 3; x++) {
            System.out.print("row: " + x);
            for (int y = 0; y < 4; y++) {
                System.out.print("row " + x + " col " + y + ": " + grid[x][y].plantName + " \t");
            }
            System.out.println();
        }
    }

    public void totalPlants() {
        // how many total plants are there in the grid?
        int total = 0;
        for (int x = 0; x < grid.length; x++) {
            for (int y = 0; y < grid[x].length; y++) {
                total = total + grid[x][y].numberOfPants;
            }
        }
        System.out.println("There are " + total + " total plants!");
    }

    public void totalCarrots() {
        // how many total carrot plants are there?
        int total = 0;
        for (int x = 0; x < grid.length; x++) {
            for (int y = 0; y < grid[x].length; y++) {
                if (grid[x][y].plantName == "carrot") ;
                total = total + grid[x][y].numberOfPants;
            }
        }
        System.out.println("There are " + total + " carrot plants");
    }

    public void averageNumberOfPlants() {
        int total = 0;
        for (int x = 0; x < grid.length; x++) {
            for (int y = 0; y < grid[x].length; y++) {
                total = total + grid[x][y].numberOfPants;
                //find the average number of plants for every row. place the average of every row into a new array
            }
            System.out.println("The average number of plants is " + total);
        }
        // what is the average number of plants across the whole grid?
    }

    public void numberOfTomatoPlots() {
        int n = 5;
        int y = 0;
        for (int x = 0; x < grid.length; x++) {
            if (grid[x][y].plantName.equals("tomato")) {
                n = n + 1;
                for (Plot[] plot : grid) {
                    if (Objects.equals(plot.length, "tomato")) {
                        n = n + 1;
                    }
                }
            }
        }
        // how many plots have tomatoes on them
        System.out.println("There are " + n + " Tomato Plots");
    }

    public void fullestPlotType() {
        //which plant type has the most plants in a single plot
        String plant = "";
        //loop through grid[0], which is the first row
        int maxNumber = 0;
        for (int x = 0; x < grid[0].length; x++) {
            if (grid[0][x].numberOfPants > maxNumber) {
                maxNumber = grid[0][x].numberOfPants;
                plant = grid[0][x].plantName;
            }
        }
        System.out.println("Plant type with most plants:" + plant);

    }
    public void averageRows() {
        int total = 0;
        for (int x = 0; x < grid.length; x++) {
            for (int y = 0; y < grid[x].length; y++) {
                total = total + grid[x][y].numberOfPlots;
                //find the average number of plants for every row. place the average of every row into a new array
            }
            System.out.println("The average number of rows is " + total);
        }

//        public void averageColumns() {
//            total = 0;
//            for (int x = 0; x < grid.length; x++) {
//                for (int y = 0; y < grid[x].length; y++) {
//                    total = total + grid[x][y].numberOfPants;
//                    //find the average number of plants for every row. place the average of every row into a new array
//                }
//                System.out.println("The average number of columns is " + total);
//            }
            //find the average number of plants for every col. place the average of every row into a new array
        }
    }

