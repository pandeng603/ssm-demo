package pan.deng.ssm.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import pan.deng.ssm.pojo.User;
import pan.deng.ssm.service.UserService;

@Controller("userController")
@RequestMapping("/user")
public class UserController {

	@Resource
	private UserService userService;
	
	@RequestMapping("/showUser")
	public String showUser(HttpServletRequest req, Model model) {
		int userId = Integer.parseInt(req.getParameter("userId"));
		User user = userService.getUserById(userId);
		model.addAttribute("user",user);
		return "showUser";
	}
	
}
