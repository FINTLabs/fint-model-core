package no.fint.model;

import java.util.ArrayList;
import java.util.List;

public interface FintMetaObject extends FintMainObject {

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
