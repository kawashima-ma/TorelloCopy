package jp.co.torelloCopy.controller;


//import javax.servlet.http.HttpSession;
//import javax.validation.Valid;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import jp.co.torelloCopy.dto.UserDto;
//import jp.co.torelloCopy.dto.factory.MakeBoardDtoFactory;
//import jp.co.torelloCopy.form.MakeBoardForm;
//import jp.co.torelloCopy.service.MakeBoardService;
//
//
//@Controller
//public class MakeBoardController {
//	@Autowired
//	private HttpSession session;
//	@Autowired
//	private MakeBoardService makeBoardService;
//	@Autowired
//	private MakeBoardDtoFactory dtoFactory;
//
//	@RequestMapping(value = "/makeBoard", method = RequestMethod.GET)
//	public String doGet(@ModelAttribute MakeBoardForm form, Model model) {
//		model.addAttribute("makeBoardForm", form);
//		return "makeBoard";
//	}
//
//	@RequestMapping(value = "/login", method = RequestMethod.POST)
//    public String doPost(@Valid  @ModelAttribute  MakeBoardForm form, BindingResult result, Model model) {
//		if(result.hasErrors()){
//			model.addAttribute("makeBoardForm", form);
//        		return "makeBoard";
//		}
//		UserDto loginUser = (UserDto)session.getAttribute("loinUser");
//
////		makeBoardService.makeBoard(loginUser, dtoFactory.create(form));
//
//		return "yourBoard";
//	}
//}
