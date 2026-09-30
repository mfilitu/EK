package com.example.videoprojekt.Controller;

import com.example.videoprojekt.Config.InitData;
import com.example.videoprojekt.Model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class pageController {

    @Autowired
    InitData initData;

    @GetMapping("/")
    public String mainPage(Model model){
        ArrayList<Car> carList = new ArrayList<>();

        carList.addAll(initData.getCarList());

        model.addAttribute("carList", carList);

        return "index";
    }

}
