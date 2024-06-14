package com.spring.sTiles.controller;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.sTiles.common.ARIAUtil;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/tiles")
public class TilesController {
	
	@RequestMapping(value = "/guestList", method = RequestMethod.GET)
	public String getGuestList() {
		log.info("TilesController의 guestList메소드");
		return "guest/guestList";
	}
	
	
	@RequestMapping(value = "/boardList", method = RequestMethod.GET)
	public String getBoardList() {
		return "board/boardList";
	}
	
	
	@RequestMapping(value = "/pdsList", method = RequestMethod.GET)
	public String getPdsList() {
		return "pds/pdsList";
	}
	
	@RequestMapping(value = "/myPage", method = RequestMethod.GET)
	public String getMyPage() {
		return "main/memberMain";
	}
	
	@RequestMapping(value = "/memberLogout", method = RequestMethod.GET)
	public String getLogout(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String mid = (String) session.getAttribute("sMid");
		session.invalidate();
		return "redirect:/message/memberLogout?mid="+mid;
	}
	
	@RequestMapping(value = "/aria", method = RequestMethod.GET)
	public String getAria() {
		return "password/aria";
	}
	
	@RequestMapping(value = "/aria", method = RequestMethod.POST)
	public String posteAria(String pwd, Model model) throws InvalidKeyException, UnsupportedEncodingException {
		String encPwd = ARIAUtil.ariaEncrypt(pwd);
		 
		System.out.println("원본 비번 : ");
		
		return "password/aria";
	}
	

}
