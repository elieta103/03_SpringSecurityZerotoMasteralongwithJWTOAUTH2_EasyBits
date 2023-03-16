# 06 Spring Security CORS

- Cross Origin Resource Sharing   CORS
- Error de CORS UI -> Backend
- Http failure response for http://localhost:8080/notices: 0 Unknown Error
- Opcion de solucion  1, Agregar en los controllers
  - @CrossOrigin(origins = "http://localhost:4200")
  - @CrossOrigin(origins = "*")
- Opcion de solucion  2
  - Configuraciones globales

- ResponseEntity<?>.cacheControl(CacheControl.maxAge(60, TimeUnit.SECONDS))
- Es como decirle al browser, dentro de los siguientes 60 seg, no invoques alguna API , reusa cualquier dato cargado con anterioridad.

- Cross Site Request Forgery CSRF
- Spring proovee CRSF, bloquea por default operaciones POST y PUT, que modifiquen datos en la BD
- Spring bloquea ataques de CSRF, con el error 401 que es similar al 403
- Http failure response for http://localhost:8080/contact: 401 OK
- .csrf().disable()   No es un enfoque apropiado para produccion.
- Para prevenir ataques se utiliza el CSRF Token, el cual es unico por session y es un valor random largo.
- Se agrega el filtro que verifica el envio del header CSRF
- Spring genera tambien el cookie CSRF