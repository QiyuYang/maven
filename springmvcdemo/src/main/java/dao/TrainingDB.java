package dao;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

/**
 * Created by 齐宇 on 2015/11/23.
 */
public class TrainingDB implements DBSource {
    String url;
    String user;
    String passwd;
    String dirver;
    public TrainingDB() throws IOException,
            ClassNotFoundException {
        dirver="oracle.jdbc.driver.OracleDriver";
        url = "jdbc:oracle:thin:@10.12.68.11:1521:TRAINING";
        user = "amicos";
        passwd = "redhat_2013";

        Class.forName(dirver);
    }
    public Connection getConnection() throws SQLException {
        System.out.println("数据库连接");
        return DriverManager.getConnection(url, user, passwd);
    }

    public void closeConnection(Connection conn) throws SQLException {
        conn.close();
    }
}


