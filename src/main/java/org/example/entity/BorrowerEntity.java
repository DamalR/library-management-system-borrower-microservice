package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.repository.cdi.Eager;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class BorrowerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long borrowerId;
    private String name;
    private String nic;
    private String address;
    private String contact;
}
