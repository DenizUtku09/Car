package DataAccess;


import entities.TransmissionType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransmissionTypeDao extends JpaRepository<TransmissionType, Integer> {
}
