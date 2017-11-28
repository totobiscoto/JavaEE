package org.esaip.dao;

import org.esaip.dao.interf.IDirecteurDAO;
import org.springframework.stereotype.Repository;

import org.esaip.entity.DirecteurEntite;

/**
 * Implémentation de la DAO pour la gestion des données de l'entité DirecteurEntite
 *
 *
 */
@Repository
public class DirecteurDAO extends GenericDAO<DirecteurEntite> implements IDirecteurDAO {

}
