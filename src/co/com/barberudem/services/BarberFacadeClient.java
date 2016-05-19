package co.com.barberudem.services;

import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import co.com.barberudem.model.FirstPageDTO;

public class BarberFacadeClient {

  public FirstPageDTO getFirstPageDTO() {

    // Creando un cliente para el WS
    Client client = Client.create();
    WebResource webResource = client.resource("http://localhost:8081/barberudem_ws/rest/json/firstpage/servicio1");
    
    // Envia la peticion al WS y obtiene la respuesta
    ClientResponse response = webResource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
    if (response.getStatus() != 200) {
      throw new RuntimeException("Failed: HTTP error code: " + response.getStatus());
    }
    
    String output = response.getEntity(String.class);
    System.out.println(output);
    
    // TODO Convertir Json a DTO
    
    return null;
  }
}
