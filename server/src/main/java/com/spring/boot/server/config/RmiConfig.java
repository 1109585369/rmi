package com.spring.boot.server.config;

import com.spring.boot.rmi.common.service.IRmiExService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;

/**
 * @author yy
 * @ProjectName rmi
 * @Description: TODO
 * @date 2018/12/13 10:01
 */

@Configuration
public class RmiConfig {

    @Autowired
    private IRmiExService rmiExService;

    @Bean
    public RmiServiceExporter initRmiServiceExporter(){
        RmiServiceExporter exporter = new RmiServiceExporter();
        exporter.setServiceName("rmiExService");
        exporter.setServicePort(6666);
        exporter.setService(rmiExService);
        exporter.setServiceInterface(IRmiExService.class);
        System.out.println("init rmi server success");
        return exporter;
    }


}
