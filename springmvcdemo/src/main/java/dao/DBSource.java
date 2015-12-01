package dao;

/**
 * Created by 齐宇 on 2015/11/23.
 */
import java.sql.Connection;
import java.sql.SQLException;

public interface DBSource {
    public Connection getConnection() throws SQLException;
    public void closeConnection(Connection conn) throws SQLException;
}