package com.programmingtechie.productservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
// why separate class for response why not use Product in model
// because it is good practice to keep model entities and DTOs separate
//Ideally model entities should not exposed to the outside world
public class ProductResponse {
    private String id;
    private String name;
    private String description;
    private BigDecimal price;
}
