package com.utilController.controller;


import com.utilController.service.ISysJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author WCH
 * @since 2021-03-17
 */
@RestController
@RequestMapping("/sys-job")
public class SysJobController {
    @Autowired
    private ISysJobService u_seacchService;
    @RequestMapping("/user")
    public Map<String,Object> u_serach(){
        Map<String,Object> list= u_seacchService. u_serach();
        return list;

    }

}
