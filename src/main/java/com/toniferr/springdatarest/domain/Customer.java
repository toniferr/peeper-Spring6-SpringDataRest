package com.toniferr.springdatarest.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * Created by toniferr.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer {
    private UUID id;
    private String name;
}
