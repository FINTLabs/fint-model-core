package no.fint.model;

public interface FintModelObject extends FintMainObject {

    /**
     * Checks if the resource has any fields that are writable.
     */
    boolean isWriteable();

}
