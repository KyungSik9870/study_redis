package com.github.kyungsik9870.study_redis.redis.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MemberRedisRepositoryTest {

	@Autowired
	private MemberRedisRepository memberRedisRepository;

	@Test
	void test() {
		Member member = new Member("Kyungsik");
		memberRedisRepository.save(member);
		memberRedisRepository.findById(member.getId());
		memberRedisRepository.count();
		memberRedisRepository.delete(member);
	}
}