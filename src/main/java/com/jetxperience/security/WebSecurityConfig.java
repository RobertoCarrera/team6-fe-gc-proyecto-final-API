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
    		"/alergenos/**",
    		"/respuestas/**",
    		"/categorias/**",
    		"/reclamaciones/**",
    		"/platos_ingredientes/**",
    		"/platos_pedidos/**",
    		"/horas/**",
    		"/horas_pedidos/**",
    		"/ingredientes/**",
    		"/pedidos/**",
    		"/premios/**",
    		"/roles/**",
    		"/usuarios_alergenos/**",
    		"/usuarios_platos/**",
    		"/usuarios_ingredientes/**",
    		"/usuarios_premios/**"

    };

    private static final String[] UN_SECURED_URLs = {
    		"/login/**",
    		"/platos/**",
    		"/usuarios/**"
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
                .hasAuthority("Administrador").anyRequest().authenticated()
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