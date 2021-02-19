# Parcial 1 

### Autor: Juan Sebastian Ramos Isaza

### Fecha: 19/02/2021

### Despliegue Heroku
[![Heroku](https://www.herokucdn.com/deploy/button.png)](https://parcialarepunofachada.herokuapp.com/)


### Prerequisitos
Para la ejecución de la aplicación de manera local se necesitan los siguientes componentes:
* java 8 o superior
* maven
* git

### Instalacion
1. Se debe clonar el proyecto desde el Shell de su máquina con el comando :
    * git clone https://github.com/jsr25/ParcialArep1Fachada.git
2. Moverse a la carpeta que se acaba de clonar:
    * cd ParcialArep1Fachada
3. Se debe ejecutar un comando de Maven para comprobar el funcionamiento:
    * mvn package

### Ejecucion
* Maquinas con distribuciones de linux:
> java -cp target/classes:target/dependency/* edu.escuelaing.arep.servidorweb.ServidorWeb
* Maquina con windows
>java -cp target/classes;target/dependency/* edu.escuelaing.arep.servidorweb.ServidorWeb

Deben ejecutar esto en directorio del proyecto.

### Uso 
Al abrir la url http://localhost:4567/, se podra visualizar un formulario donde se le pide
llenar el numero al que le quiere hacer la operacion y se le da una sugerencia de las opreaciones disponibles,
al darle enter el sistema mostrar el json.

### Licencia

En este proyecto se usó la licencia GNU - se puede ver [LICENSE.txt](LICENSE.txt) para más detalles.