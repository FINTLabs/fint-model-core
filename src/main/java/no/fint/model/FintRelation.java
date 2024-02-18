package no.fint.model;

/**
 * Represents a relationship between Fint model objects.
 * <p>
 * This interface is used to define the type and multiplicity of relationships
 * between objects in the Fint data model. It includes methods for retrieving
 * the full package name of the related object (typeName) and the relationship's
 * multiplicity.
 */
public interface FintRelation {

    /**
     * Retrieves the full package name of the related object type.
     * <p>
     * This method is crucial for identifying the type of object that
     * is related, allowing for dynamic resolution of relationships
     * within the Fint model.
     *
     * @return a string representing the full package name of the related object type.
     */
    String getTypeName();

    /**
     * Retrieves the multiplicity of the relationship.
     * <p>
     * This method indicates the nature of the relationship between objects,
     * such as one-to-one, one-to-many, etc., which is essential for
     * understanding the data model's structure and constraints.
     *
     * @return an instance of {@link FintMultiplicity} representing the multiplicity of the relationship.
     */
    FintMultiplicity getMultiplicity();

}
