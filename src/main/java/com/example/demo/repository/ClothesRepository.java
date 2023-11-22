package com.example.demo.repository;

import com.example.demo.models.Clothes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Репозиторий для работы с предметами одежды
 */
@Repository
public interface ClothesRepository extends JpaRepository<Clothes, Integer> {

    // Находит все записи, имя которых содержит заданную подстроку.
    List<Clothes> findByNameContains(String name);

}
