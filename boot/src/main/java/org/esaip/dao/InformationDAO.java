package org.esaip.dao;

import java.util.List;

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
	public List<InformationEntite> recherchepargroupe() {
	return getEntityManager().createNativeQuery("select p from INFORMATION p where =", InformationEntite.class).getResultList();
	}

}
