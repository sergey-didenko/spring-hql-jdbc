package com.sergey.didenko.spring.hqljdbc;


import com.sergey.didenko.spring.hqljdbc.config.LiquibaseConfiguration;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

//TODO : Run with Liquibase, but also need to add Context, like below
@ContextConfiguration(classes = {LiquibaseConfiguration.class})
//TODO : And specify, what will be load (JPA Repositories, Entity, etc)
//@EntityScan(basePackageClasses = {
//        Subject.class//TODO : just for example
//})
//@EnableJpaRepositories(basePackageClasses = {
//        SubjectRepository.class//TODO : just for example
//})
//TODO : Or use AutoConfiguration
@EnableAutoConfiguration
//TODO : Load DataSource, and JPA repositories (if @ContextConfiguration not specify)
@DataJpaTest
@ExtendWith(SpringExtension.class)
public class LiquibaseTest {

    @org.junit.jupiter.api.Test
    public void liquibaseTest_check01() {
    }

}
