package ashina.carrental.car.DataAccess;

import ashina.carrental.car.entities.CarBrand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarBrandDao extends JpaRepository<CarBrand, Integer> {
}
