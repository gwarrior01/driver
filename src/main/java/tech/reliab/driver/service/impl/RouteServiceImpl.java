package tech.reliab.driver.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tech.reliab.driver.model.File;
import tech.reliab.driver.model.enums.ServiceType;
import tech.reliab.driver.service.DriveService;
import tech.reliab.driver.service.RouteService;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class RouteServiceImpl implements RouteService {

    private final Map<String, DriveService> driveServices;

    @Override
    public List<File> getFilesDescription(ServiceType serviceType) {
        DriveService driveService = driveServices.get(serviceType.getServiceName());
        return driveService.getFilesDescription();
    }
}
