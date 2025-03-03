package com.easemywork.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.easemywork.pojos.Role;
import com.easemywork.pojos.Users;

@Repository
public interface IUsers extends JpaRepository<Users, Long> {
	@Query(nativeQuery = true, value = ("select u.user_id,u.first_name,u.last_name,b.status from users u "
			+ "inner join bookings b on(u.user_id=b.user_user_id) where b.status=?1"))
	List<Object[]> getByBookStatus(String status);

	@Query(nativeQuery = true, value = "select u.user_id,u.first_name,u.last_name,u.created_date,"
			+ "u.email,l.city,l.state from users u inner join location l on(u.user_id=l.users_user_id) where u.user_id=?1")
	List<Object[]> getDetailsByid(Long id);

	Users findByEmailAndPassword(String email, String pass);

	Users findByEmail(String email);
	@Query(nativeQuery = true, value = "select u.user_id,u.first_name,u.last_name,"
			+ "u.email,u.created_date,l.city,l.state from users u "
			+ "join location l on(u.loc_id=l.loc_id)")
	List<Object[]> getUsers();
	
	Optional<Users> findByRole(Role role);

}
