import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.time.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mm = in.nextInt();
        int dd = in.nextInt();
        int yy = in.nextInt();
        in.close();
        LocalDate date = LocalDate.of(yy, mm, dd);
        System.out.print(date.getDayOfWeek());
    }
}