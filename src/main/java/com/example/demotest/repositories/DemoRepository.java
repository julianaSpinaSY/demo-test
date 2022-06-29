package com.example.demotest.repositories;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class DemoRepository {
    public void saveValue(Integer value) {
        log.info("Salvou no banco o valor " + value);
    }
}
