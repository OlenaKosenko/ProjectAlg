public class BottlesOfBeer {

    private String bottles = " bottles ";
    private String ofBear = "of beer";
    private String bottle = " bottle ";
    private String onTheWall = " on the wall";
    private String takeOne = "Take one down and pass it around, ";
    private String dot = ".";
    private String noMore = "No more";
    private int number = 99;
    private String comma = ", ";

    public void printPoem() {

        for (int i = 99; i > 0; ) {
            String lineOne = i + bottles + ofBear + onTheWall + comma + i + bottles + ofBear + dot +"\n";
            System.out.print(lineOne);
            i--;
            if (i == 1) {
                bottles = " bottle ";
            } else {
                bottles = " bottles ";
            }
            if (i == 0) {
                break;
            }
            String lineTwo = takeOne + i + bottles + ofBear + onTheWall + dot;

            System.out.println(lineTwo);
            System.out.println();
        }

        String last = takeOne + noMore + bottles + ofBear + onTheWall + dot +"\n";
        String last2 = noMore + bottles + ofBear + onTheWall + comma + noMore + bottles + ofBear + dot +"\n" +
                takeOne + number + bottles + ofBear + onTheWall + dot;
        System.out.println(last);
        System.out.println(last2);


    }
}
