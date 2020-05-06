
import java.time.LocalDate;
class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int mm, int dd, int yy) {
        LocalDate dt = LocalDate.of(yy, mm, dd);
        return dt.getDayOfWeek().name();

    }

}

