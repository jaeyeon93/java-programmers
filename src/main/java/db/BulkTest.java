package db;

import java.util.Random;

public class BulkTest {
    private static Random r = new Random();

    /*
    mysql> desc btest;
    +-------+-------------+------+-----+---------+-------+
    | Field | Type        | Null | Key | Default | Extra |
    +-------+-------------+------+-----+---------+-------+
    | a     | int(11)     | NO   | PRI | NULL    |       |
    | b     | varchar(16) | YES  |     | NULL    |       |
    +-------+-------------+------+-----+---------+-------+
    2 rows in set (0.00 sec)
    */
    public static void main(String[] args) {
        BulkTest bulk = new BulkTest();
        int count = Integer.parseInt(args[0]);
        bulk.getData(count, 16);
    }

    private void progress(int curr, int tot) {
        if (tot < 1000)
            return;
        if (curr % (tot / 10) == 0) {
            System.err.print("*");
            return;
        }
        if (curr == tot - 1)
            System.err.println("");
    }

    private void getData(int count, int charlen) {
        for (int i = 0; i < count; i++) {
            progress(i, count);
            System.out.printf("%d,%s\n", i, genStr(charlen));
        }
    }

    private Object genStr(int charlen) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < charlen; i++)
            sb.append((char)('a' + r.nextInt(24)));
        return sb.toString();
    }
}
