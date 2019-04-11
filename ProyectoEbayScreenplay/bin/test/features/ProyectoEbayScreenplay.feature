Feature: Search Product on Ebay
  I want to use this template for my feature file

  Scenario Outline: Search on Ebay
    Given Juan Diego wants to perform a search on ebay
    When Search Product on Ebay
      | product  | categorie              | amount |
      | PES 2019 | Videojuegos y consolas |      3 | 
    Then he check the result 
      | Pro Evolution Soccer 2019 (PES 2019) ps4!!! nuevo + embalaje orig.!!! |
