package com.ljm.controller;

import com.ljm.model.ConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liujm on 2017/12/28.
 */
@RestController
@EnableConfigurationProperties({ConfigBean.class})
public class miyaController {

    @Autowired
    ConfigBean configBean;


    @Value("${com.ljm.name}")
    private String name;
    @Value("${com.ljm.age}")
    private int age;

    @RequestMapping(value = "/miya")
    public String miya(){
        return name+":"+age;
    }


    @RequestMapping(value = "lucy")
    public String lucy(){
        return configBean.getName()+"--->"+configBean.getValue()+"---->"+configBean.getAge()+"---->"+configBean.getNumber();
    }
}
