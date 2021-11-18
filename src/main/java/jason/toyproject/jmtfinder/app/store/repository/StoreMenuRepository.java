package jason.toyproject.jmtfinder.app.store.repository;

import jason.toyproject.jmtfinder.app.store.entity.StoreMenuEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreMenuRepository extends JpaRepository<StoreMenuEntity, String> {

}
