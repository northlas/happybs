package com.example.happybs.service.implementation;

import com.example.happybs.exception.ApiRequestException;
import com.example.happybs.model.Detail;
import com.example.happybs.repo.DetailRepository;
import com.example.happybs.service.DetailService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@Slf4j
@RequiredArgsConstructor
public class DetailServiceImpl implements DetailService {
    private final DetailRepository detailRepository;

    @Override
    public Detail get(Long id) {
        log.info("Fetching detail with id: {}", id);
        return detailRepository.findById(id).orElseThrow(() -> {
            return new ApiRequestException("Detail not found");
        });
    }

    @Override
    public Detail save(Detail detail) {
        log.info("Saving new detail with id: {}", detail.getId());
        return detailRepository.save(detail);
    }
}
