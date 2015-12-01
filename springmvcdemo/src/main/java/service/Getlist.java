package service;

import model.PninfoEntity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by 齐宇 on 2015/11/24.
 */
public class Getlist {
    public  ArrayList getlist(){
        PninfoEntity p1 = new PninfoEntity();
        PninfoEntity p2 = new PninfoEntity();
        PninfoEntity p3 = new PninfoEntity();
        p1.setP_avail1("ZZZZ");
        p2.setP_avail1("YYYY");
        p3.setP_avail1("XXXX");


        ArrayList <PninfoEntity> a = new ArrayList();
        a.add(p1);
        a.add(p2);
        a.add(p3);
        return  a ;
    }







}
