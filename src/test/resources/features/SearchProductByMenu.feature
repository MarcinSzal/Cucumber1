Feature: SearchProductByMenu

  Scenario: SearchProductByMenu
    Given Loguje się do aplikacji login mariusz@test.pl, password pass123
    When Wybieram z menu opcje Women
    When Wyszukuje produkt po atrybutach
    |Categories|Size|Color|Compositions|Styles|Properties|
    |Tops|S|Black|Cotton|Casual|Colorful Dress|