package no.fint.model;

import no.fint.model.felles.kompleksedatatyper.Identifikator;

import java.util.Map;

public interface FintMainObject extends FintObject {

    Map<String, Identifikator> getIdentifikators();

}
