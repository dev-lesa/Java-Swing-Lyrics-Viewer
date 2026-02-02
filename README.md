# 🎵 Java-Swing-Lyrics-Viewer

**Java-Swing-Lyrics-Viewer** es una aplicación ligera desarrollada en Java que permite visualizar letras de canciones de forma interactiva y dinámica. Utiliza cuadros de diálogo de `JOptionPane` para guiar al usuario a través de la letra, verso por verso, acompañando la experiencia con la portada del álbum.

---

## ✨ Características

* **Entrada Dinámica:** Permite ingresar artista, nombre de la canción y la letra en tiempo real.
* **Soporte de Imágenes:** Carga portadas de álbumes directamente desde una **URL** o archivos locales.
* **Visualización Línea por Línea:** Presenta la letra verso a verso para una lectura fluida.
* **Escalado Automático:** Ajusta las dimensiones de las imágenes para que encajen perfectamente en los diálogos de Swing.

---

## 📂 Estructura del Proyecto

El proyecto se divide en tres versiones principales para demostrar diferentes niveles de complejidad:

| Clase | Descripción |
| --- | --- |
| `MainDinamico` | La versión completa. Permite al usuario pegar la letra y cargar una imagen desde la web. |
| `MainQuemado` | Versión de ejemplo con datos estáticos (Hardcoded) y soporte de imagen local. |
| `MainSimpleQuemado` | Versión minimalista que solo muestra la letra sin recursos visuales adicionales. |

---

## 🚀 Cómo empezar

### Requisitos

* **Java JDK 8** o superior.
* Un editor de código o IDE de tu preferencia (**IntelliJ IDEA, VS Code, NetBeans, Eclipse**, etc.).

### Ejecución

1. **Clona este repositorio:**

```bash
git clone https://github.com/dev-lesa/Java-Swing-Lyrics-Viewer.git

```

2. **Elige un método para ejecutarlo:**

#### Opción A: Desde un IDE o Editor (Recomendado)

* Abre la carpeta del proyecto en tu editor (**IntelliJ, VS Code, NetBeans, Eclipse**, etc.).
* Navega hasta el archivo `.java` que desees probar (ej. `MainDinamico.java`).
* Haz clic derecho sobre el archivo y selecciona **Run** (Ejecutar).

#### Opción B: Desde la Terminal

* Abre la terminal y navega a la carpeta `src/Lyrics`.
* Compila y ejecuta la clase deseada:

```bash
javac MainDinamico.java
java Lyrics.MainDinamico

```

---

## 🛠️ Tecnologías utilizadas

* **Java Standard Edition (SE)**
* **Java Swing:** Para la interfaz gráfica y cuadros de diálogo.
* **AWT & ImageIO:** Para el manejo y renderizado de imágenes.

---

## 📝 Ejemplo de uso

Al iniciar `MainDinamico`, el flujo es el siguiente:

1. **Input:** Ingresas el nombre del artista y la canción.
2. **Imagen:** Pegas un enlace directo a la portada (ej. `.jpg` o `.png`).
3. **Letra:** Pegas el texto completo de la canción en el área de texto.
4. **Display:** Se mostrará una tarjeta de presentación seguida de cada verso individualmente.

> [!TIP]
> Si vas a usar `MainQuemado`, asegúrate de tener una imagen válida en la ruta `src/main/resources/img.png` o ajusta la ruta en el código.
> 
