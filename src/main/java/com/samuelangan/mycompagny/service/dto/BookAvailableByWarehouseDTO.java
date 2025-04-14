package com.samuelangan.mycompagny.service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class BookAvailableByWarehouseDTO {

    private String book;
    private String warehouse;
    private Integer nbBookAvailable;
}
