![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)

# 🧠 Semana 5 - Actividad Sumativa 2: Organización modular y creación de una librería personalizada

## Desarrollo Orientado a Objetos I

## Sistema de Gestión de Tours - Llanquihue Tour

## 👤 Autor del proyecto

- **Nombre completo:** Jemima Palma Lillo
- **Carrera:** Analista Programador Computacional
- **Sede:** Online

---

## 📘 Descripción general del sistema

Este proyecto corresponde a la actividad sumativa de la asignatura *Desarrollo Orientado a Objetos I*.

Consiste en el desarrollo de un sistema básico para la agencia de turismo "Llanquihue Tour", utilizando el lenguaje Java y los principios de la programación orientada a objetos.

El sistema permite leer información de tours turísticos desde un archivo de texto, validar los datos, crear objetos y almacenarlos en una colección `ArrayList`.

Además, implementa relaciones de composición entre clases y permite visualizar los tours registrados y filtrar aquellos cuyo precio sea superior a $15.000.

---

## 🧱 Estructura general del proyecto

```plaintext
📁 LlanquihueTourApp/
│
├── resources/
│   └── tours.txt
│
└── src/
    ├── app/
    │   └── Main.java
    │
    ├── model/
    │   ├── Tour.java
    │   ├── Financiamiento.java
    │   └── CategoriaTour.java
    │
    ├── service/
    │   └── GestorDatos.java
    │
    └── util/
        └── Validador.java
```

### Clases implementadas

El proyecto contiene seis clases principales:

**1. Main**

Es la clase principal encargada de ejecutar el programa, cargar los datos y mostrar los resultados por consola.

**2. Tour**

Representa un tour turístico y contiene información como nombre, ubicación, precio, financiamiento y categoría.

**3. Financiamiento**

Representa el tipo y la descripción del financiamiento asociado a un tour.

**4. CategoriaTour**

Representa la categoría a la que pertenece un tour, junto con su descripción.

**5. GestorDatos**

Se encarga de leer los datos desde el archivo de texto, validar la información, crear los objetos y almacenarlos en un `ArrayList`.

**6. Validador**

Contiene métodos para comprobar que los textos no estén vacíos y que los precios sean iguales o mayores a cero.

---

## 🔗 Relaciones entre clases

El proyecto implementa composición entre la clase `Tour` y las clases `Financiamiento` y `CategoriaTour`.

Cada objeto `Tour` crea y contiene sus propios objetos de financiamiento y categoría, permitiendo organizar la información de manera modular.

---

## ⚙️ Funcionalidades implementadas

- Lectura de datos desde un archivo `.txt`.
- Almacenamiento de objetos mediante una colección `ArrayList`.
- Validación de textos y precios.
- Manejo de excepciones mediante estructuras `try-catch`.
- Visualización de todos los tours registrados.
- Filtrado de tours con precio superior a $15.000.

---

## 📄 Archivo de datos

Los registros de los tours se encuentran en el archivo `resources/tours.txt`.

Los datos están separados mediante punto y coma (`;`) y cada registro contiene siete campos:

1. Nombre del tour.
2. Ubicación.
3. Precio.
4. Tipo de financiamiento.
5. Descripción del financiamiento.
6. Nombre de la categoría.
7. Descripción de la categoría.

---

## ⚙️ Instrucciones para clonar y ejecutar el proyecto

1. Clonar el repositorio desde GitHub.
2. Abrir el proyecto `LlanquihueTourApp` en IntelliJ IDEA.
3. Verificar que el archivo `tours.txt` se encuentre dentro de la carpeta `resources`.
4. Ubicar el archivo `Main.java` dentro del paquete `app`.
5. Ejecutar el método `main`.
6. Visualizar en la consola el listado de tours y los resultados del filtro por precio.

---

**Repositorio GitHub:** https://github.com/jempalma-ops/LlanquihueTourApp

**Fecha de entrega:** [23/noviembre/226]

---

© Duoc UC | Escuela de Informática y Telecomunicaciones | Semana 5 - Actividad Sumativa 2
