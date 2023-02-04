$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Sales.feature");
formatter.feature({
  "line": 2,
  "name": "Sales flow",
  "description": "description Class",
  "id": "sales-flow",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Sales"
    }
  ]
});
formatter.before({
  "duration": 5177335200,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User make a purchase with 2 item",
  "description": "",
  "id": "sales-flow;user-make-a-purchase-with-2-item",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User open the website sauce demo",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User input \"standard_user\" as userName and input \"secret_sauce\" as password",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User already on landing page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User sort product list by \"Name (Z to A)\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User choice 2 products from the list",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User return to page chart",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User already on checkout page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User input \"Aisyah\" as userFirst and input \"DewiRulyadi\" as last and input \"123\" as zip",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User ensure the item total and tax",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "User ensure the total price after sum with the tax",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User Has Completed the Checkout Order",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.verifyLogin()"
});
formatter.result({
  "duration": 319202000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 12
    },
    {
      "val": "secret_sauce",
      "offset": 50
    }
  ],
  "location": "LoginSteps.inputCredential(String,String)"
});
formatter.result({
  "duration": 504810600,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.verifyLandingPage()"
});
formatter.result({
  "duration": 89957400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Name (Z to A)",
      "offset": 27
    }
  ],
  "location": "PurchaseSteps.sortProductValue(String)"
});
formatter.result({
  "duration": 3183879000,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.choiceProduct()"
});
formatter.result({
  "duration": 2120579900,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.openCart()"
});
formatter.result({
  "duration": 2124087200,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutSteps.verifyYourCartPage()"
});
formatter.result({
  "duration": 9208680300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Aisyah",
      "offset": 12
    },
    {
      "val": "DewiRulyadi",
      "offset": 44
    },
    {
      "val": "123",
      "offset": 76
    }
  ],
  "location": "CheckoutSteps.inputCredential(String,String,String)"
});
formatter.result({
  "duration": 20570128600,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutOverviewSteps.verifyYourCartList()"
});
formatter.result({
  "duration": 2104017300,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutOverviewSteps.verifyTotalPrice()"
});
formatter.result({
  "duration": 2077395100,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutOverviewSteps.verifyCheckoutOrderPage()"
});
formatter.result({
  "duration": 4120613500,
  "status": "passed"
});
formatter.after({
  "duration": 809992600,
  "status": "passed"
});
});