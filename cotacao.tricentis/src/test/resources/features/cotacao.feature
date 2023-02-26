#encoding: utf-8
#Author: Carlos Roberto Coelho

@tag
Feature: Pages no site da tricentis
  Eu como usuario quero criar pages para realizar uma cotacao
  
  Scenario: Cotacao automobile
    Given que entre no site da empresa tricentis para cotacao 
    And que clico na opcao desejada
    When preencho os dados do veiculo
    And preencho os dados do seguro
    And preencho os dados do produto
    And preencho o preco
    And envio cotacao
    Then cotacao enviada com sucesso