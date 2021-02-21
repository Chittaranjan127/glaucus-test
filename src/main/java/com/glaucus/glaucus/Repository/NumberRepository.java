package com.glaucus.glaucus.Repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.glaucus.glaucus.DTO.NumberDTO;

@Repository
public interface NumberRepository extends JpaRepository<NumberDTO, Integer> {

	@Transactional
	@Modifying
	@Query("UPDATE NumberDTO SET counter = (counter + 1) WHERE name = 'abc'")
	public void UpdateNumberField();
	
	@Transactional
	@Modifying
	@Query("UPDATE NumberDTO SET counter = ?1 WHERE name = 'abc'")
	public void UpdateNumberFieldCount(int count);
}
