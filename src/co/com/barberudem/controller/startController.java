package co.com.barberudem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import co.com.barberudem.model.FirstPageDTO;

@Controller
public class startController {
	
	@RequestMapping(value="/start", method=RequestMethod.GET)
	public ModelAndView start() {
		return new ModelAndView("index", "command", new FirstPageDTO());
	}

}
