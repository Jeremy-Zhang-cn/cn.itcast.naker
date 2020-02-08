package com.itheima.config;

import org.springframework.context.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
@ComponentScan("com.itheima")
@Import(DataSourceConfig.class)
public class SpringConfig {

	@Bean("jdbcTemplate")
	public JdbcTemplate getJdbcTemplate(DataSource dataSource) {

		JdbcTemplate template = new JdbcTemplate();
		template.setDataSource(dataSource);
		return template;
	}

}
