package no.fint.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Represents a main object in the Fint model.
 * <p>
 * This interface extends {@link FintObject} to provide specific functionalities for objects
 * that are considered main entities within the Fint data model. Such objects are identifiable
 * and potentially have relationships with other main objects.
 */
public interface FintMainObject extends FintObject {

    /**
     * Retrieves a map of identifikators for this object.
     * <p>
     * To ensure that every {@code FintMainObject} is uniquely identifiable, this method returns
     * a map where the key represents the name of the identifikator (idField), and the value is
     * an instance of {@link FintIdentifikator}. The {@link FintIdentifikator} interface is used
     * for setting and updating the value of the identifikator (idValue), effectively managing
     * the object's identification mechanism.
     *
     * @return a map where each key is a string representing the name of the identifikator (idField),
     * and the value is the {@link FintIdentifikator} managing the identifikator's value (idValue).
     */
    Map<String, FintIdentifikator> getIdentifikators();

    /**
     * Provides a list of relations to other {@code FintMainObject}s.
     * <p>
     * By default, this method returns an empty list, as not all main objects may have relations.
     * Implementations can override this method to specify actual relations, facilitating
     * the representation of relationships between different main objects within the model.
     *
     * @return a list of {@link FintRelation} objects representing the relationships this object
     * has with other main objects. Returns an empty list by default.
     */
    default List<FintRelation> getRelations() {
        return new ArrayList<>();
    }

}
