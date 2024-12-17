package com.github.courtandrey.sudrfscraper.configuration.searchrequest.article;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.github.courtandrey.sudrfscraper.configuration.searchrequest.Field;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonAutoDetect
public class MaterialProceedingArticle implements CategorizedArticle {

    private String partOfUPK;
    private String mosgorsudCode;

    public MaterialProceedingArticle() {
    }

    public MaterialProceedingArticle(String partOfUPK, String mosgorsudCode) {
        this.partOfUPK = partOfUPK;
        this.mosgorsudCode = mosgorsudCode;
    }


    @Override
    public Field getField() {
        return Field.MATERIAL_PROCEEDING;
    }

    @Override
    public String getMainPart() {
        return partOfUPK;
    }

    @Override
    public boolean isEmpty() {
        return partOfUPK == null;
    }

    @Override
    public String toString() {
        return "Производство по материалам: " + partOfUPK;
    }
}
