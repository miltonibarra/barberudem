package co.com.barberudem.services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.barberudem.jdbc.dao.LugarDAO;
import co.com.barberudem.jdbc.entities.Lugar;
import co.com.barberudem.model.LugarDTO;

public class LugarServicesImpl implements LugarServices {

  @Override
  public LugarDTO findLugarByID(int lugarId) {
 // Se obtiene el contexto de la aplicacion
    ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");

    // Se obtiene el servicio que implementa los servicios de la base de datos
    LugarDAO lugarDAO = (LugarDAO) context.getBean("lugarDAO");
    
    Lugar lugar = lugarDAO.findLugarByID(lugarId);
    
    LugarDTO lugarDTO = new LugarDTO();
    lugarDTO.setAddress(lugar.getAddress());
    lugarDTO.setDescription(lugar.getDescription());
    lugarDTO.setEmail(lugar.getEmail());
    lugarDTO.setId(lugar.getId());
    lugarDTO.setLat(lugar.getLat());
    lugarDTO.setLng(lugar.getLng());
    lugarDTO.setName(lugar.getName());
    lugarDTO.setPhone(lugar.getPhone());
    lugarDTO.setSchedule(lugar.getSchedule());
    return lugarDTO;
  }

}
