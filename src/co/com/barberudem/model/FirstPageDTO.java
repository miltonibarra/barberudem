package co.com.barberudem.model;

import java.io.Serializable;
import java.util.List;

public class FirstPageDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 987412158441775832L;

	private List<String> imagePath;
	
	private List<SessionFirstPageDTO> sessionFirstPageDTOList;

	public List<String> getImagePath() {
		return imagePath;
	}

	public void setImagePath(List<String> imagePath) {
		this.imagePath = imagePath;
	}

	public List<SessionFirstPageDTO> getSessionFirstPageDTOList() {
		return sessionFirstPageDTOList;
	}

	public void setSessionFirstPageDTOList(
			List<SessionFirstPageDTO> sessionFirstPageDTOList) {
		this.sessionFirstPageDTOList = sessionFirstPageDTOList;
	}

	
}
