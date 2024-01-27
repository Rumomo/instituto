**Ejercicio 1. Implementar en Java el siguiente diagrama de clases:**
![Captura de pantalla 2024-01-27 114408](https://github.com/Rumomo/instituto/assets/26388833/9408ade3-ee45-47c4-92fc-4c9445363f15)

Dentro de cada clase existen 3 filas: 
- Fila 1: nombre de la clase. 
- Fila 2: definición de atributos. 
- Fila 3: definición de métodos.
  Los signos #, + y - a la izquierda del identificador hace referencia al ámbito de los atributos y los métodos:
  - #: protected
  - +: public
  - -: private
 
Las flechas hacen referencia a la relación entre las clases: 
**- Flecha entre Estudiante y Persona:** Indica que la clase Estudiante hereda de la clase Persona. 
**- Flecha entre Estudiante y EstudianteInt:** indica que la clase EstudianteInt hereda de la clase Estudiante.    

Aspectos a tener en cuenta en la clase EstudianteInt:
- El atributo nacionalidad de la clase EstudianteInt puede tener los siguientes valores: inglés, francés, portugués o americano.
- El método esErasmus indica si el estudiante es de Erasmus, hay que tener en cuenta que los Estudiantes cuya nacionalidad sea americana no pueden ser de Erasmus.
- El método esEuropeo() devuelve true si la nacionalidad del alumno es europea. Un Estudiante Europeo puede o no puede ser de Erasmus.
- El método descuentoParaJovenes() devuelve true si el alumno es de Erasmus y, además, es menor de 25 años.

  Crear dos alumnos a partir de la clase Estudiante y tres Alumnos a partir de la clase **EstudianteInt** utilizando los constructores con parámetros.
  Para los alumnos internacionales, imprimir si son europeos, y tienen descuento para jóvenes.

  **Subirlo a la plataforma en formato PDF junto a su código fuente. **
