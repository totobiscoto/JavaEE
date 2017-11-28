package org.esaip.exception;

/**
 * Represente une exception de type DAO qui peut-être geree.
 *
 */
public class DAOException extends Exception {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    /**
     * Construit une nouvelle exeption avec <code>null</code> comme message de détail.
     */
    public DAOException() {
        super();
    }

    /**
     * Construit une nouvelle exeption avec le message specifie comme détail.
     *
     * @param message
     *            le message
     */
    public DAOException(String message) {
        super(message);
    }

    /**
     * Construit une nouvelle exeption avec le message specifie comme détail et la cause.
     *
     * @param message
     *            le message
     * @param cause
     *            la cause
     */
    public DAOException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Construit une nouvelle exception avec le message specifie comme détail.
     *
     * @param cause
     *            la cause
     */
    public DAOException(Throwable cause) {
        super(cause);
    }

}
