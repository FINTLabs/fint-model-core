package no.fint.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public interface FintObject extends Serializable {

    /**
     * Provides a list of relations to other {@code FintMainObject}s.
     * <p>
     * By default, this method returns an empty list, as not all objects may have relations.
     * Most use cases will involve {@code FintMetaObject}s, as they contain the metadata required.
     * There are some use cases where a {@code FintComplexDatatypeObject} may have relations.
     * @return a list of {@link FintRelation} objects representing the relationships this object
     * has with other resource objects. Returns an empty list by default.
     */
    default List<FintRelation> getRelations() {
        return new ArrayList<>();
    }

}
