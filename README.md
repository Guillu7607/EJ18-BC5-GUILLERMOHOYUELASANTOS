# Resumen
Este proyecto consiste en una aplicación de escritorio básica desarrollada en Java utilizando JavaFX.
El objetivo principal de este ejercicio es comprender cómo organizar varios componentes de la interfaz de forma secuencial y vertical utilizando el contenedor VBox,
además de asignar comportamientos independientes a múltiples botones.
# Características
Diseño Vertical Automatizado: Utiliza un contenedor VBox para alinear los tres botones en una sola columna,
evitando tener que calcular manualmente las coordenadas de posición de cada elemento.

Espaciado Uniforme: Se configura un espacio de separación de 10 píxeles entre los componentes hijos del contenedor de forma nativa.

Manejo Discreto de Eventos: Cada botón cuenta con su propio escuchador de eventos (Event Handler) mediante expresiones Lambda,
imprimiendo cadenas de texto diferenciadas en la consola del sistema.
