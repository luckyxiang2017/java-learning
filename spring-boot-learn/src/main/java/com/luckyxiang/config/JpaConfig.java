package com.luckyxiang.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.luckyxiang.dao.repository")
@EntityScan("com.luckyxiang.dao.model")
//@Configuration
public class JpaConfig {
}
