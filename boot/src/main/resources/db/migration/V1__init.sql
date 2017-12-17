------------------------------------------------------------
--        Script SQL_Derby.  
------------------------------------------------------------

------------------------------------------------------------
-- Table: ETUDIANT
------------------------------------------------------------
CREATE TABLE ETUDIANT(
	ID_ETUDIANT  INT AUTO_INCREMENT PRIMARY KEY,
	nom          Varchar ,
	prenom       Varchar ,
	ID_groupe    Int
);


------------------------------------------------------------
-- Table: DIRECTEUR
------------------------------------------------------------
CREATE TABLE DIRECTEUR(
	ID_directeur  INT AUTO_INCREMENT PRIMARY KEY,
	nom           Varchar ,
	prenom        Varchar
);


------------------------------------------------------------
-- Table: INFORMATION
------------------------------------------------------------
CREATE TABLE INFORMATION(
	ID_information  INT AUTO_INCREMENT PRIMARY KEY,
	contenue        Varchar	
	ID_directeur     Int
);


------------------------------------------------------------
-- Table: PROBLEME
------------------------------------------------------------
CREATE TABLE PROBLEME(
	ID_probleme  INT AUTO_INCREMENT PRIMARY KEY,
	contenu      Varchar ,
	creation     Date ,
	ID_ETUDIANT  Int
);


------------------------------------------------------------
-- Table: GROUPE
------------------------------------------------------------
CREATE TABLE GROUPE(
	ID_groupe        int AUTO_INCREMENT PRIMARY KEY,
	classe           Varchar ,
	limite_probleme  Smallint ,
	ID_directeur     Int
);


------------------------------------------------------------
-- Table: VOTE_PROBLEME
------------------------------------------------------------
CREATE TABLE VOTE_PROBLEME(
	ID_ETUDIANT  Int ,
	ID_probleme  Int ,
	PRIMARY KEY (ID_ETUDIANT,ID_probleme)
);





ALTER TABLE ETUDIANT ADD FOREIGN KEY (ID_groupe) REFERENCES GROUPE(ID_groupe);
ALTER TABLE PROBLEME ADD FOREIGN KEY (ID_ETUDIANT) REFERENCES ETUDIANT(ID_ETUDIANT);
ALTER TABLE GROUPE ADD FOREIGN KEY (ID_directeur) REFERENCES DIRECTEUR(ID_directeur);
ALTER TABLE VOTE_PROBLEME ADD FOREIGN KEY (ID_ETUDIANT) REFERENCES ETUDIANT(ID_ETUDIANT);
ALTER TABLE VOTE_PROBLEME ADD FOREIGN KEY (ID_probleme) REFERENCES PROBLEME(ID_probleme);
ALTER TABLE INFORMATION ADD FOREIGN KEY (ID_directeur) REFERENCES DIRECTEUR(ID_directeur);


