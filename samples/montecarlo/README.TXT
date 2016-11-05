------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE:	Montecarlo

PURPOSE OF PROJECT:
Programa en Java que aproxima el valor de pi mediante el método de Montecarlo.

El método consiste en construir un círculo de radio conocido (típicamente r = 1) inscrito dentro de un cuadrado (que tendrá lado l = 2r). Se generan N puntos al azar dentro del cuadrado y se cuenta cuántos de ellos están dentro del círculo. El valor aproximado de pi = 4 * puntos dentro / total puntos (ver la explicación en el documento montecarlo.pdf)

El propósito del proyecto es aprender a usar clases como atributos de otras clases, por lo que la solución puede simplificarse.

VERSION or DATE: 1.0 (Oct 2016)

HOW TO START THIS PROJECT:
Proyecto BlueJ. Abre el fichero package.bluej, compílalo y ejecuta el programa principal de la clase Montecarlo.

La clase MontecarloGr es una versión gráfica que muestra los puntos generados. Para usarla, pincha con el botón derecho sobre la clase MontecarloGr y selecciona la opción “Run Controller” en el menú contextual.

AUTHORS: IIP (@mrebollo)

USER INSTRUCTIONS:
Introduce el número de puntos que quieres que se generen al azar para calcular el valor de pi. Cuantos más puntos, más preciso será el resultado. Ten cuidado con el número de puntos que usas porque puede tardar demasiado (especialmente el modo grafico)
