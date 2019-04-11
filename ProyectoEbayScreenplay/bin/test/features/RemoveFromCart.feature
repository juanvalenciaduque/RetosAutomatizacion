Feature: Remove product
  I want to use this template for my feature file
  
Background:   
  Search on EbaySearch on Ebay
    Given Juan Diego wants to perform a search on ebay
    When Search Product on Ebay
      | product  | categorie              | amount |
      | PES 2019 | Videojuegos y consolas |      3 |       
    Then he check the result
      | Pro Evolution Soccer 2019 (PES 2019) ps4!!! nuevo + embalaje orig.!!! |
      
      
    Given Juan Diego made and validated a search
    When he select a product
    | product  | categorie              | amount |
     | PES 2019 | Videojuegos y consolas |      3 |  
    Then he validated the selection
    | Pro Evolution Soccer 2019 (PES 2019) ps4!!! nuevo + embalaje orig.!!! |


    Given Juan Diego selected a product
    When he wants to add to the cart
      | product  | categorie              | amount |
      | PES 2019 | Videojuegos y consolas |      3 |
    Then he validates that the product is correct
      | Pro Evolution Soccer 2019 (PES 2019) ps4!!! nuevo + embalaje orig.!!! |
      
  Scenario: Remove from product
    Given Juan Diego has a product in the cart
    
    When he wants to eliminate the product from the cart
    
    Then he validates that the cart is empty


