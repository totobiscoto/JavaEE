package org.esaip.dao;

import org.esaip.dao.interf.IInformationDAO;
import org.springframework.stereotype.Repository;

import org.esaip.entity.InformationEntite;

/**
 * Implémentation de la DAO pour la gestion des données de l'entité InformationEntite
 *
 *
 */
@Repository
public class InformationDAO extends GenericDAO<InformationEntite> implements IInformationDAO {

}
