package model;

import java.lang.reflect.Field;
import java.util.List;

/**
 * Created by 齐宇 on 2015/11/26.
 */
public class PninfoBO {
    private Float p_pnid;
    private List<PnifocurBO> pnifocurBOList;
    public String toString(){
        System.out.println("pnid="+p_pnid);
        for (int i=0;i<pnifocurBOList.size();i++){
            Class<?> c = null;
            try {
                c = Class.forName("model.PnifocurBO");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            Field[] fields = c.getDeclaredFields();
            for(Field f:fields){
                f.setAccessible(true);
            }
            for(Field f:fields){
                String field = f.toString().substring(f.toString().lastIndexOf(".")+1);			//取出属性名称
                try {
                    System.out.println("第"+i+"个"+field+" --> "+f.get(pnifocurBOList.get(i)));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }

        }
        return null;
    }

    public Float getP_pnid() {
        return p_pnid;
    }

    public void setP_pnid(Float p_pnid) {
        this.p_pnid = p_pnid;
    }

    public List<PnifocurBO> getPnifocurBOList() {
        return pnifocurBOList;
    }

    public void setPnifocurBOList(List<PnifocurBO> pnifocurBOList) {
        this.pnifocurBOList = pnifocurBOList;
    }
}
