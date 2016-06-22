package lib.PatPeter.SQLibrary.Delegates;

import java.io.File;

/**
 * Interface for database delegates that handle a single file.<br>
 * Date Created: 2012-12-18 04:45
 * 
 * @author Nicholas Solin, a.k.a. PatPeter
 */
public interface FilenameDatabase {
	String getDirectory();

	String getExtension();

	File getFile();

	String getFilename();

	void setDirectory(String directory);

	void setExtension(String extension);

	/**
	 * Null assignment for special in-database values.
	 */
	void setFile();

	/**
	 * Set the database file given the directory and filename.
	 * 
	 * @param directory
	 *            the directory of the file.
	 * @param filename
	 *            the name of the database file.
	 */
	void setFile(String directory, String filename);

	/**
	 * Set the database file given the directory, filename, and extension.
	 * 
	 * @param directory
	 *            the directory of the file.
	 * @param filename
	 *            the name of the database file.
	 * @param extension
	 *            the extension of the database file.
	 */
	void setFile(String directory, String filename, String extension);

	void setFilename(String filename);
}