package com.dcb.component_prices.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ComponentListingDTO {
    private String name;
    private ComponentType type;
    private String store;
    private Float price;
    private String URL;
}
