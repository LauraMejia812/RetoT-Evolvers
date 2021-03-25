
---------------------------------------------------------RETO T-EVOLVERS------------------------------------------------------------------------------

Se realizará la prueba asignada por la empresa T-Evolvers, a través del IDE Intellij IDEA implementando el gestor de proyectos Gradle, a continuación, se
mencionará cada una de las herramientas implementadas para lograr el objetivo:

Se utilizará como patrón de diseño screenplay porque fomenta buenas prácticas para la escritura de pruebas y además permite dividir por pequeñas secciones el código y con esto tener un ambiente más controlado para la escritura de pruebas, cabe resaltar que al utilizar esta estrategia se mejora la mantenibilidad del código;

Se utilizará la herramienta de cucumber como intérprete de lenguaje Gherkin(de negocio) a lenguaje java (Código)

Serenity: Herramienta que nos proporcionará los reportes de los resultadosde las pruebas Java como lenguaje de programación base para la escritura del código

Navegador en el que se realizó la automatización: Google Chrome;

Se aplico Solid como conjunto de principios y buenas practicas que ayudan al desarrollo de las aplicaciones, se aplican con la finalidad de hacer el código más limpio, mantenible y escalable al futuro 
	Single Responsability = ‘cada clase y método hace una única función’,
	Open / Close = ‘abierto a extensiones y usos y cerrado a modificaciones’,
	Liskov Sustitution = ‘herencia, una clase hijo se debe comportar como padre’,
	Interface Segregation = ‘implementar un solo método por interfaz’,
	Dependency Inversion / Inyection = ‘recibir objetos ya creados en una tarea, no poner new dentro de la tarea’

¿Cómo aplicamos Solid en el reto?: 
En el patrón de diseño implementado (Screenplay) evidenciamos los principios solid de la siguiente manera:

	ºSingle Responsability: Gracias a la estructura que el patrón nos ofrece se puede evidenciar que cada una de las carpetas y clases están definidas para cumplir 	una única funcionalidad teniendo como beneficio un código más limpio, la mantenibilidad de este y la escabilidad a futuro
	ºOpen/Close: Podemos evidenciarlo en las clases creadas para Tasks y Questions, cuando se implementa la clase Task y Questions aplicamos el principio por que 	estas clases están abiertas a extenderse, pero cerrada a la modificación por lo que podemos hacer uso de los métodos de estas
	ºLiskov sustitution: Se evidencia también en las clases mencionadas anteriormente, gracias a las clases implementadas para crear las Task o Questions podemos 	aplicar el principio sobrescribiendo uno de los métodos implementados y a la hora de llamar la clase en el step va a saber diferenciar el método con su lógica.

Comandos para ejecutar Runner específico por consola: gradlew clean -Dtest.single = "indicar nombre runner" test --info 
Ejecutar paquete o funcionalidad completa: gradlew clean test --info
