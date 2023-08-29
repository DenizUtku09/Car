package ashina.carrental.car.DataAccess;

import ashina.carrental.car.entities.Car;
import ashina.carrental.car.entities.CarBrand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CarBrandDao extends JpaRepository<CarBrand, Integer> {
    Optional<CarBrand> findCarBrandByBrandName(String brandName);
    Optional<CarBrand> findCarBrandById(int id);
}
