Feature: escojo un vuelo con el precio mas economico, escojo los asientos y los adicionales de cabina.

Background:
  Given  Como cliente ingreso a la url "https://www.latamairlines.com/cl/es"

  # Yo como usuario
  # Quiero
  #
  @PrimerTest
  Scenario: escojo un vuelo mas economico, escojo asientos y adicionales.
    Given escojo la ruta y la fecha
    When valido el horario y la tarifa light de ida
    And valido el horario y la tarifa light de vuelta
    And selecciono un asiento de ida y uno de vuelta
    And selecciono un maleta adicional
    Then Se muestra el formulario para completar.



  @SegundoTest
  Scenario: escojo un vuelo de solo ida, elijo asientos y adicionales.
    Given Elijo la ruta y la fecha de vuelo de solo ida
    When Valido el horario y la tarifa del vuelo
    And Selecciono un asiento en la salida de emergencia
    And Selecciono una 1 maletas adicionales
    Then Se muestra el formulario para completar.
