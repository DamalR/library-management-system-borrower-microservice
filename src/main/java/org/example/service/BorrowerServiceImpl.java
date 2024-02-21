package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.dto.Borrower;
import org.example.entity.BorrowerEntity;
import org.example.repository.BorrowerRepository;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class BorrowerServiceImpl implements BorrowerService {
    final BorrowerRepository repository;
    ModelMapper mapper;

    @Bean
    public void setup(){
        this.mapper = new ModelMapper();
    }

    @Override
    public void addBorrower(Borrower borrower) {
        BorrowerEntity entity = mapper.map(borrower, BorrowerEntity.class);
        repository.save(entity);
    }

    @Override
    public List<BorrowerEntity> getBorrowers() {
        return (List<BorrowerEntity>) repository.findAll();
    }

    @Override
    public Boolean deleteBorrower(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Borrower getBorrowerById(Long id) {
        Optional<BorrowerEntity> byId = repository.findById(id);
        return mapper.map(byId, Borrower.class);
    }
}
