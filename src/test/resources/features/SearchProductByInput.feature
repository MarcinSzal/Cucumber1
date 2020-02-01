Feature: SearchProductByInput

  Scenario: SearchProductByInput
      Given Loguje się do aplikacji login mariusz@test.pl, password pass123
      When Wyszukuje produkt kategoria_produktu
      When Wyszukuje produkt po nazwa cena
      When Dodaje recenzje
      |tytul|komentarz|
      |Recenzja testowa|Komentarz testowy|
      Then Potwierdzam recenzje