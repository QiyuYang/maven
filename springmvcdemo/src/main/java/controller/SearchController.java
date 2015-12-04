package controller;

import dao.TDAO;
import model.DataGridDto;
import model.PninfoBO;
import model.PninfoEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 齐宇 on 2015/11/23.
 */
@Controller
public class SearchController {
   private PninfoEntity p;
    @Resource(name= "tdao")
    private TDAO tdao;

    @RequestMapping(value = "/input.do")
    public  String input(){
        return "PNSearch";
    }
    @RequestMapping(value = "/pntable")
    public  String json(){
        return "pntable";
    }
    @RequestMapping(value = "/search" ,method = RequestMethod.POST)
    public  @ResponseBody PninfoBO search(@ModelAttribute PninfoEntity p){
     /*   DataGridDto dataGridDto = new DataGridDto();*/
        PninfoBO res =  tdao.query(p);
    /*    res.toString();*/
        /*ArrayList res = new Query().query(p);*/
/*        ArrayList<PninfoEntity> res = new Getlist().getlist();*/
       /* for(int i = 0 ; i< res.size();i++){
            System.out.println(res.get(i).getP_avail1());
        }
*/      List list = res.getPnifocurBOList();
/*        dataGridDto.setTotal(list.size());
        dataGridDto.setRows(list);*/

   /*     model.addAttribute("res",res);*/
        return  res;
    }
    @RequestMapping(value = "/ajaxsearch")
    public  @ResponseBody DataGridDto ajaxsearch( ){
        DataGridDto dataGridDto = new DataGridDto();
        PninfoEntity prod = new PninfoEntity();
        prod.setP_pn("387");
        PninfoBO res =  tdao.query(prod);
        res.toString();
        /*ArrayList res = new Query().query(p);*/
/*        ArrayList<PninfoEntity> res = new Getlist().getlist();*/
       /* for(int i = 0 ; i< res.size();i++){
            System.out.println(res.get(i).getP_avail1());
        }
*/      List list = res.getPnifocurBOList();
        dataGridDto.setTotal(list.size());
        dataGridDto.setRows(list);

        return  dataGridDto;
    }

}
