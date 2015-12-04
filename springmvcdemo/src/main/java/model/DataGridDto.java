package model;

import java.util.List;

/**
 * Created by 齐宇 on 2015/12/4.
 */
public class DataGridDto {
    private int total;
    private List rows;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List getRows() {
        return rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }
}
