/*
Copyright 2019 Sergey Didenko <sergey.didenko.dev@gmail.com>

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

		http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package com.sergey.didenko.spring.hqljdbc.repository;

import com.sergey.didenko.spring.hqljdbc.config.LiquibaseConfiguration;
import com.sergey.didenko.spring.hqljdbc.domain.Subject;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.transaction.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

@EntityScan(basePackageClasses = {
        Subject.class
})
@EnableJpaRepositories(basePackageClasses = {
        SubjectRepository.class
})
//TODO : Run with Liquibase, but also need to add Context, like above
@ContextConfiguration(classes = {LiquibaseConfiguration.class})
@ExtendWith(SpringExtension.class)
@DataJpaTest
@Transactional
@Rollback
public class SubjectRepositoryTest {

    @Autowired
    private SubjectRepository subjectRepository;

    @org.junit.jupiter.api.Test
    public void subjectRepository_check01() {
        assertThat(subjectRepository).isNotNull();
    }
}
