Feature: Search Product on Ebay
  I want to use this template for my feature file

  @Smoketest
  Scenario Outline: Search on Ebay
    Given Juan Diego wants to perform a search on ebay
    When Search Product on Ebay
      | Product   | Categorie   |
      | <Product> | <Categorie> |
    Then he check the result "<ExpectedResult>"

    Examples: 
      | Product  | Categorie              | ExpectedResult                                                        |
      | PES 2019 | Videojuegos y consolas | Pro Evolution Soccer 2019 (PES 2019) ps4!!! nuevo + embalaje orig.!!! |
