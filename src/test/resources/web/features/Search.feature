Feature: Como usuario, quiero buscar un producto en el campo "Search"

  @jmy
  Scenario Outline: El usuario busca un producto en la pagina principal
    Given el usuario esta en la pagina principal
    When el usuario busca el articulo <articulo>
    Then el usuario verifica que se ensena la pagina de busqueda

  Examples:
    | articulo |
    | dress   |


  @jmy
  Scenario Outline: Se ordenan los articulos correctamente
    Given el usuario esta en la pagina principal
    When el usuario busca el articulo <articulo>
    And selecciona el filtro <filtro>
    Then los articulos se ordenan correctamente

    Examples:
      | articulo | filtro |
      | short | Price: Lowest first |
