package org.esaip.dao;

import org.esaip.dao.interf.IEtudiantDAO;
import org.springframework.stereotype.Repository;

import org.esaip.entity.EtudiantEntite;

/**
 * Implémentation de la DAO pour la gestion des données de l'entité EtudiantEntite
 *
 *
 */
@Repository
public class EtudiantDAO extends GenericDAO<EtudiantEntite> implements IEtudiantDAO {

}
