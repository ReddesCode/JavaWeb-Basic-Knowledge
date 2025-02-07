package day12.domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

public class UserForm {
	
	private String username;
	private String password;
	private String repassword;
	private String email;
	private String birthday;
	
	/*用户名：必须输入，且3~8位的字母组成<br>
	密码：必须输入，3~8位的数组组成<br>
	确认密码：和密码保持一致<br>
	邮箱：必须输入，且要符合邮箱的格式<br>
	生日：必须输入，符合yyyy-MM-dd的格式<br>*/
	
	Map<String, String> msg = new HashMap<String, String>();
	
	public boolean validate(){
		
		if("".equals(username)){
			msg.put("username", "用户名不能为空！");
		}else if(!username.matches("\\w{3,8}")){
			msg.put("username", "用户名: 3~8位字母组成");
		}
		
		if("".equals(password)){
			msg.put("password", "密码不能为空！");
		}else if(!password.matches("\\d{3,8}")){
			msg.put("password", "密码：3~8位数字组成");
		}
		
		if(!repassword.equals(password)){
			msg.put("repassword", "两次密码不一致！");
		}
		
		if("".equals(email)){
			msg.put("email", "邮箱不能为空！");
		}else if(!email.matches("\\b^['_a-z0-9-\\+]+(\\.['_a-z0-9-\\+]+)*@[a-z0-9-]+(\\.[a-z0-9-]+)*\\.([a-z]{2}|aero|arpa|asia|biz|com|coop|edu|gov|info|int|jobs|mil|mobi|museum|name|nato|net|org|pro|tel|travel|xxx)$\\b")){
			msg.put("email", "邮箱格式不正确！");
		}
		
		if("".equals(birthday)){
			msg.put("birthday", "生日不能为空！");
		}else{
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			try {
				sdf.parse(birthday);
			} catch (ParseException e) {
				e.printStackTrace();
				msg.put("birthday", "生日格式不正确！");
			}
		}
		
		return msg.isEmpty();
		
	}

	
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRepassword() {
		return repassword;
	}

	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public Map<String, String> getMsg() {
		return msg;
	}

	public void setMsg(Map<String, String> msg) {
		this.msg = msg;
	}

}
