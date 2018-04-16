@CyclePaie 
Feature: Calculer Paie pour un salarié existant

Scenario: Successful Cycle de Paie 


        Given User Is On HomePagePaie
	When User Enters Name And Password Paie
        Then User Click on CalculerPaie
        Then User Switch To BannerFrame 
        Then User Type Demande                                     
        Then User Click On Recherche
        Then User Switch ListView
        Then User Click On PaieChoisie
        Then User Switch To Bodyone
        Then User Type Travail  
        Then User Switch Tab Editions
        Then User Switch To Bodytwo
        Then User Switch To Tab Preselection
        Then User Switch To Bodythree 
        Then User Enters Sql Code
        Then User Switch To BannerFrameoneP
        Then User Click On SoumettreP
        Then User Navigate To Cick On Bulletin
        Then User Switch To BannerFrametwo
        Then User Type Matricule    
        Then User Click On Recherchetwo
        Then User Switch To Bodyfour
        Then User Change Etat Temoin 
        Then User Switch To BannerFramethree
        Then User Click On Soumettretwo
        Then User Confirm Paie
