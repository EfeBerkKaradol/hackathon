package com.innova.masraftakip.repository;

import com.innova.masraftakip.model.Kisi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KisiRepository extends JpaRepository<Kisi, Long> {
}
