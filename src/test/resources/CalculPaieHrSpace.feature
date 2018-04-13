@CalculPaie 
Feature: Calculer Paie pour un salarié existant

Scenario: Successful Calcul de Paie 
Scenario Outline: Successful Calcul de Paie

  Given User Is On HomePage
	Then User Enters '<username>' and '<password>' 
        Then User Navigate To Cick On CalculPaie
        Then User Switch To BannerFrame 
        Then User Type Demande '<Demande>'                                        
        Then User Click On Recherche
        Then User Switch ListView
        Then User Click On PaieChoisie
        Then User Switch To Body_1
        Then User Type Travail '<Travail>' 
        Then User Switch Tab Editions
        Then User Switch To Body_2
        Then User Switch To Tab Preselection
        Then User Switch To Body_3 
        Then User Enters Sql Code
        Then User Switch To BannerFrame_1 
        Then User Click On Soumettre
        Then User Navigate To Cick On Bulletin
        Then User Switch To BannerFrame_2 
        Then User Type Matricule '<Matricule>'     
        Then User Click On Recherche_2
        Then User Switch To Body_4
        Then User Change Etat Temoin 
        Then User Switch To BannerFrame_3
        Then User Click On Soumettre_2


Examples:
|||