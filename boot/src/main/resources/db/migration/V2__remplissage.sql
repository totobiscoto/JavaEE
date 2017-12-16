
---------------------------
-- Remplissage DIRECTEUR --
---------------------------
INSERT into DIRECTEUR (nom,prenom) values ('Jackson','Michael');
INSERT into DIRECTEUR (nom,prenom) values ('Joel','Billy');
INSERT into DIRECTEUR (nom,prenom) values ('Jhon','Elton');
INSERT into DIRECTEUR (nom,prenom) values ('Clapton','Eric');

------------------------
-- Remplissage GROUPE --
------------------------
INSERT into GROUPE (classe,limite_probleme,ID_directeur) values ('ECOLE',5,1);
INSERT into GROUPE (classe,limite_probleme,ID_directeur) values ('POP',5,2);
INSERT into GROUPE (classe,limite_probleme,ID_directeur) values ('ROCK',5,3);
INSERT into GROUPE (classe,limite_probleme,ID_directeur) values ('EVEIL MUSICAL',5,3);
INSERT into GROUPE (classe,limite_probleme,ID_directeur) values ('BLUES',5,4);

-------------------------
-- Remplissage ETDIANT --
-------------------------

INSERT into ETUDIANT (nom,prenom,ID_groupe) values ('Girac', 'Kendji',2);
INSERT into ETUDIANT (nom,prenom,ID_groupe) values ('Bureau', 'Vianney',2);
INSERT into ETUDIANT (nom,prenom,ID_groupe) values ('Sheeran', 'Ed',3);
INSERT into ETUDIANT (nom,prenom,ID_groupe) values ('Marie', 'Jul',4);
INSERT into ETUDIANT (nom,prenom,ID_groupe) values ('Beiber', 'Justin',4);
INSERT into ETUDIANT (nom,prenom,ID_groupe) values ('Springsteen', 'Bruce',5);
INSERT into ETUDIANT (nom,prenom,ID_groupe) values ('Whinehouse', 'Amy',5);
