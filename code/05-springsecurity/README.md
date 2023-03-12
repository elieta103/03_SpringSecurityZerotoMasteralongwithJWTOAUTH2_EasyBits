# 05 Spring Security

- Implementar un Authentication Provider, personalizado dentro de la aplicacion.
- Se define la class : EazyBankUsernamePwdAuthenticationProvider
- Con la logica necesaria para la autenticación
- De la version anterior se utilizaba el objeto EazyBankUserDetails que internamente usa DaoAuthenticationProvider (DaoAuthenticationProvider is an AuthenticationProvider implementation that uses a UserDetailsService and PasswordEncoder to authenticate a username and password).
- Por esa razon podemos eliminar EazyBankUserDetails
- Implementar un authentication provider es mas que suficiente para acomodar la logica de authenticacion
- Probar al app ingresando a :
  - http://localhost:8080/contact y http://localhost:8080/myAccount (mailhash@gmail.com, 12345)
  - Es el user-password de la tabla customer que tenga el Hash.