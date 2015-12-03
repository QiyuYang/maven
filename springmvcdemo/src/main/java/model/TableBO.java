package model;

import java.util.List;

/**
 * Created by 齐宇 on 2015/12/3.
 */
public class TableBO {
    private int total;
    private List<TableList> rows;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<TableList> getRows() {
        return rows;
    }

    public void setRows(List<TableList> rows) {
        this.rows = rows;
    }
}
