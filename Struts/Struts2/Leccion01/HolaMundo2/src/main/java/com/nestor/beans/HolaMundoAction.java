package com.nestor.beans;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

@Action("/hello")
@Result(name = "success", location = "/results.jsp")
public class HolaMundoAction {
	private String saludosAtr;

	public String execute() {

		this.saludosAtr = "Adios desde Struts2";
		return "exito";
	}

	public String getSaludosAtr() {
		return saludosAtr;
	}

	public void setSaludosAtr(String saludosAtr) {
		this.saludosAtr = saludosAtr;
	}

}
