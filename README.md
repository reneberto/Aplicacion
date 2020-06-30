# Aplicación Generación de Documentos
Diseño aplicación creación de Documentos 

## Arquitectura Propuesta

![alt text](https://github.com/reneberto/Aplicacion/blob/master/Diagrama%20en%20blanco.svg)

Se utilizará un servidor en la nube en este caso se propone un linode Caracteristicas:
1 CPU, 50GB Storage, 2GB RAM
Los datos serán almacenados en una base de datos mariaDb(relacional) , se creará el modelo de datos segun necesidad , estos datos son almacenados en un volumen persistente , el acceso a datos se realizará mediante servicios Api Rest utilizando JSON desarrollados con Java Spring boot , el consumo de estos servicios se realizará en un frontend (aplicación web) la cual se encontrará dispobible desde cualquier dispositivo con acceso a Internet.
```
Toda la arquitectura sobre contenedores Docker para una escalabilidad limpia y facil migración en caso de ser necesario
```

Mas información en: 
https://www.linode.com
https://mariadb.org/
https://www.docker.com/
https://spring.io/projects/spring-boot






### Prerequisites

What things you need to install the software and how to install them

```
Give examples
```

### Installing

A step by step series of examples that tell you how to get a development env running

Say what the step will be

```
Give the example
```

And repeat

```
until finished
```

End with an example of getting some data out of the system or using it for a little demo

## Running the tests

Explain how to run the automated tests for this system

### Break down into end to end tests

Explain what these tests test and why

```
Give an example
```

### And coding style tests

Explain what these tests test and why

```
Give an example
```

## Deployment

Add additional notes about how to deploy this on a live system

## Built With

* [Dropwizard](http://www.dropwizard.io/1.0.2/docs/) - The web framework used
* [Maven](https://maven.apache.org/) - Dependency Management
* [ROME](https://rometools.github.io/rome/) - Used to generate RSS Feeds

## Contributing

Please read [CONTRIBUTING.md](https://gist.github.com/PurpleBooth/b24679402957c63ec426) for details on our code of conduct, and the process for submitting pull requests to us.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/your/project/tags). 

## Authors

* **Billie Thompson** - *Initial work* - [PurpleBooth](https://github.com/PurpleBooth)

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Hat tip to anyone whose code was used
* Inspiration
* etc



