# workspace-springboot-ascm

# 24 JUNIO 2020

## WorksSpace String Tool Suite, proyectos estudiante escuela, eureka server, zuul

EJEMPLO PRACTICO – registro eureka

Se tienen 2 microservicios

    springboot-servicio-estudiante

      getEstudiantes

      getEstudiante/{id}
.

    springboot-servicio-escuela

      echoEscuela

      listarEstudiantes

      detalleEstudiante/{id}
    
Estos microservicios, son registrados en Eureka, para su descubrimiento de forma automática.

![alt text](https://github.com/iger001/workspace-springboot-ascm/raw/master/extras/servidorEureka_ej1.JPG)

EJEMPLO PRACTICO – integración api Gateway zuul

Microservicios

servicio-estudiantes

servicio-escuelas

![alt text](https://github.com/iger001/workspace-springboot-ascm/raw/master/extras/eurekaZuulSpringConfigServer_ej2.JPG)

Se habilitan los microservicios, en el API Gateway Zuul y en este ejemplo para poder ser llamados por un mismo puerto (puerto 80):

      service id :  servicio-estudiantes

      path : /api/estudiantes/**

.

      service id : servicio-escuelas

      path : /api/escuela/**


# 01 JULIO 2020

## Puerto dinámico : Hystrix : zuul filter
 
Escalando servicio con puerto dinamico
 
Con esta configuración en el archivo application.properties, al levantar el servicio este tomara un puerto de forma automático (un puerto disponible).

![alt text](https://github.com/iger001/workspace-springboot-ascm/raw/master/extras/puertoDinamico1.JPG)

Con esta configuración cada vez que se levante una instancia del servicio este se colocará en un puerto distinto.

Nota: Lo recomendable es agregar un id, único de cada instancia, para que sea registrada en Eureka

    p.e. 
      eureka.instance.instance-id=${spring.application.name}:${spring.application.instance_id:${random.value}}

## ¿Qué HYSTRIX?

Hystrix es una biblioteca de latencia y tolerancia a fallas diseñada para aislar puntos de acceso a sistemas remotos, servicios y bibliotecas de terceros, detener la falla en cascada y permitir la resistencia en sistemas distribuidos complejos donde la falla es inevitable, Hystrix implementa el patrón de diseño “circuit-breaker”.

![alt text](https://github.com/iger001/workspace-springboot-ascm/raw/master/extras/circuitBreaker.JPG)

A continuación se muestra el diagrama de secuencia de los estados: open y half-open:

![alt text](https://github.com/iger001/workspace-springboot-ascm/raw/master/extras/open_halfOpen.JPG)

EJEMPLO PRACTICO – hystrix (fallbackMethod – por timeout)

![alt text](https://github.com/iger001/workspace-springboot-ascm/raw/master/extras/falback_method.JPG)

Configuración hytrix.

![alt text](https://github.com/iger001/workspace-springboot-ascm/raw/master/extras/configuracionHystrix.JPG)


## ¿Dónde encaja Zuul en el ecosistema de microservicios?

Un problema común, al construir microservicios, es proporcionar una puerta de enlace única a las aplicaciones cliente de su sistema. El hecho de que sus servicios se dividan en pequeñas aplicaciones de microservicios que no deberían ser visibles para los usuarios, de lo contrario, puede resultar en esfuerzos sustanciales de desarrollo / mantenimiento. También hay escenarios en los que el tráfico de la red del ecosistema completo puede pasar por un punto único que podría afectar el rendimiento del clúster.

Para resolver este problema, Netflix (uno de los principales adoptantes de microservicios) creó y de código abierto su servidor proxy Zuul y más tarde Spring lo adaptó en su pila de nube de Spring y nos permitió usar zuul de manera fácil y efectiva con solo unos simples pasos.

Zuul es un servicio perimetral que envía solicitudes a múltiples servicios de respaldo. Proporciona una "puerta de entrada" unificada a su ecosistema, que permite que cualquier navegador, aplicación móvil u otra interfaz de usuario consuma servicios de múltiples hosts. Puede integrar Zuul con otros componentes de la pila de Netflix como Hystrix para tolerancia a fallas y Eureka para descubrimiento de servicio o usarlo para administrar reglas de enrutamiento, filtros y equilibrio de carga en su sistema. Lo más importante es que todos esos componentes están bien adaptados por Spring Framework a través del enfoque Spring Boot / Cloud.

![alt text](https://github.com/iger001/workspace-springboot-ascm/raw/master/extras/zuulGateway.JPG)

Zuul components

Zuul tiene principalmente cuatro tipos de filtros que nos permiten interceptar el tráfico en diferentes líneas de tiempo del procesamiento de la solicitud para cualquier transacción en particular. Podemos agregar cualquier cantidad de filtros para un patrón de URL particular.

        pre filters: se invocan antes de enrutar la solicitud.
        post filters: se invocan después de que se ha enrutado la solicitud.
        route filters: se utilizan para enrutar la solicitud.
        error filters: se invocan cuando se produce un error al manejar la solicitud.

![alt text](https://github.com/iger001/workspace-springboot-ascm/raw/master/extras/zuulGatewayFilters.JPG)


# 15 JULIO 2020
