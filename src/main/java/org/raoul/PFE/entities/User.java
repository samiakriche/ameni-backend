/**package org.raoul.PFE.entities;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.util.HashSet;
import java.util.Set;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;



@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name="user")
public class User {
	 @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   private Long id;

	   @Column(nullable = false, unique = true)
	   private String username;

	   @Column(nullable = false)
	   private String password;

	   @ElementCollection(fetch = FetchType.EAGER)
	   @CollectionTable(name = "user_roles",
	           joinColumns = @JoinColumn(name = "user_id"))
	   @Column(name = "role")
	   private Set<String> roles = new HashSet<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<String> getRoles() {
		return roles;
	}

	public void setRoles(Set<String> roles) {
		this.roles = roles;
	}
	   
	
}
**/