package utour.travel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import utour.travel.pojo.User;
import utour.travel.service.IUserService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/list")
    public  ModelAndView  list(){
        List<User> userList=userService.selectAll();
        //model.addAttribute("userList",userList);
        ModelAndView view=new ModelAndView("user_list");
        view.addObject("userList",userList);
        return view;
    }
}
