package com.mucilab.controller;

import com.alibaba.fastjson.JSONObject;
import com.mucilab.utils.KMeans;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/kmeans")
public class KMeansController {

    @RequestMapping(value = {"/index"})
    public String index(Model model) {
        return "kmeans/index";
    }

    /**
     * @param id
     * @return
     */
    @RequestMapping(value ="/result",produces = "application/json")
    @ResponseBody
    public String getResult(@RequestParam(value = "id", required = true) String id) {
        KMeans kmeans = new KMeans();
        kmeans.init();
        kmeans.calculate();
        kmeans.getClustersList();
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("pointsList",kmeans.getPointsList());
        jsonObject.put("clustersList",kmeans.getClustersList());
        return jsonObject.toJSONString();
    }
}
