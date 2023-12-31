package com.torontoOrg.contrack.dto.request;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateContractItemRequest {
        private int itemId;
        private String item;
        private String description;
        private String location;
        private String trackingUnit;
        private Double dayTotal;
}
