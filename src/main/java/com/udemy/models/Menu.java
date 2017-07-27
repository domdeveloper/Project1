package com.udemy.models;

import java.util.ArrayList;
import java.util.List;

public class Menu {

	private String timeOfDay;
	private List<String> menu;
	
	public Menu(String timeOfDay) {
		this.timeOfDay = timeOfDay;
		menu = new ArrayList<>();
	}

	public String getTimeOfDay() {
		return timeOfDay;
	}

	public void setTimeOfDay(String timeOfDay) {
		this.timeOfDay = timeOfDay;
	}

	public List<String> getMenu() {
		return menu;
	}

	public void setMenu(List<String> menu) {
		this.menu = menu;
	}
}
