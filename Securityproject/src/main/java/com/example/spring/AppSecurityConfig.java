package com.example.spring;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class AppSecurityConfig {
	
	@Bean
	public PasswordEncoder getEncoder()
	{
		return new BCryptPasswordEncoder(10);
	}

	@Bean
	public InMemoryUserDetailsManager userDetailsManager() throws Exception
	{
		UserDetails user=User.withUsername("admin")
				.password(this.getEncoder().encode("admin"))
				.roles("ADMIN")
				.build();
		
		UserDetails user1=User.withUsername("user")
				.password(this.getEncoder().encode("cdac"))
				.roles("NORMAL")
				.build();
		
		List<UserDetails> list=List.of(user,user1);
		
		return new InMemoryUserDetailsManager(list);
	}
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception
	{
		http.authorizeHttpRequests((authz)-> authz
				.requestMatchers("/admin").hasRole("ADMIN")
				.requestMatchers("/user").hasAnyRole("NORMAL","ADMIN")
				.anyRequest().authenticated())
		.formLogin(form->form.loginPage("/login")
				.loginProcessingUrl("/hello")// call API for authenticate the user
			      .defaultSuccessUrl("/hello").permitAll())
		.logout(logout->logout.permitAll())
		
		
		
		.httpBasic();
		
		return http.build();
	}
	
}
