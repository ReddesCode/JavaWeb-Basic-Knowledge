package com.itheima.web.interceptor;

import java.awt.event.InvocationEvent;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class checkLoginInterceptor extends MethodFilterInterceptor {

	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {

		HttpSession session = ServletActionContext.getRequest().getSession();
		Object obj = session.getAttribute("user");
		if(obj == null){
			return "input";
		}
		String rtValue = invocation.invoke();
		return rtValue;
	}

}
