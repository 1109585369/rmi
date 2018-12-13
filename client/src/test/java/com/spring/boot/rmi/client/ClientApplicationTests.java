package com.spring.boot.rmi.client;

import com.spring.boot.rmi.common.service.IRmiExService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClientApplicationTests {


    @Autowired
    private IRmiExService rmiExService;

    @Test
    public void contextLoads() {
        System.out.println(rmiExService.invokingRemoteService());
    }

}

