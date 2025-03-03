/**
 * 
 */
package com.easemywork.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.easemywork.pojos.Location;

/**
 * @author PrajwalW
 *
 */
@Repository
public interface ILocation extends JpaRepository<Location, Long> {

}
