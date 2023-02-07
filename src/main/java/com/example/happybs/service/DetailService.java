package com.example.happybs.service;

import com.example.happybs.model.Detail;
public interface DetailService {
    Detail get(Long id);
    Detail save(Detail detail);
}
