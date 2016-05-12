package co.com.barberudem.model;

import java.io.Serializable;
import java.util.ArrayList;

public class FirstPageDTOold implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 987412158441775832L;

	private ArrayList<String> imagePath;
	
	private ArrayList<SessionFirstPageDTOold> sessionFirstPageDTOList;

	public ArrayList<String> getImagePath() {
		return imagePath;
	}

	public void setImagePath(ArrayList<String> imagePath) {
		this.imagePath = imagePath;
	}

	public ArrayList<SessionFirstPageDTOold> getSessionFirstPageDTOList() {
		return sessionFirstPageDTOList;
	}

	public void setSessionFirstPageDTOList(
			ArrayList<SessionFirstPageDTOold> sessionFirstPageDTOList) {
		this.sessionFirstPageDTOList = sessionFirstPageDTOList;
	}

	
}
