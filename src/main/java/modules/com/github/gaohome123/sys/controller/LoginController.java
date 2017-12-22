package modules.com.github.gaohome123.sys.controller;


import common.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author gaolei
 *
 */
@Controller
@RequestMapping("/login")
public class LoginController extends BaseController{

	@RequestMapping("")
	public String login(){
		return "login";
	}
}
