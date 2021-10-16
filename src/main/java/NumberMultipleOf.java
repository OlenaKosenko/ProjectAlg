public class NumberMultipleOf {

    /*
     * #9
     * Given an integer M perform the following conditional actions:
     * If M is multiple of 3 and 5 then return "Good Number".
     * If M is only multiple of 3 and not of 5 then return "Bad Number"
     * If M is only multiple of 5 and not of 3 then return "Poor Number"
     * If M doesn't satisfy any of the above conditions then return "-1"
     */

    public String numberMultipleOf(int m) {

        String result = "";

        if (m % (3 * 5) == 0) {
            result = "Good Number";
        } else if (m % 3 == 0) {
            result = "Bad Number";
        } else if (m % 5 == 0) {
            result = "Poor Number";
        } else {
            result = "-1";
        }

        return result;
    }
}
