package com.debuggeandoideas.app_security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping(path = "/welcome")
public class WelcomeController {
    @GetMapping
    public Map<String, String> welcome() {
        return Collections.singletonMap("msj", "welcome");
    }
}
/*NOTACIONES QUE SE UTILIZAN PARA CONTRUIR SERVICIOS WEB RESTFUL
*
* @RestController: combina @Controller y @ResponseBody. indica que la clase es un controlador web y que las respuestas
* de los métodos se enviaran directamente en el cuerpo de la respueta (JSON o XML) HTTP en lugar de renderizar una vista HTML
*
* @RequestMapping: Mapea solicitudes HTTP a clases o métodos controladores específicos. Define la ruta URL base o los
* métodos HTTP permitidos (GET, POST, etc) para toda la clase o para un método en particular.
*
* @GetMapping: Es un acceso directo especializado para @RequestMapping(method = RequestMethod.GET). Se utiliza a nivel
* de método para mapear solicitudes HTTP GET  a un endpoint especifico.
*
* */