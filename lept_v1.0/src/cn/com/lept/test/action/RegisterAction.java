package cn.com.lept.test.action;

import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.com.common.action.BaseAction;
import cn.com.lept.test.model.User;
import cn.com.lept.test.service.impl.UserService;

@Controller("register")
@Scope("prototype")
@ParentPackage("default-package")
@Results({
		@Result(name ="index",location = "/index.jsp")})
public class RegisterAction extends BaseAction {
	private static final long serialVersionUID = 6095344233772050061L;

	@Resource(name = "userService")
	private UserService userService;
	private User user;
	private String username;
	private String password;

	@RequestMapping("regist")
	public String regist(){
		System.out.println("ssss");
		return "success";
	}
	@RequestMapping("login")
	public String login(){
		if(user == null){
			user = new User();
			user.setName("defqw");
			user.setAge(23);
		}
		User u = this.userService.findByExample(user);
		if(u!=null){
			getRequest().getSession().setAttribute("user", u);
		}
		return "index";
	}
	public String getUsername() {
		return this.username;
	}

//	@RequiredStringValidator(message = "请输入用户名!")
	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}
//	@RequiredStringValidator(message = "请输入密码!")
	public void setPassword(String password) {
		this.password = password;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}