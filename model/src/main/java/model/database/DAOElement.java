package model.database;

import java.sql.Connection;
import java.sql.SQLException;

import model.element.Element;

/**
 * The Class DAOEntity.
 *
 * 
 *
 * @param <E>
 *          the element type
 */
abstract class DAOElement<E extends Element> {

	/** The connection. */
	private final Connection connection;

	/**
	 * Instantiates a new DAO entity.
	 *
	 * @param connection
	 *          the connection
	 * @throws SQLException
	 *           the SQL exception
	 */
	public DAOElement(final Connection connection) throws SQLException {
		this.connection = connection;
	}

	/**
	 * Gets the connection.
	 *
	 * @return the connection
	 */
	protected Connection getConnection() {
		return this.connection;
	}

	/**
	 * Creates the.
	 *
	 * @param element
	 *          the element
	 * @return true, if successful
	 */
	public abstract boolean create(E element);

	/**
	 * Delete.
	 *
	 * @param element
	 *          the element
	 * @return true, if successful
	 */
	public abstract boolean delete(E element);

	/**
	 * Update.
	 *
	 * @param element
	 *          the element
	 * @return true, if successful
	 */
	public abstract boolean update(E element);

	/**
	 * Find.
	 *
	 * @param id
	 *          the id
	 * @return the e
	 */
	public abstract E find(int id);

	/**
	 * Find.
	 *
	 * @param key
	 *          the key
	 * @return the e
	 */
	public abstract E find(String key);

}