package com.github.kyungsik9870.study_redis.redis.domain;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import lombok.Getter;

@Getter
@RedisHash(value = "member", timeToLive = 30)
public class Member {
	@Id
	private Long id;
	private String name;
	private LocalDateTime createdAt;

	public Member(String name) {
		this.name = name;
		this.createdAt = LocalDateTime.now();
	}
}
