package com.demo.colleague;

import com.demo.mediator.IMediator;

/**
 * 用户C
 * 
 * @author
 * 
 */
public class UserC extends AbstractUser {
	public UserC(IMediator mediator, String name) {
		super(mediator, name);
		// 注册到中介者对象中
		mediator.regist(this);
	}

	/**
	 * 接收消息方法
	 */
	public void receiveMessage(String message) {
		System.out.println("User C Received Message : " + message);
	}
}
