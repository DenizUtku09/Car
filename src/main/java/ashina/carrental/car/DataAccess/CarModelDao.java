package ashina.carrental.car.DataAccess;


import ashina.carrental.car.entities.CarModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarModelDao extends JpaRepository<CarModel, Integer> {
}
