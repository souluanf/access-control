package dev.luanfernandes.access.repository;

import dev.luanfernandes.access.model.Workday;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkdayRepository extends JpaRepository<Workday, Long> {
}
