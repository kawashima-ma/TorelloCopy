package jp.co.torelloCopy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.torelloCopy.dto.factory.UserDtoFactory;
import jp.co.torelloCopy.form.SignupForm;
import jp.co.torelloCopy.service.SignupService;


@Controller
public class SignupController {
	@Autowired
	private SignupService signupService;
	@Autowired
	private UserDtoFactory userDtoFactory;

	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String signup(@ModelAttribute SignupForm signupForm, Model model) {
		model.addAttribute("signupForm", signupForm);
		return "signup";

	}

	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String signup(@ModelAttribute @Validated(SignupForm.All.class)SignupForm signupForm, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "signup";
		}

		String password = signupForm.getPassword();
		String confirm_password = signupForm.getConfirmPassword();
		if(!(password.equals(confirm_password))) {
			model.addAttribute("errorMessage","パスワードと確認用パスワードが一致しません");
			return "signup";
		}


		try {
			signupService.registUser(userDtoFactory.sign(signupForm));
		} catch (DuplicateKeyException ex) {
			result.rejectValue("password", "パスワードが既に使用されています", "パスワードが既に使用されています");
			return "signup";
		}

		return "redirect:login";

	}
}
