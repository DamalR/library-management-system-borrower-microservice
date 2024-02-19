package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Borrower {
    private Long borrowerId;
    private String name;
    private String nic;
    private String address;
    private String contact;
}
