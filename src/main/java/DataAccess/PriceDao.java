package DataAccess;

import entities.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PriceDao extends JpaRepository<Price, Integer> {
    Optional<Price> findPriceByPrice(int price);

}
