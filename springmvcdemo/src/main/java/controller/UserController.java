/*
package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

*/
/**
 * Created by 齐宇 on 2015/12/3.
 *//*


@Controller("UserController")

@RequestMapping("/user")
public class UserController {

    @RequestMapping(value="/list",method= RequestMethod.GET)
    public String list(Model model) throws Exception {
        model.addAttribute("deptList", deptService.getDeptList());
        return "user/list";
    }

    @RequestMapping(value="/queryList",method=RequestMethod.POST)
    @ResponseBody


    public Map<String, Object> queryList(DataGridModel dgm,TUser user) throws Exception{
        //<span style="color: #ff0000;">spring太给力了，可以自动装配两个对象  会自动的装返回的Map转换成JSON对象</span>


        //return userService.getPageListByExemple(dgm, user);
        return userService.getPageList(dgm, user);
    }

    @RequestMapping(value="/popWindow",method=RequestMethod.GET)
    public String popWindow() throws Exception{
        return "user/popWindow";
    }

    @RequestMapping(value="/addOrUpdate",method=RequestMethod.POST)
    @ResponseBody
    public Map<String, String> addOrUpdate(TUser user) throws Exception{
        //spring会利用jackson自动将返回值封装成JSON对象，比struts2方便了很多
        Map<String, String> map = new HashMap<String, String>();
        try {
            userService.addOrUpdate(user);
            map.put("mes", "操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            map.put("mes", "操作失败");
            throw e;
        }
        return map;
    }

    @RequestMapping(value="/delete",method=RequestMethod.POST)
    @ResponseBody
    public Map<String, String> delete(@RequestParam("uid") List<Integer> uid

    )throws Exception{
        //<span style="color: #ff0000;">spring mvc 还可以将参数绑定为list类型</span>


        Map<String, String> map = new HashMap<String, String>();
        try {
            userService.deleteUsers(uid);
            map.put("mes", "删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            map.put("mes", "删除失败");
            throw e;
        }
        return map;//重定向
    }


    private IDeptService deptService;

    public IDeptService getDeptService() {
        return deptService;
    }

    public void setDeptService(IDeptService deptService) {
        this.deptService = deptService;
    }

    private IUserService userService;

    public IUserService getUserService() {
        return userService;
    }

    public void setUserService(IUserService userService) {
        this.userService = userService;
    }
}*/
