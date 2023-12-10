package com.example.clientservice.DTOs;


import com.example.clientservice.model.Product;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class ClientRequestDTO {
    private String name;

    private String city;

    private Integer idProduct;

    @Transient
    private Product product;

}
