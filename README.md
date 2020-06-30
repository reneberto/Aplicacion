# Aplicación Generación de Documentos Megaservi
Diseño aplicación creación de Documentos 

## Arquitectura Propuesta

![alt text](https://github.com/reneberto/Aplicacion/blob/master/Diagrama%20en%20blanco.svg)

Se utilizará un servidor en la nube en este caso se propone un linode Caracteristicas:
 1 CPU, 50GB Storage, 2GB RAM
* Los datos serán almacenados en una base de datos mariaDb(relacional) , se creará el modelo de datos segun necesidad , estos datos son almacenados en un volumen persistente.
* El acceso a datos se realizará mediante servicios Api Rest utilizando JSON desarrollados con Java Spring boot , el consumo de estos servicios se realizará en un frontend (aplicación web) la cual se encontrará dispobible desde cualquier dispositivo con acceso a Internet.
```
Toda la arquitectura sobre contenedores Docker para una escalabilidad limpia y facil migración en caso de ser necesario
```

Mas información en: 
* https://www.linode.com
* https://mariadb.org/
* https://www.docker.com/
* https://spring.io/projects/spring-boot

## Diagrama Uso Aplicación (versión inicial)

![alt text](https://github.com/reneberto/Aplicacion/blob/master/Diagramaflujo.png)

* Aplicación con control de credenciales , no se contempla administración de usuarios en caso de ser necesario se puede agregar.
* Aplicación permite listar, almacenar y modificar datos de clientes existentes 
* Aplicación realiza la descarga de documentos , la creación y envío automatico a través de correo electronico

## Tiempos de Proyecto (Spring de 8 días)




