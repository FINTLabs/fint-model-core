package no.fint.model;

/**
 * Enumerates the possible multiplicities of relationships in the Fint model.
 * <p>
 * This enumeration defines the specific types of relationship multiplicities that can exist
 * between Fint model objects. It specifies the required presence and quantity of relationships
 * in the model, aiding in the definition and understanding of the data model's structure and
 * constraints.
 */
public enum FintMultiplicity {

    /**
     * Indicates a one-to-one relationship between two objects, where the relation is required
     * and will always be present. This multiplicity ensures that for every instance of one object,
     * there is exactly one related instance of another object.
     */
    ONE_TO_ONE,

    /**
     * Indicates a one-to-many relationship, where one object is related to at least one other object,
     * but can be related to any number of objects. This multiplicity ensures that for every instance
     * of one object, there is at least one related instance of another object, with no upper limit
     * on the number of related instances.
     */
    ONE_TO_MANY,

    /**
     * Indicates a none-to-one relationship, where an object may or may not be related to another object,
     * but if a relation is present, it will be only one. This multiplicity allows for optional
     * relationships between objects, with at most one related instance if the relationship exists.
     */
    NONE_TO_ONE,

    /**
     * Indicates a none-to-many relationship, where an object may not be related to any other objects,
     * or it can be related to any number of objects. This multiplicity allows for optional relationships
     * that can vary from none to many related instances, offering the most flexibility in the presence
     * and quantity of relationships.
     */
    NONE_TO_MANY;

}
