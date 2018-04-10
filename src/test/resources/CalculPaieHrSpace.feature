@CalculPaie 
Feature: Calculer Paie pour un salarié existant

Scenario: Successful Calcul de Paie 
Scenario Outline: Successful Calcul de Paie

        Given _user_is_on_homepage_
	Then _user_enters_'<username>'_and_'<password>'_ 
        Then user_click_on_menu 




Examples:
|||