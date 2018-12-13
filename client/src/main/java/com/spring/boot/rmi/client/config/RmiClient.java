package com.spring.boot.rmi.client.config;

import com.spring.boot.rmi.common.service.IRmiExService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;

/**
 * @author yy
 * @ProjectName rmi
 * @Description: TODO
 * @date 2018/12/13 10:58
 */

@Configuration
public class RmiClient {

    @Bean
    public RmiProxyFactoryBean getFactoryBean(){
        RmiProxyFactoryBean factoryBean = new RmiProxyFactoryBean();
        factoryBean.setServiceUrl("rmi://192.168.1.12:1099/rmiExService");
        factoryBean.setServiceInterface(IRmiExService.class);
        return factoryBean;
    }

}
