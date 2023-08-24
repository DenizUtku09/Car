package DataAccess;

import entities.FuelType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuelTypeDao extends JpaRepository<FuelType, Integer> {
}
