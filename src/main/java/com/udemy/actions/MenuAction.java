package com.udemy.actions;

import java.util.Arrays;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;
import com.udemy.models.Menu;
import com.udemy.models.MenuReport;

public class MenuAction extends ActionSupport implements Preparable{

	private static final long serialVersionUID = 4247456579602703830L;
	
	private Menu breakfast = new Menu("breakfast");
	private Menu lunch	= new Menu("lunch");
	private Menu dinner = new Menu("dinner");
	private Menu dessert = new Menu("dessert");
	private boolean validateForm = true;

	@Override
	public void prepare() throws Exception {
		
		breakfast.getMenu().addAll(Arrays.asList("Eggs  and Toast", "Chocolate Chip Pancakes", "French Toast", "Biscuits and Sasauge"));
		lunch.getMenu().addAll(Arrays.asList("Chicken Salad", "Pizza", "Fresh Salad", "Shepards Pie", "Mac and Cheese"));
		dinner.getMenu().addAll(Arrays.asList("Egg Plant Parmesan", "Cheese Burger", "Black Bean Burger", "Salmon and Rice"));
		dessert.getMenu().addAll(Arrays.asList("Cheesecake", "Ice Cream", "Apple Pie", "Red Velvet Cake"));
		
	}
	
	public String execute() {
		if(!validateForm) {
			addActionError("Please pick a meal for each meal");
		}
		return SUCCESS;
	}

	public Menu getBreakfast() {
		return breakfast;
	}

	public void setBreakfast(Menu breakfast) {
		this.breakfast = breakfast;
	}

	public Menu getLunch() {
		return lunch;
	}

	public void setLunch(Menu lunch) {
		this.lunch = lunch;
	}

	public Menu getDinner() {
		return dinner;
	}

	public void setDinner(Menu dinner) {
		this.dinner = dinner;
	}

	public Menu getDessert() {
		return dessert;
	}

	public void setDessert(Menu dessert) {
		this.dessert = dessert;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public boolean isValidateForm() {
		return validateForm;
	}

	public void setValidateForm(boolean validateForm) {
		this.validateForm = validateForm;
	}

	
}
