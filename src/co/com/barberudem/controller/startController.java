package co.com.barberudem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import co.com.barberudem.model.FirstPageDTOold;
import co.com.barberudem.services.BarberFacade;

@Controller
public class startController {
	
	@RequestMapping(value="/start", method=RequestMethod.GET)
	public ModelAndView start(@ModelAttribute("imagenes") FirstPageDTOold firstPageDTO) {
		BarberFacade barberFacade = BarberFacade.getInstance();		
		return new ModelAndView("index", "imagenes", barberFacade.getFirstPageDTO());
	}

	 @RequestMapping(value="/lugares", method=RequestMethod.GET)
	  public ModelAndView places(@ModelAttribute("imagenes") FirstPageDTOold firstPageDTO) {
	    BarberFacade barberFacade = BarberFacade.getInstance();   
	    return new ModelAndView("places", "imagenes", barberFacade.getFirstPageDTO());
	  }
}
