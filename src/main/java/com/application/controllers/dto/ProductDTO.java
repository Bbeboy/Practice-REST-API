package com.application.controllers.dto;

import com.application.entities.Maker;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductDTO {

    private long id;

    private String name;

    private BigDecimal price;

    private Maker maker;
}
