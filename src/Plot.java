public class Plot {

    public String plantName;
    public int numberOfPants;
    public boolean needsWater;
    public int numberOfPlots;

    public Plot() {
        // assign variable values

        numberOfPants = (int) (Math.random() * 90 + 10);
        int plantID = (int) (Math.random() * 5);

        if (plantID == 0) {
            plantName = "Carrot";
        } else if (plantID == 1) {
            plantName = "tulip ";
        } else if (plantID == 2) {
            plantName = "lettuce";
        } else if (plantID == 3) {
            plantName = "Tomato";
        } else {
            plantName = "Empty ";
            numberOfPants = 0;
        }

        int waterNumber = (int) (Math.random() * 2);

        if (waterNumber == 0) {
            needsWater = true;

        } else {
            needsWater = false;
        }
    }


    public void printPlotInfo () {
        System.out.println("***");
        System.out.println("type of plot: " + plantName);
        System.out.println("number of plants: " + numberOfPants);
        System.out.println("needs water" + needsWater);

    }
}
