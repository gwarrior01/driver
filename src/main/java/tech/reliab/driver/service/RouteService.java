package tech.reliab.driver.service;

import tech.reliab.driver.model.File;
import tech.reliab.driver.model.enums.ServiceType;

import java.util.List;

public interface RouteService {

    List<File> getFilesDescription(ServiceType serviceType);
}
