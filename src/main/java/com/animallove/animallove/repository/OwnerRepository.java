package com.animallove.animallove.repository;

import com.animallove.animallove.entity.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OwnerRepository extends JpaRepository<Owner,Long> {
    public List<Owner> findByFirstName(String first_name);
}
