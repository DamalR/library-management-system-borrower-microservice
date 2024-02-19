package org.example.repository;

import org.example.entity.BorrowerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface BorrowerRepository extends JpaRepository<BorrowerEntity,Long> {
}
