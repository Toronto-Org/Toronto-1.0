package com.torontoOrg.contrack.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContractItemDTO {

    private int id;
    private int itemId;
    private String item;
    private String description;
    private String location;
    private String trackingUnit;
    private Double dayTotal;
    private Double totalToDate;
    private String updatedDate;

}
