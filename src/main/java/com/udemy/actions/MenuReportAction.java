package com.udemy.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.udemy.models.MenuReport;

public class MenuReportAction extends ActionSupport{

	private static final long serialVersionUID = 4995228149651010462L;

	private MenuReport menuReport = new MenuReport();
	private boolean validateForm = true;
	
	@Override
	public void validate() {
		if(menuReport.getBreakfast().equals("-1")) {
			validateForm = false;
			addActionError("");
		} 
		if(menuReport.getLunch().equals("-1")) {
			validateForm = false;
			addActionError("");
		}
		if (menuReport.getDinner().equals("-1")){
			validateForm = false;
			addActionError("");
		}
		if (menuReport.getDessert().equals("-1")){
			validateForm = false;
			addActionError("");
		}
	}
	
	public String execute() {
		return SUCCESS;
	}

	public MenuReport getMenuReport() {
		return menuReport;
	}

	public void setMenuReport(MenuReport menuReport) {
		this.menuReport = menuReport;
	}

	public boolean isValidateForm() {
		return validateForm;
	}

	public void setValidateForm(boolean validateForm) {
		this.validateForm = validateForm;
	}

	
}
