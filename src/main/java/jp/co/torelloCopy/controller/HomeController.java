package jp.co.torelloCopy.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.torelloCopy.dto.UserDto;


@Controller
public class HomeController {
	@Autowired
	private HttpSession session;
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String doGet(Model model) {
		UserDto loginUser = (UserDto) session.getAttribute("loginUser");

		model.addAttribute("loginUser", loginUser);
		return "index";
	}
}
