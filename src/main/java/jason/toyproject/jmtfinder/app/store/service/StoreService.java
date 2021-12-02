package jason.toyproject.jmtfinder.app.store.service;


import jason.toyproject.jmtfinder.app.store.entity.StoreEntity;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@Slf4j
@RequiredArgsConstructor
public class StoreService {

    private StoreEntity storeEntity;


}
