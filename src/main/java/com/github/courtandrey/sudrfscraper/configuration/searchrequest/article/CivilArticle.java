package com.github.courtandrey.sudrfscraper.configuration.searchrequest.article;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.github.courtandrey.sudrfscraper.configuration.searchrequest.Field;
import com.github.courtandrey.sudrfscraper.configuration.searchrequest.Instance;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@JsonAutoDetect
public class CivilArticle implements CategorizedArticle {
    private String partOfCas;
    private String mosgorsudCode;

    @JsonIgnore
    private final static Instance[] INSTANCES = {Instance.FIRST, Instance.APPELLATION};

    @Override
    public Field getField() {
        return Field.CIVIL;
    }

    @Override
    public String getMainPart() {
        return partOfCas;
    }

    @Override
    public boolean isEmpty() {
        return partOfCas == null && mosgorsudCode == null;
    }

    @Override
    public Instance[] getInstances() {
        return INSTANCES;
    }

    @Override
    public String toString() {
        return "Гражданское производство: " + partOfCas;
    }
}
