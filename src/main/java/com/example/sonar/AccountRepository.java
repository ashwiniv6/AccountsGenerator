package com.example.sonar;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {

	List<Account> findAll();

	Optional<Account> findById(Long accountId);

}
