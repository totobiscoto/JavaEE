package org.esaip.dao;

import org.esaip.dao.interf.IProblemeDAO;
import org.springframework.stereotype.Repository;

import org.esaip.entity.ProblemeEntite;

/**
 * Implémentation de la DAO pour la gestion des données de l'entité ProblemeEntite
 *
 *
 */
@Repository
public class ProblemeDAO extends GenericDAO<ProblemeEntite> implements IProblemeDAO {

}
