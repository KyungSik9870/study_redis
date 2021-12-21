package com.github.kyungsik9870.study_redis.redis.service;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RedisService {
	private final RedisTemplate redisTemplate;

	public void setValues(String key, String value) {
		ValueOperations<String, String> values = redisTemplate.opsForValue();
		values.set(key, value);
	}

	public String getValues(String key) {
		ValueOperations<String, String> values = redisTemplate.opsForValue();
		return values.get(key);
	}
}
