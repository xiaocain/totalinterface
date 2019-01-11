package com.jcex.totalinterface.Controller;

import com.jcex.totalinterface.Dao.Test;
import com.jcex.totalinterface.Entity.csd_invoice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TotalInterfaceController {
    @Resource
    private Test test;

    @RequestMapping(value = "login")
    public String JcexInterface(){
        List<String> selectwishbillno = test.selectwishbillno();
        String s = selectwishbillno.get(0);
        System.out.println("s = " + s);
        return s ;
    }
}
