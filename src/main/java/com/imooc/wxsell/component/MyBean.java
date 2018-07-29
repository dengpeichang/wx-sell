package com.imooc.wxsell.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;


@Component
public class MyBean implements InitializingBean {
    private Logger logger = LoggerFactory.getLogger(MyBean.class);
    @Override
    public void afterPropertiesSet() throws Exception {
        logger.info("================>afterPropertiesSet");
    }
}
