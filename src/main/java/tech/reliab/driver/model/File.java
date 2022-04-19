package tech.reliab.driver.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class File {
    private String fileName;
    private long size;
}
