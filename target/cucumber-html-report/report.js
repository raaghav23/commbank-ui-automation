$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TravelMoney.feature");
formatter.feature({
  "line": 2,
  "name": "Validate Commbank landing page",
  "description": "",
  "id": "validate-commbank-landing-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@serviceNSW"
    }
  ]
});
formatter.before({
  "duration": 193000,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "",
  "description": "",
  "id": "validate-commbank-landing-page;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User navigates to Commbank Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Validate the navigation to Travel money overseas section",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Subtopics exists in section",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "validate netbank details",
  "keyword": "Then "
});
formatter.match({
  "location": "TravelMoneyStepDefinition.userNavigatesToCommbankHomepage()"
});
formatter.result({
  "duration": 3117595500,
  "error_message": "java.lang.NullPointerException: null value in entry: url\u003dnull\r\n\tat com.google.common.collect.CollectPreconditions.checkEntryNotNull(CollectPreconditions.java:32)\r\n\tat com.google.common.collect.SingletonImmutableBiMap.\u003cinit\u003e(SingletonImmutableBiMap.java:42)\r\n\tat com.google.common.collect.ImmutableBiMap.of(ImmutableBiMap.java:72)\r\n\tat com.google.common.collect.ImmutableMap.of(ImmutableMap.java:124)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:277)\r\n\tat stepDefinition.TravelMoneyStepDefinition.userNavigatesToCommbankHomepage(TravelMoneyStepDefinition.java:35)\r\n\tat ✽.Given User navigates to Commbank Homepage(TravelMoney.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "TravelMoneyStepDefinition.validate_the_travel_money_overseas_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TravelMoneyStepDefinition.subtopicsExistsInSection()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TravelMoneyStepDefinition.validateNetbankDetails()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 56400,
  "status": "passed"
});
});