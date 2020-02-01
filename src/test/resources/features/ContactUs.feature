Feature: Contact Us

  Scenario: Contact Us
    Given Wchodze na strone glowna
    When Wybieram opcje Contact Us
    When Wpisuje dane do kontaktu
    |temat|email|order|message|
    |Webmaster|testBDD@tt.pl|WVNSTNVRY - 10/25/2019|prosze o kontakt|
    When Wysylam email
    Then Sprawdzam komunikat