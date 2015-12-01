package dao;


import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.apache.commons.beanutils.BeanUtils;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by 齐宇 on 2015/11/30.
 */
public class ResultSetMapper<T> {
    public List<T> mapResultSetToObject(ResultSet rs,Class outputclass){
        List<T> outputList = null;
        try{
            if(rs != null){
                if(outputclass.isAnnotationPresent(Entity.class));
                ResultSetMetaData rsmd = rs.getMetaData();
                Field[] fields = outputclass.getDeclaredFields();
                while (rs.next()){
                    T bean = (T) outputclass.newInstance();
                    for(int _iterator = 0 ; _iterator<rsmd.getColumnCount();_iterator++){
                        String columnName = rsmd.getColumnName(_iterator+1);
                        Object columnValue = rs.getObject(_iterator+1);
                        for(Field field :fields){
                            if (field.isAnnotationPresent(Column.class)) {

                                Column column = field.getAnnotation(Column.class);

                                if (column.name().equalsIgnoreCase(columnName) && columnValue != null) {

                                    BeanUtils.setProperty(bean, field.getName(), columnValue);

                                    break;
                        }
                    }

                }
            }if (outputList == null) {
                        outputList = new ArrayList<T>();
                    }
                    outputList.add(bean);}

            } else {
                // throw some error
            }
        } catch (IllegalAccessException e1) {
            e1.printStackTrace();
        } catch (InstantiationException e1) {
            e1.printStackTrace();
        } catch (SQLException e1) {
            e1.printStackTrace();
        } catch (InvocationTargetException e1) {
            e1.printStackTrace();
        }

    return outputList;
}
}

