@Embauche 
Feature: Embaucher un salarié

Scenario Outline: Successful Embauche 

        Given User Is On HomePage
        Then User wait
	Then User Enters '<username>' and '<password>' 
        Then User Click On Menu 
        Then User Click On Dossier 
        Then User Click On Entree 
        Then User Click On Embaucher
        Then User Switch To BannerFrame 
        Then User Click On Creer
        Then User Switch PopUpWindow
        Then User Type DateRecrutement '<dateRecrutement>'                                        
        Then User Type Societe '<societe>'                                   
        Then User Type Etablissement '<etablissement>'
        Then User Click On Alimenter
        Then User Switch To Body of Renseignements Individuels
        Then User Type Qualite '<qualite>'                                   
        Then User Type Nom '<nom>'                                   
        Then User Type Prenom '<prenom>'                                    
        Then User Type Sexe '<sexe>'                                      
        Then User Type DateNaissance '<dateNaissance>'                                            
        Then User Switch Tab Affectation
        Then User Switch To Body of Tab Affectation
        Then User Type CategoriEntree '<categoriEntree>'                                            
        Then User Type MotifEntree '<motifEntree>'                                           
        Then User Type Emploi '<emploi>'                                          
        Then User Type UniteOrg '<uniteOrganisationnelle>'                                        
        Then User Type CalPaie '<calPaie>'
        Then User Type Code '<codeCycleTravail>'                                   
        Then User Switch Tab Carriere
        Then User Switch To Body of Tab Carriere
        Then User Type CoCollective '<conventionCollective>'                                  
        Then User Type Qualification '<qualification>'
        Then User Type TypePaie '<typePaie>'
        Then User Type CodeGrade '<codeGrade>'                                       
        Then User Type NatureContrat '<natureContrat>'                                            
        Then User Type TypeContrat '<typeContrat>'                                          
        Then User Type TypeTempsContractuel '<typeTempsContractuel>'                                           
        Then User Type HeurTrvailSemaine '<heurTrvailSemaine>'                                           
        Then User Type PourcentageTempsPlein '<pourcentageTempsPlein>'                                           
        Then User Switch Tab SalaireEtPaiement
        Then User Switch To Body of Tab SalaireEtPaiement
        Then User Type Rubrique '<rubrique>'                                           
        Then User Type MontantSalarial '<montantSalarial>'                                           
        Then User Type FreqPaie '<freqPaie>'                                             
        Then User Switch To BannerFrame
        Then User Click On Soumettre

   Examples: 
 | username | password | dateRecrutement| societe|etablissement|qualite|nom   |prenom  |sexe     |dateNaissance|categoriEntree|motifEntree|emploi |uniteOrganisationnelle|calPaie|codeCycleTravail|conventionCollective|qualification|typePaie|codeGrade|natureContrat|typeContrat|typeTempsContractuel|heurTrvailSemaine|pourcentageTempsPlein|rubrique|montantSalarial|freqPaie|                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
 |  TYOUSFI |  HRA     |01/01/2018      |CGM     |CGM01        |M.     |BRUNO |Patrick |MASCULIN |01/01/1990   |STANDA        |REX        |16STAGI|CGM                   |01     |C10A            |9999                |STA          |3       |9999-STA |SC           |ST         |00                  |35               |100                  |ISM     |1500           |MT      |