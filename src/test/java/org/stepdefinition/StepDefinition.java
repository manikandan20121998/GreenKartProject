package org.stepdefinition;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.page.Pom;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass{
	public static Pom  p;
	public static WebDriver driver;
	@Given("user should go to greenkart webpage")
	public void user_should_go_to_greenkart_webpage() {
     
	}

	@When("user pass the onion on search text box")
	public void user_pass_the_onion_on_search_text_box() {
		p=new Pom();
		sendkeys(p.getSearch(), "onion");
		
	}

	@When("user press the increment btn for kg")
	public void user_press_the_increment_btn_for_kg() throws InterruptedException {
		p.increment();
	}

	@When("user click the add to cart bitton")
	public void user_click_the_add_to_cart_bitton() {
     click(p.getAddtocart());
	}

	@When("then click add to cart icon")
	public void then_click_add_to_cart_icon() {
    click(p.getCard());
	}

@When("user has to click checkout btn")
public void user_has_to_click_checkout_btn() {
  click(p.getCheckout());
}

@When("user pass coupon code {string} and apply")
public void user_pass_coupon_code_and_apply(String string) {
sendkeys(p.getPromo(), string);
click(p.getApply());
}

@When("user has to click place btn")
public void user_has_to_click_place_btn() {
click(p.getPlace());

}

@When("user click a country for select purpose")
public void user_click_a_country_for_select_purpose() {
p.countryselect();
}

@When("user confirm the btn")
public void user_confirm_the_btn() {
click(p.getCon());
}

@Then("user click the proceed btn")
public void user_click_the_proceed_btn() {
click(p.getPlacelast());
}
	//scenario sanity

@When("user get common veg and price")
public void user_get_common_veg_and_price() {
 p.map();
}
@When("user get particular veg")
public void user_get_particular_veg() {
   p.particular();
}

//Scenario regression
@When("Add all products in list and print in console")
public void add_all_products_in_list_and_print_in_console() {
p.list();
}

@When("add all added products in set interface check any duplicate there or not")
public void add_all_added_products_in_set_interface_check_any_duplicate_there_or_not() {
p.set();
}

	
		
}
