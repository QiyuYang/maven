package dao;

import model.PnifocurBO;
import model.PninfoBO;
import model.PninfoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.CallableStatementCallback;
import org.springframework.jdbc.core.CallableStatementCreator;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 齐宇 on 2015/11/26.
 */
@Repository(value= "tdao")
public class TDAOimpl implements TDAO {
    @Autowired
    public JdbcTemplate jdbcTemplate;

    //POJO pain object java o
    @Override
    public PninfoBO query(PninfoEntity pninfoEntity) {
        PninfoBO pninfoBO = new PninfoBO();
        final String p_pn = pninfoEntity.getP_pn();
        final String p_sn = pninfoEntity.getP_sn();
        final String p_avail1 = pninfoEntity.getP_avail1();
        final String p_avail2 = pninfoEntity.getP_avail2();
        final String p_avail3 = pninfoEntity.getP_avail3();
        final String p_msn = pninfoEntity.getP_msn();
        final String p_bn = pninfoEntity.getP_bn();
        final String p_owner = pninfoEntity.getP_owner();
        final String p_station = pninfoEntity.getP_station();
        final String p_stock = pninfoEntity.getP_stock();
        final Float p_spec = pninfoEntity.getP_spec();
        final Float p_sup = pninfoEntity.getP_sup();
        final Float p_exch = pninfoEntity.getP_exch();
        final Float p_scrap = pninfoEntity.getP_scrap();
        final Float p_qty = pninfoEntity.getP_qty();
        final String p_orderby = pninfoEntity.getP_orderby();
        final Float p_pnid;



        pninfoBO = (PninfoBO) jdbcTemplate.execute(
                new CallableStatementCreator() {
                    @Override
                    public CallableStatement createCallableStatement(Connection connection) throws SQLException {
                        String proceducetext = "{call SAMEA_PNVIEW.search_list(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
                        CallableStatement proc = connection.prepareCall(proceducetext);
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
                        return proc;
                    }
                }, new CallableStatementCallback() {
                    public Object doInCallableStatement(CallableStatement proc) throws SQLException, DataAccessException {
                        ResultSetMapper<PnifocurBO> resultSetMapper = new ResultSetMapper<PnifocurBO>();
                        proc.execute();
                        PninfoBO pninfoBO = new PninfoBO();

                        pninfoBO.setP_pnid(proc.getFloat(17));
                        ResultSet rs = (ResultSet) proc.getObject(18);

                        List <PnifocurBO>pnifocurBOList = resultSetMapper.mapResultSetToObject(rs,PnifocurBO.class);
                        pninfoBO.setPnifocurBOList(pnifocurBOList);
                       /* Map rowData = new HashMap();
                        int colnum = rsmd.getColumnCount();
                        rowData = new HashMap(colnum);
                        while (rs.next()) {

                            for (int i = 1; i <= colnum; i++) {
                                rowData.put(rsmd.getColumnName(i), rs.getString(i));

                            }
                            rowdataMap.add(rowData);
                        }
                        rs.close();
                        for (int i = 0; i < rowdataMap.size(); i++) {
                            System.out.println(rowdataMap.get(i));
                        }*/

                        return pninfoBO;
                    }
                });

        return pninfoBO;
    }
}