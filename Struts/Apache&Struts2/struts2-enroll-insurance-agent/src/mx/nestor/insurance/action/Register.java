package mx.nestor.insurance.action;

import com.opensymphony.xwork2.ActionSupport;

import mx.nestor.insurance.model.Agent;

public class Register extends ActionSupport {

	private static final long serialVersionUID = 786961954264911644L;
	
	private Agent agentBean;
	
	@Override
	public String execute() throws Exception {
		
		// Call back end Service to store agentBean info in database..
		return SUCCESS;
	}

	public Agent getAgentBean() {
		return agentBean;
	}

	public void setAgentBean(Agent agentBean) {
		this.agentBean = agentBean;
	}
	
	

}
