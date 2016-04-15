package co.com.barberudem.services;

import co.com.barberudem.model.FirstPageDTO;

public class BarberFacade {

	public FirstPageDTO getFirstPageDTO() {
		FirstPageServices firstPageServices = new FirstPageServicesImpl();
		return firstPageServices.getFirstPageDTO();
	}
}
