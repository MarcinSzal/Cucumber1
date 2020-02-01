Feature: BuyProduct

  Scenario: BuyProduct
    Given Loguje się do aplikacji login mariusz@test.pl, password pass123
    When Klikam w pierwszy produkt
    When Podaje ilosc 1
    When Podaje rozmiar L
    When Klikam dodaj do koszyka
    When Potwierdzam dodanie do koszyka
    When Podsumowanie
    When Adres
    When Wysylka
    Then Platnosc