# 📚 Lab10 DAW - CRUD de Cursos y Alumnos

Este es un proyecto desarrollado con **Spring Boot**, **MongoDB** y **Thymeleaf** que implementa el CRUD completo de las entidades `Curso` y `Alumno`.

---

## 🛠 Tecnologías usadas

- ✅ Java 24 + Spring Boot 3.5.0
- ✅ MongoDB Community Server
- ✅ Thymeleaf (plantillas HTML)
- ✅ Bootstrap 5.3.3
- ✅ Maven como herramienta de construcción

---

## 🚀 ¿Cómo ejecutar el proyecto?

### 1. Clona el repositorio

```bash
git clone https://github.com/imbubb4/Lab10_DAW.git
cd Lab10_DAW
```

### 2. Abre el proyecto en IntelliJ IDEA o tu IDE favorito

> Asegúrate de tener:
> - JDK 24 instalado
> - MongoDB instalado y corriendo localmente

### 3. Crea la base de datos en MongoDB

Usa MongoDB Compass o shell:

```json
Database: escuela
Collections: cursos, alumnos
```

> *La colección se crea automáticamente al insertar documentos.*

### 4. Configura el puerto en `src/main/resources/application.properties`

```properties
server.port=8087
spring.data.mongodb.database=escuela
```

### 5. Ejecuta el proyecto

Corre la clase:

```java
Lab10HerediaDawApplication.java
```

---

## 🌐 Accesos rápidos

| Ruta | Descripción |
|------|-------------|
| `http://localhost:8087/` | Página de inicio |
| `http://localhost:8087/listar` | Lista de cursos |
| `http://localhost:8087/form` | Crear nuevo curso |
| `http://localhost:8087/alumnos` | Lista de alumnos |
| `http://localhost:8087/alumnos/form` | Crear nuevo alumno |

---

## 👩‍💻 Autor

**Adrian Heredia Sovero**  
[GitHub @imbubb4](https://github.com/imbubb4)

---

