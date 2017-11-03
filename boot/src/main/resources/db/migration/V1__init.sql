------------------------------------------------------------
--        Script SQL_Derby.  
------------------------------------------------------------


------------------------------------------------------------
-- Table: ETUDIANT
------------------------------------------------------------
CREATE TABLE ETUDIANT(
	ID_ETUDIANT  INT GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1)  ,
	nom          Varchar ,
	prenom       Varchar ,
	groupe       Integer ,
	ID_groupe    Int ,
	PRIMARY KEY (ID_ETUDIANT)
);


------------------------------------------------------------
-- Table: DIRECTEUR
------------------------------------------------------------
CREATE TABLE DIRECTEUR(
	ID_directeur  INT GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1)  ,
	nom           Varchar ,
	prenom        Varchar ,
	PRIMARY KEY (ID_directeur)
);


------------------------------------------------------------
-- Table: INFORMATION
------------------------------------------------------------
CREATE TABLE INFORMATION(
	ID_information  INT GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1)  ,
	contenue        Varchar ,
	PRIMARY KEY (ID_information)
);


------------------------------------------------------------
-- Table: PROBLEME
------------------------------------------------------------
CREATE TABLE PROBLEME(
	ID_probleme  INT GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1)  ,
	contenu      Varchar ,
	creation     Date ,
	ID_ETUDIANT  Int ,
	PRIMARY KEY (ID_probleme)
);


------------------------------------------------------------
-- Table: GROUPE
------------------------------------------------------------
CREATE TABLE GROUPE(
	ID_groupe        INT GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1)  ,
	classe           Varchar ,
	limite_probleme  Smallint ,
	ID_directeur     Int ,
	PRIMARY KEY (ID_groupe)
);


------------------------------------------------------------
-- Table: VOTE_PROBLEME
------------------------------------------------------------
CREATE TABLE VOTE_PROBLEME(
	jaime        BOOL  ,
	ID_ETUDIANT  Int ,
	ID_probleme  Int ,
	PRIMARY KEY (ID_ETUDIANT,ID_probleme)
);


------------------------------------------------------------
-- Table: CONCERNE
------------------------------------------------------------
CREATE TABLE CONCERNE(
	ID_groupe       Int ,
	ID_information  Int ,
	PRIMARY KEY (ID_groupe,ID_information)
);


ALTER TABLE ETUDIANT ADD FOREIGN KEY (ID_groupe) REFERENCES GROUPE(ID_groupe);
ALTER TABLE PROBLEME ADD FOREIGN KEY (ID_ETUDIANT) REFERENCES ETUDIANT(ID_ETUDIANT);
ALTER TABLE GROUPE ADD FOREIGN KEY (ID_directeur) REFERENCES DIRECTEUR(ID_directeur);
ALTER TABLE VOTE_PROBLEME ADD FOREIGN KEY (ID_ETUDIANT) REFERENCES ETUDIANT(ID_ETUDIANT);
ALTER TABLE VOTE_PROBLEME ADD FOREIGN KEY (ID_probleme) REFERENCES PROBLEME(ID_probleme);
ALTER TABLE CONCERNE ADD FOREIGN KEY (ID_groupe) REFERENCES GROUPE(ID_groupe);
ALTER TABLE CONCERNE ADD FOREIGN KEY (ID_information) REFERENCES INFORMATION(ID_information);