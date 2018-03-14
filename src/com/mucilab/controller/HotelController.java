package com.mucilab.controller;

import com.mucilab.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * Created by 9ian1i on 2017/6/24.
 */
@Controller
@RequestMapping("/hotel")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @ResponseBody
    @RequestMapping("/list")
    public String getList(){
        return hotelService.getList().toString();
    }

    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("test","hello world!!!");
        return "/hotel/index";
    }

}
