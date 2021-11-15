Feature: Como usuario quiero ingresar mis datos para entrar a mi cuenta

@jmy
  Scenario Outline: Login con credenciales correctas
    Given estoy en la pantalla de Login
    When ingreso mi email <email> y password <password>
    Then ingreso a My Account

    Examples:
      | email                  | password |
      | jorgematiasyam@gmail.com | 123456   |