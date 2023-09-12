package repository;

import model.Sayings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SayingsRepository extends JpaRepository<Sayings,Long> {

}
