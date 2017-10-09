package com.snow.phoenix.blog.app.api.service;

/* 				    
 **********************************************
 *      DATE           PERSON       REASON
 *    2017/10/9          FXY        Created
 **********************************************
 */


import com.snow.phoenix.blog.app.api.exception.BlogException;

public interface MessageBoardService {

    void add(int messagerId, int messageeId, String message, String email) throws BlogException;

}
