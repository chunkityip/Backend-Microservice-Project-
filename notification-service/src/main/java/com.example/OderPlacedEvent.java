package com.example;

//For Encapsulation and Cohesion , I need to create another OderPlacedEvent class

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OderPlacedEvent {
    private String orderNumber;
}
