package mx.nestor.insurance.action;

import com.opensymphony.xwork2.ActionSupport;

import mx.nestor.insurance.exception.SecurityBreachException;
import mx.nestor.insurance.model.Agent;

public class Register extends ActionSupport {

	private static final long serialVersionUID = 786961954264911644L;

	private Agent agentBean;

	@Override
	public String execute() throws Exception {

		// Call back end Service to store agentBean info in database..
		// throw new Exception("Exception in Register Action");
		return SUCCESS;
	}

	/*
	 * @Override public void validate() { if (agentBean.getFirstName().length() ==
	 * 0) { addFieldError("agentBean.firstName", "First Name is required"); }
	 * 
	 * if (agentBean.getLastName().length() == 0) {
	 * addFieldError("agentBean.lastName", "Last name is required."); }
	 * 
	 * if (agentBean.getEmail().length() == 0) { addFieldError("agentBean.email",
	 * "Email is required."); } }
	 */

	public void throwSecurityException() throws SecurityBreachException {
		
		throw new SecurityBreachException("Security breach exception thrown from throwSecurityException");
		
	}

	public Agent getAgentBean() {
		return agentBean;
	}

	public void setAgentBean(Agent agentBean) {
		this.agentBean = agentBean;
	}

}
