package jason.toyproject.jmtfinder.app.store.service;


import jason.toyproject.jmtfinder.app.store.entity.StoreEntity;
import jason.toyproject.jmtfinder.app.store.repository.StoreRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@Slf4j
@RequiredArgsConstructor
public class StoreService {

    private final StoreEntity storeEntity;
    private final StoreRepository storeRepository;

    public Optional<StoreEntity> retrieveStore(String storeId) {
        return storeRepository.findById(storeId);
    }


}
