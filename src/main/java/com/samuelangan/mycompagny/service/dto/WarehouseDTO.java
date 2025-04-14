package com.samuelangan.mycompagny.service.dto;

import com.samuelangan.mycompagny.domain.Warehouse;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class WarehouseDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String name;
    private String address;

    public WarehouseDTO(Warehouse warehouse) {
        if (warehouse == null) {
            return;
        }
        this.id = warehouse.getId();
        this.name = warehouse.getName();
        this.address = warehouse.getAddress();
    }

    public Warehouse dtoToEntity() {
        return Warehouse.builder().id(this.id).name(this.name).address(this.address).build();
    }
}
