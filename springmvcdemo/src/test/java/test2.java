import dao.DBSource;
import dao.TrainingDB;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by 齐宇 on 2015/11/24.
 */
public class test2 {
    public static void main(String args[]) {
        DBSource dbsource = null;
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs;
        try {
            dbsource = new TrainingDB();
            conn = dbsource.getConnection();

            stmt = conn.createStatement();
            rs = stmt.executeQuery("select * from hr_employee");
            while (rs.next()) {
                String empid = rs.getString(1) + "    ";
                Date engagedate = rs.getDate(2);
                String type = rs.getString(3);
                System.out.println(empid + engagedate + type);

            }
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}