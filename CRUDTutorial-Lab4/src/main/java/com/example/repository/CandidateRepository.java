package com.example.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.entity.Candidate;

@Repository
public interface CandidateRepository extends CrudRepository<Candidate, Long> {
   List<Candidate> findByName(String name);  
}