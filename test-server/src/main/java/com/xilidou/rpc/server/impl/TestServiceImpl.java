package com.xilidou.rpc.server.impl;


import com.xilidou.api.IHelloService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TestServiceImpl implements IHelloService {

    private static final Logger logger = LoggerFactory.getLogger(TestServiceImpl.class);

    @Override
    public String sayHi(String name) {
        logger.info("name:{}",name);
        return "Hello " + name;
    }
}
