package DTO;

import java.io.Serializable;


public class PrendaAreaProduccionDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5748666707424777788L;
	private Long id;
	private AreaProduccionDTO area;
	private Integer tiempo;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public AreaProduccionDTO getArea() {
		return area;
	}

	public void setArea(AreaProduccionDTO area) {
		this.area = area;
	}

	public Integer getTiempo() {
		return tiempo;
	}

	public void setTiempo(Integer tiempo) {
		this.tiempo = tiempo;
	}
}
