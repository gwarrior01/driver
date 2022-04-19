package tech.reliab.driver.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.reliab.driver.model.File;
import tech.reliab.driver.model.converter.ServiceTypeConverter;
import tech.reliab.driver.model.enums.ServiceType;
import tech.reliab.driver.service.RouteService;
import tech.reliab.driver.web.dto.FileDTO;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "${driver.api.prefix}/v1")
public class DriveController {

    private final RouteService routeService;

    // Подумать об аутентификации
    @GetMapping("/{serviceType}/file")
    public List<FileDTO> getFilesDescription(@PathVariable("serviceType") ServiceType serviceType) {
        List<File> filesDescription = routeService.getFilesDescription(serviceType); // mapping

        return filesDescription.stream()
                .map(f -> new FileDTO(f.getFileName(), f.getSize()))
                .collect(Collectors.toList());
    }

    @InitBinder
    public void initBinder(WebDataBinder dataBinder) {
        dataBinder.registerCustomEditor(ServiceType.class, new ServiceTypeConverter());
    }
}
