package com.snow.phoenix.blog.app.web.controller;

/* 				    
 **********************************************
 *      DATE           PERSON       REASON
 *    2017/10/9          FXY        Created
 **********************************************
 */

import com.snow.phoenix.blog.app.api.exception.BlogException;
import com.snow.phoenix.blog.app.api.service.MessageBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 留言版控制器
 */

@RestController
@RequestMapping(value = "blog")
public class MessageBoardController {

    //留言版服务
    @Autowired
    MessageBoardService messageBoardService;

    //此处异常应该捕获
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public void add(int messagerId, int messageeId, String message, String email) throws BlogException {
        messageBoardService.add(messagerId, messageeId, message, email);
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public String test() {
        return "this is phoenix-blog project";
    }


}
