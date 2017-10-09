package com.snow.phoenix.blog.app.service;

/* 				    
 **********************************************
 *      DATE           PERSON       REASON
 *    2017/10/9          FXY        Created
 **********************************************
 */


import com.google.common.base.Preconditions;
import com.snow.phoenix.blog.app.api.exception.BlogException;
import com.snow.phoenix.blog.app.api.service.MessageBoardService;
import com.snow.phoenix.blog.app.core.model.phoenix_blog.MessageBoard;
import com.snow.phoenix.blog.app.dao.mapper.phoenix_blog.MessageBoardMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 留言版服务
 */
@Service("messageBoardService")
public class MessageBoardServiceImpl implements MessageBoardService {

    //日志统计
    Logger LOGGER = Logger.getLogger(MessageBoardServiceImpl.class);

    //留言板服务
    @Autowired
    MessageBoardMapper messageBoardMapper;


    @Override
    public void add(int messagerId, int messageeId, String message, String email) throws BlogException {
        try {
            Preconditions.checkArgument(messagerId > 0);
            Preconditions.checkArgument(messageeId > 0);
            MessageBoard messageBoard = new MessageBoard();
            messageBoard.setMessagerId(messagerId);
            messageBoard.setMessageeId(messageeId);
            messageBoard.setMessage(message);
            messageBoard.setMessagerEmail(email);
            messageBoardMapper.insertSelective(messageBoard);
        } catch (Exception e) {
            LOGGER.error("游客：" + messagerId + " 给博主：" + messageeId + " 留言：" + message + " 发生错误了！", e);
            throw new BlogException("1001", "发布留言发生错误了", e);
        }

    }
}
