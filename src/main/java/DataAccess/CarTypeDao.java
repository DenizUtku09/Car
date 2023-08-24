package DataAccess;


import entities.CarType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarTypeDao extends JpaRepository<CarType, Integer> {
}
