package com.spring.boot.server.impl;

import com.spring.boot.rmi.common.service.IRmiExService;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author yy
 * @ProjectName rmi
 * @Description: TODO
 * @date 2018/12/13 10:11
 */

@Service("rmiExServiceImpl")
public class IRMIExServiceImpl implements IRmiExService {


    @PostConstruct
    public void initMethod(){
        System.out.println("init method invoking");
    }

    @Override
    public String invokingRemoteService() {
        return "welcome invoking this method";
    }
}
