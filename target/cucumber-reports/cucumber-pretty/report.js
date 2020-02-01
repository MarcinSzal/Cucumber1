$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/ContactUs.feature");
formatter.feature({
  "line": 1,
  "name": "Contact Us",
  "description": "",
  "id": "contact-us",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Contact Us",
  "description": "",
  "id": "contact-us;contact-us",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Wchodze na strone glowna",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Wybieram opcje Contact Us",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Wpisuje dane do kontaktu",
  "rows": [
    {
      "cells": [
        "temat",
        "email",
        "order",
        "message"
      ],
      "line": 7
    },
    {
      "cells": [
        "Webmaster",
        "testBDD@tt.pl",
        "WVNSTNVRY - 10/25/2019",
        "prosz o kontakt"
      ],
      "line": 8
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Wysylam email",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Sprawdzam komunikat",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.wchodze_na_strone_glowna()"
});
formatter.result({
  "duration": 7768003500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.wybieram_opcje_contact_us()"
});
formatter.result({
  "duration": 1152191600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.wpisuje_dane_do_kontaktu(DataTable)"
});
formatter.result({
  "duration": 10461299800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.wysylam_email()"
});
formatter.result({
  "duration": 1399099300,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});