package com.callsystem.controllers;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home2";
	}
	//TODO: MAPEAR O HIBERNATE
	
	//CRIAR PAGINA DE CADASTRO DE USUARIOS
	//CRIAR PAGINA DE CADASTRO DE RAMAIS
		   
	//CRIAR PAGINA DE LOGIN
	//CRIAR PAGINA DE LISTAGEM DE USUARIOS
	//CRIAR PAGINA DE LISTAGEM DE RAMAIS E PESQUISA
	//RELATORIO DE RAMAIS
	
	@RequestMapping(value = "/test", method = RequestMethod.POST)
	public ModelAndView  home2(@RequestParam String nome, Model model){
		
		model.addAttribute("nome", nome);
		System.out.println(nome);
		return new ModelAndView("home");
	}
}
