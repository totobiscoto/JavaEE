package org.esaip.exception;

/**
 * Classe permettant de transformer les exceptions remontées par les DAO en exception gérée par l'application "DAOException" (AOP)
 *
 *
 */
public class ExceptionDaoAspect {

    /**
     * Permet de transformer les exceptions remontées par les DAO en DAOException.
     *
     * @param ex
     *            Exception levée
     * @throws DAOException
     *             Exception transformée
     */
    public final void transformer(final Throwable ex) throws DAOException {
        if (ex instanceof DAOException) {
            throw (DAOException) ex;
        } else {
            throw new DAOException(ex);
        }
    }
}
