package com.itheima.controller;

import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

	@Autowired
	private AccountService accountService;

	@RequestMapping(value = "/save", produces = "text/html;charset=utf-8")
	public String save(Account account) {

		accountService.save(account);
		return "redirect:/index.jsp";
	}

	@RequestMapping("/listAll")
	public ModelAndView listAll() {

		ModelAndView mv = new ModelAndView();
		List<Account> accountList = accountService.listAll();
		mv.addObject("accountList", accountList);
		mv.setViewName("show");
		return mv;
	}

}
