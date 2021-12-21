package com.github.kyungsik9870.study_redis.redis.controller;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.kyungsik9870.study_redis.redis.service.RedisService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("redis")
public class RedisController {

	private final RedisService redisService;

	@PostMapping("")
	public void setRedis(@RequestBody HashMap<String, String> body) {
		redisService.setValues(body.get("key"), body.get("value"));
	}
}
