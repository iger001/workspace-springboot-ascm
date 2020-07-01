# workspace-springboot-ascm
WorksSpace String Tool Suite, proyectos estudiante escuela, eureka server, zuul

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
