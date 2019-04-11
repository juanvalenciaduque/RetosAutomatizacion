Feature: Add To Cart
  I want to use this template for my feature file

  Scenario: Shopping Cart
    Given Juan Diego selected a product
    When he wants to add to the cart
      | product  | categorie              | amount |
      | PES 2019 | Videojuegos y consolas |      3 |
    Then he validates that the product is correct
      | Pro Evolution Soccer 2019 (PES 2019) ps4!!! nuevo + embalaje orig.!!! |
