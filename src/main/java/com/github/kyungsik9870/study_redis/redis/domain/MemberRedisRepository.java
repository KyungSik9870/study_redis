package com.github.kyungsik9870.study_redis.redis.domain;

import org.springframework.data.repository.CrudRepository;

public interface MemberRedisRepository extends CrudRepository<Member, Long> {
}
