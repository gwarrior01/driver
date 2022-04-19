package tech.reliab.driver.model.enums;

public enum ServiceType {
    DROPBOX("dropbox"),
    GOOGLE("google"),
    YANDEX("yandex");

    String serviceName;

    ServiceType(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceName() {
        return serviceName;
    }
}
