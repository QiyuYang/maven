package controller;

import dao.TDAO;
import model.PninfoBO;
import model.PninfoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import service.Getlist;
import service.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
    @RequestMapping(value = "/search.do" ,method = RequestMethod.POST)
    public  String search(@ModelAttribute PninfoEntity p, Model model){

        PninfoBO res =  tdao.query(p);
        res.toString();
        /*ArrayList res = new Query().query(p);*/
/*        ArrayList<PninfoEntity> res = new Getlist().getlist();*/
       /* for(int i = 0 ; i< res.size();i++){
            System.out.println(res.get(i).getP_avail1());
        }
*/

        model.addAttribute("res",res);
        return  "result";
    }


}