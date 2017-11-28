package org.esaip.dao;

import org.esaip.dao.interf.IConcerneDAO;
import org.springframework.stereotype.Repository;

import org.esaip.entity.ConcerneEntite;

/**
 * Implémentation de la DAO pour la gestion des données de l'entité ConcernceEntite
 *
 *
 */
@Repository
public class ConcerneDAO extends GenericDAO<ConcerneEntite> implements IConcerneDAO {

}
