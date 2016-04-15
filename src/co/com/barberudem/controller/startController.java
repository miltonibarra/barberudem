package co.com.barberudem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import co.com.barberudem.model.FirstPageDTO;
import co.com.barberudem.services.BarberFacade;

@Controller
public class startController {
	
	@RequestMapping(value="/start", method=RequestMethod.GET)
	public ModelAndView start(@ModelAttribute("imagenes") FirstPageDTO firstPageDTO) {
		BarberFacade barberFacade = new BarberFacade();		
		return new ModelAndView("index", "imagenes", barberFacade.getFirstPageDTO());
	}

}
