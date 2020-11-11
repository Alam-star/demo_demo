$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/resources/features/home.feature");
formatter.feature({
  "line": 1,
  "name": "Search Functionality",
  "description": "",
  "id": "search-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 26,
  "name": "verify user in for work page",
  "description": "",
  "id": "search-functionality;verify-user-in-for-work-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 25,
      "name": "@Senity"
    }
  ]
});
formatter.step({
  "line": 28,
  "name": "Launc \"\u003cURL\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "Enter XPS in search fild",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "click on search button",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "click on for work radio button",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "verify user in for work page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cURL\u003e",
      "offset": 7
    }
  ],
  "location": "homePageStepDep.launc(String)"
});
formatter.result({
  "duration": 2310643700,
  "status": "passed"
});
formatter.match({
  "location": "homePageStepDep.enter_XPS_in_search_fild()"
});
formatter.result({
  "duration": 713433400,
  "status": "passed"
});
formatter.match({
  "location": "homePageStepDep.click_on_search_button()"
});
formatter.result({
  "duration": 4336364200,
  "status": "passed"
});
formatter.match({
  "location": "homePageStepDep.click_on_for_work_radio_button()"
});
formatter.result({
  "duration": 1724868300,
  "status": "passed"
});
formatter.match({
  "location": "homePageStepDep.verify_user_in_for_work_page()"
});
formatter.result({
  "duration": 767572200,
  "status": "passed"
});
});