package co.com.barberudem.services;

import co.com.barberudem.jdbc.entities.Lugar;
import co.com.barberudem.model.FirstPageDTO;
import co.com.barberudem.model.LugarDTO;

public class BarberFacade {

	public FirstPageDTO getFirstPageDTO() {
		FirstPageServices firstPageServices = new FirstPageServicesImpl();
		return firstPageServices.getFirstPageDTO();
	}
	
  /**
   * Obtiene un lugar dado el id
   * @param lugarId
   * @return Lugar {@link Lugar}
   */
  public LugarDTO findLugarByID(int lugarId) {
    LugarServices lugarServices = new LugarServicesImpl();
    return lugarServices.findLugarByID(lugarId);
  }
}
