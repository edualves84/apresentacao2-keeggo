Feature: notebook

  Scenario: Consultar notebook
    Given  que acesso o site do mercado livre
    When   pesquiso por "Notebook"
    And    clico na lupa
    Then   retorna lista de "Notebook" como resultado