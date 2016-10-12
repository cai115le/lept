package cn.com.lept.test.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.com.common.action.BaseAction;

/**
 * @ProjectName: lept_v1.0
 * @Description:
 * @Copyright: Copyright (c) 2016
 * @FileName:  UserAction.java
 * @Create DateTime: 2016年8月1日 上午11:58:08
 * @Version: V1.0
 * @author 蔡伟乐
 * @Others: 
 */
@Controller("userAction")
public class UserAction extends BaseAction {
	private static final long serialVersionUID = 1L;
	
	@RequestMapping("login")
	public String login(){
		getRequest().getSession().setAttribute("user", "user");
		return SUCCESS;
	}
}
