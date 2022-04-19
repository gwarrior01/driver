package tech.reliab.driver.service.impl;

import org.springframework.stereotype.Service;
import tech.reliab.driver.model.File;
import tech.reliab.driver.service.DriveService;

import java.util.Collections;
import java.util.List;

@Service("yandex")
public class YandexService implements DriveService {
    @Override
    public List<File> getFilesDescription() {
        return Collections.emptyList();
    }
}
