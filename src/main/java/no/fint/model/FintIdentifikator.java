package no.fint.model;

/**
 * Represents an identifikator within the Fint model.
 * <p>
 * This interface is used for managing the identification value (identifikatorverdi) of an object.
 * It provides methods to retrieve and set this value, facilitating the unique identification of
 * objects within the Fint data model.
 */
public interface FintIdentifikator {

    /**
     * Retrieves the current value of the identifikator.
     * <p>
     * This method is used to obtain the identification value associated with an object, which
     * is crucial for uniquely identifying it within the system.
     *
     * @return a string representing the current identifikator value.
     */
    String getIdentifikatorverdi();

    /**
     * Sets the value of the identifikator.
     * <p>
     * This method allows for the identification value of an object to be updated. It is
     * essential for maintaining the unique identification of objects, especially when changes
     * to the identification criteria occur.
     *
     * @param identifikatorverdi the new value for the identifikator.
     */
    void setIdentifikatorverdi(String identifikatorverdi);

}
