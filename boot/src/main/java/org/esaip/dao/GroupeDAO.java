package org.esaip.dao;

import org.esaip.dao.interf.IGroupeDAO;
import org.springframework.stereotype.Repository;

import org.esaip.entity.GroupeEntite;

/**
 * Implémentation de la DAO pour la gestion des données de l'entité GroupeEntite
 *
 *
 */
@Repository
public class GroupeDAO extends GenericDAO<GroupeEntite> implements IGroupeDAO {

}
