package com.sample;

public class IndexAction {
	
	private String appName;

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}
	
	public String execute(){
		appName = "SAMPLE STRUTS APPLICATION";
		return "success";
	}

}
