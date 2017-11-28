package org.esaip.dao;

import org.esaip.dao.interf.IVoteProblemeDAO;
import org.springframework.stereotype.Repository;

import org.esaip.entity.VoteProblemeEntite;

/**
 * Implémentation de la DAO pour la gestion des données de l'entité VoteProblemeEntite
 *
 *
 */
@Repository
public class VoteProblemeDAO extends GenericDAO<VoteProblemeEntite> implements IVoteProblemeDAO {

}
