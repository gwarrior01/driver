package tech.reliab.driver.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FileDTO {
    private String fileName;
    private long size;
}
