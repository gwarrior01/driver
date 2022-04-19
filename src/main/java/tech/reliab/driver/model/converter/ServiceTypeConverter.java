package tech.reliab.driver.model.converter;

import tech.reliab.driver.model.enums.ServiceType;

import java.beans.PropertyEditorSupport;

public class ServiceTypeConverter extends PropertyEditorSupport {

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        String capitalized = text.toUpperCase();
        ServiceType currency = ServiceType.valueOf(capitalized);
        super.setValue(currency);
    }
}