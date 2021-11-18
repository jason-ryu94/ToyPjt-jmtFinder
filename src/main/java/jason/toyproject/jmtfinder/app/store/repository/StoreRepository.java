package jason.toyproject.jmtfinder.app.store.repository;

import jason.toyproject.jmtfinder.app.store.entity.StoreEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreRepository extends JpaRepository<StoreEntity, String> {

}
