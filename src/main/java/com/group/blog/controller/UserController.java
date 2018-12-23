package com.group.blog.controller;

import com.group.blog.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@Api(tags = "博客管理员信息")
@RestController
public class UserController {

    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;
    @ApiOperation(value = "测试类", notes = "返回success")
    @RequestMapping(value = "test",method = RequestMethod.GET)
    public String test(){
        logger.info("这是测试日志文件！");
        return "success";
    }
}
