package service;

import dao.DBSource;
import dao.TrainingDB;
import model.PninfoEntity;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by 齐宇 on 2015/11/23.
 */
public class Query {
    public ArrayList query(PninfoEntity pninfoEntity){
        DBSource dbsource = null;
        Connection conn = null;
        Statement stmt = null;
        CallableStatement proc = null;
        ResultSet rs = null;
        ArrayList rowdataList = new ArrayList();
        String p_pn = pninfoEntity.getP_pn();
        String p_sn = pninfoEntity.getP_sn();
        String p_avail1 = pninfoEntity.getP_avail1();
        String p_avail2 = pninfoEntity.getP_avail2();
        String p_avail3 = pninfoEntity.getP_avail3();
        String p_msn = pninfoEntity.getP_msn();
        String p_bn = pninfoEntity.getP_bn();
        String p_owner = pninfoEntity.getP_owner();
        String p_station = pninfoEntity.getP_station();
        String p_stock = pninfoEntity.getP_stock();
        Float p_spec = pninfoEntity.getP_spec();
        Float p_sup = pninfoEntity.getP_sup();
        Float p_exch = pninfoEntity.getP_exch();
        Float p_scrap = pninfoEntity.getP_scrap();
        Float p_qty = pninfoEntity.getP_qty();
        String p_orderby = pninfoEntity.getP_orderby();
        Float p_pnid ;


        try {
            dbsource = new TrainingDB();
            conn = dbsource.getConnection();

            stmt = conn.createStatement();
            String proceducetext = "{call SAMEA_PNVIEW.search_list(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
            proc = conn.prepareCall(proceducetext);
            proc.setObject(1, p_pn);
            proc.setObject(2, p_sn);
            proc.setObject(3, p_avail1);
            proc.setObject(4, p_avail2);
            proc.setObject(5, p_avail3);
            proc.setObject(6, p_msn);
            proc.setObject(7, p_bn);
            proc.setObject(8, p_owner);
            proc.setObject(9, p_station);
            proc.setObject(10, p_stock);
            proc.setObject(11, p_spec);
            proc.setObject(12, p_sup);
            proc.setObject(13, p_exch);
            proc.setObject(14, p_scrap);
            proc.setObject(15, p_qty);
            proc.setObject(16, p_orderby);
            proc.registerOutParameter(17, Types.FLOAT);
            proc.registerOutParameter(18, oracle.jdbc.OracleTypes.CURSOR);
            proc.execute();
            p_pnid = proc.getFloat(17);
            System.out.println(p_pnid);
            rs = (ResultSet) proc.getObject(18);
            ResultSetMetaData rsmd = rs.getMetaData();
            Map rowData = new HashMap();
            int colnum = rsmd.getColumnCount();
            rowData = new HashMap(colnum);
            while (rs.next()) {

                for (int i = 1; i <= colnum; i++) {
                    rowData.put(rsmd.getColumnName(i), rs.getString(i));

                }
                rowdataList.add(rowData);
            }
            for (int i = 0; i < rowdataList.size(); i++) {
                System.out.println(rowdataList.get(i));
            }


        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    dbsource.closeConnection(conn);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return  rowdataList;
    }
}