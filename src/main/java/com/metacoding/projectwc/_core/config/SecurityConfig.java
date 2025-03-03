package com.metacoding.projectwc._core.config;

import com.metacoding.projectwc.loginlog.LoginLogService;
import com.metacoding.projectwc.user.User;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@RequiredArgsConstructor
@Configuration
public class SecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    private final LoginLogService loginLogService;

    @Bean
    public SecurityFilterChain configure(HttpSecurity http) throws Exception {
        http.headers(httpSecurityHeadersConfigurer ->
                        httpSecurityHeadersConfigurer.frameOptions(frameOptionsConfig ->
                                frameOptionsConfig.sameOrigin()))
                .csrf(c -> c.disable())
                .authorizeHttpRequests(r ->
                        r.requestMatchers("/s/**")
                                .authenticated()
                                .anyRequest()
                                .permitAll())
                .formLogin(f ->
                        f.loginPage("/login-form")
                                .loginProcessingUrl("/login")
                                //.defaultSuccessUrl("/")
                                .successHandler((request, response, authentication) -> {
                                    User user = (User) authentication.getPrincipal();
                                    HttpSession session = request.getSession();

                                    session.setAttribute("sessionUser", user);

                                    String userAgent = request.getHeader("User-Agent");
                                    loginLogService.save(user, userAgent);

                                    response.sendRedirect("/main");
                                }))
                .logout(l ->
                        l.logoutUrl("/logout")
                                .logoutSuccessUrl("/main")
                                .invalidateHttpSession(true)
                                .deleteCookies("JSESSIONID")
                );

//        http.authorizeHttpRequests(r ->
//                        r.requestMatchers("/s/**").hasAnyRole("USER", "ADMIN")
//                                .requestMatchers("/admin/**").hasAnyRole("ADMIN")
//                                .anyRequest().permitAll())
//                .formLogin(f ->
//                        f.loginPage("/login-form")
//                                .loginProcessingUrl("/login")
//                                .defaultSuccessUrl("/"));

        return http.build();
    }
}