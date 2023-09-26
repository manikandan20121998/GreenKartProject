$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature/greenkart.feature");
formatter.feature({
  "name": "To place a order of onion vegetables",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@E2E"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user should go to greenkart webpage",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_should_go_to_greenkart_webpage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "To search onion vegtable and place to order",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@E2E"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user pass the onion on search text box",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_pass_the_onion_on_search_text_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user press the increment btn for kg",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_press_the_increment_btn_for_kg()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click the add to cart bitton",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_click_the_add_to_cart_bitton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "then click add to cart icon",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.then_click_add_to_cart_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to click checkout btn",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_has_to_click_checkout_btn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user pass coupon code \"1234\" and apply",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_pass_coupon_code_and_apply(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to click place btn",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_has_to_click_place_btn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click a country for select purpose",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_click_a_country_for_select_purpose()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user confirm the btn",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_confirm_the_btn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click the proceed btn",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_click_the_proceed_btn()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user should go to greenkart webpage",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_should_go_to_greenkart_webpage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "To user set the vegetables and price map wise",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@E2E"
    },
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "user get common veg and price",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_get_common_veg_and_price()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user get particular veg",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_get_particular_veg()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user should go to greenkart webpage",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_should_go_to_greenkart_webpage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "To validate the duplicate product are there or not",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@E2E"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "Add all products in list and print in console",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.add_all_products_in_list_and_print_in_console()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "add all added products in set interface check any duplicate there or not",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.add_all_added_products_in_set_interface_check_any_duplicate_there_or_not()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});