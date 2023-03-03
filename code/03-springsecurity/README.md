# 03 Spring Security

- Define Users, Security using InMemoryUserDetailsManager,JdbcUserDetailsManager & UserDetailsService
- Configuracion de usuarios en memoria : InMemoryUserDetailsManager
- Configuracion de usuarios en BD : Implementacion de JdbcUserDetailsManager, requiere tablas : users y authorities
- Configuracion personalizada : Se agrega tabla customer, y servicio : EazyBankUserDetails implements UserDetailsService
- Password en texto plano : "noop" which uses plain text NoOpPasswordEncoder
- scripts.sql contiene configuraciones de tablas