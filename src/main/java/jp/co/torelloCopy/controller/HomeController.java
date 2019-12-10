package jp.co.torelloCopy.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.torelloCopy.dto.UserBoardDto;
import jp.co.torelloCopy.dto.UserDto;
import jp.co.torelloCopy.service.HomeService;


@Controller
public class HomeController {
	@Autowired
	private HttpSession session;
	@Autowired
	private HomeService homeService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String doGet(Model model) {
		UserDto loginUser = (UserDto) session.getAttribute("loginUser");
		Integer userId = loginUser.getId();
		List<UserBoardDto> boardList = homeService.getBoardIds(userId);
		model.addAttribute("boardList", boardList);
		model.addAttribute("loginUser", loginUser);
		return "home";
	}
}
