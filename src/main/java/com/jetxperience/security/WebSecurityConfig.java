package com.jetxperience.security;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import com.jetxperience.jwt.JWTAuthenticationFilter;

/**
 * @author Samson Effes
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

    private static final String[] SECURED_URLs = {
    		"/api/v1/**",
    		//"/usuarios/**",

    };

    private static final String[] UN_SECURED_URLs = {
    		"/login/**",
    		"/users/**",
    		"/allergens",
    		"/allergens/**",
    		"/answers",
    		"/answers/**",
    		"/categories",
    		"/categories/**",
    		"/complaints",
    		"/complaints/**",
    		"/dishes",
    		"/dishes/**",
    		"/dishes_ingredients",
    		"/dishes_ingredients/**",
    		"/dishes_orders",
    		"dishesorders",
    		"/dishes_orders/**",
    		"/hours",
    		"/hours/**",
    		"/ingredients",
    		"/ingredients/**",
    		"/orders",
    		"/orders/**",
    		"/rewards",
    		"/rewards/**",
    		"/roles",
    		"/roles/**",
    		"/users_allergens",
    		"/users_allergens/**",
    		"/users_dishes",
    		"/users_dishes/**",
    		"/users_ingredients",
    		"/users_ingredients/**",
    		"/users_rewards",
    		"/users_rewards/**"
    		
    };

    @Autowired
    private JWTAuthenticationFilter authenticationFilter;

    @Autowired
    private WebUserDetailsService userDetailsService;



    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationProvider authenticationProvider(){
        var authenticationProvider = new DaoAuthenticationProvider();
        authenticationProvider.setUserDetailsService(userDetailsService);
        authenticationProvider.setPasswordEncoder(passwordEncoder());
       return authenticationProvider;
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http.csrf().disable()
                .authorizeHttpRequests()
                .requestMatchers(UN_SECURED_URLs).permitAll().and()
                .authorizeHttpRequests().requestMatchers(SECURED_URLs)
                .hasAnyAuthority("Administrador", "Usuario") // Permitir tanto "Administrador" como "Usuario"
                .anyRequest().authenticated()
                .and().sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .authenticationProvider(authenticationProvider())
                .addFilterBefore(authenticationFilter, UsernamePasswordAuthenticationFilter.class)
                .build();
    }

    
    
    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authConfig) throws Exception {
        return authConfig.getAuthenticationManager();
    }

}