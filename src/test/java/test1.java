import java.sql.*;

/**
 * Created by 齐宇 on 2015/11/24.
 */
public class test1 {
    public static void main(String args[]){
        Connection con;
        Statement sql;
        ResultSet rs;




        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@10.12.68.11:1521:TRAINING", "amicos", "redhat_2013");
            sql = con.createStatement();
            rs = sql.executeQuery("select * from hr_employee");
            while (rs.next()){
                String empid = rs.getString(1)+"    ";
                Date engagedate = rs.getDate(2);
                String type = rs.getString(3);
                System.out.println(empid+engagedate+type);

            }
            con.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
