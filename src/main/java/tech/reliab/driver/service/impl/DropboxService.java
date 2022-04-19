package tech.reliab.driver.service.impl;

import org.springframework.stereotype.Service;
import tech.reliab.driver.model.File;
import tech.reliab.driver.service.DriveService;

import java.util.Arrays;
import java.util.List;

@Service("dropbox")
public class DropboxService implements DriveService {

    @Override
    public List<File> getFilesDescription() {
        return Arrays.asList(
                new File("test.docx", 1024L),
                new File("test2.docx", 2048L)
        );
    }
}
