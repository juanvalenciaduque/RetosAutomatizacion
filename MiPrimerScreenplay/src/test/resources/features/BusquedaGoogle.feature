Feature: Busqueda Google
  I want to use this template for my feature file

  @SmokeTest
  Scenario Outline: Realizar busqueda en google
    Given Juan Diego esta en el sitio de google
    When El busca la frase compuesta "<palabra>" compuesta "<palabrados>"
    Then El verifica que la palabra "<resultadoEsperado>" este en los resultados

    Examples: 
      | palabra          | palabrados | resultadoEsperado    |
      | switch           | uno        | switch uno           |
      | sophos solutions | dos        | sophos solutions dos |
      | hola             | tres       | hola tres            |
