public class BottlesOfBeer {

    private String bottles = " bottles ";
    private String ofBear = "of beer";
    private String onTheWall = " on the wall";
    private String takeOne = "Take one down and pass it around, ";
    private String dot = ".";
    private String noMore = "No more";
    private String comma = ", ";

    public void printPoem() {

        for (int i = 99; i > 0; ) {
            System.out.print(i + bottles + ofBear + onTheWall + comma + i + bottles + ofBear + dot +"\n");
            i--;

            if (i == 1) {
                bottles = " bottle ";
            } else {
                bottles = " bottles ";
            }

            if (i == 0) {
                break;
            }
            System.out.println(takeOne + i + bottles + ofBear + onTheWall + dot);
            System.out.println();
        }

        System.out.println(takeOne + noMore + bottles + ofBear + onTheWall + dot +"\n");
        System.out.println(noMore + bottles + ofBear + onTheWall + comma + noMore + bottles + ofBear + dot +"\n" +
                takeOne + 99 + bottles + ofBear + onTheWall + dot);


    }
}
