package com.example.gmall.manage;

import com.example.gmall.manage.utils.FastDfsUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GmallManageWebApplicationTests {

    @Autowired
    private FastDfsUtil fastDfsUtil;

    @Test
    void contextLoads() {
        fastDfsUtil.deleteFile("group1/M00/00/00/rBEABl_GFLGAIGwiAAASdUZcZOE316.jpg");
    }

}
