Feature: Busqueda Bing
  I want to use this template for my feature file


	@SmokeTest
  Scenario Outline: Busqueda en Bing
    Given Juan Diego en el sitio de google
    
    When El busca la palabra "<palabra>" 
    
    Then El verifica que la palabra "<palabra>" este en los resultados
    Examples: 
      | palabra           | 
			| switch  			    | 
      | sophos solutions  |
      | jdjljlfjdlkfdklm  |