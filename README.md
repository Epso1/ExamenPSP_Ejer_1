# RECOLECCIÓN DE URLS Y DESCARGA DE FICHEROS

## Descripción de la aplicación

Esta aplicación permite al usuario introducir direcciones URL que se almacenan en un listado junto con una cadena aleatoria y única de 20 caracteres. Cada vez que se añade una URL al listado, una clase llamada `DownloaderAndZipper` escucha este evento y muestra un mensaje en la consola. Si la URL añadida está vacía, se muestra un mensaje indicando “Se va a proceder a descargar y comprimir los ficheros”. Si la url no está vacía se mostrará el mensaje "{url} encolado como
{cadena aleatoria y única de 20 caracteres}". La aplicación implementa el patrón Observer-Listener para esta funcionalidad.

## Requisitos del sistema

- Sistema operativo: Windows
- Java JDK 19
- IntelliJ IDEA 2023.2.2
- Maven

## Instalación en IntelliJ IDEA

1. Clona el repositorio del proyecto en tu máquina local.
2. Abre IntelliJ IDEA.
3. Haz clic en `File` > `Open`.
4. Navega hasta el directorio donde clonaste el repositorio del proyecto y haz clic en `Open`.
5. IntelliJ IDEA debería reconocer automáticamente que se trata de un proyecto Maven y comenzará a importar las dependencias necesarias. Si no lo hace automáticamente, puedes hacer clic derecho en el archivo `pom.xml` y seleccionar `Add as Maven Project`.
6. Asegúrate de que tu SDK esté configurado correctamente. Puedes hacer esto yendo a `File` > `Project Structure` > `Project Settings` > `Project` y seleccionando la versión correcta de Java SDK en el menú desplegable `Project SDK`.

## Uso de la aplicación

1. Para ejecutar la aplicación, navega hasta la clase `Main` en el paquete `com.example.practica_5_ejer_1`.
2. Haz clic derecho en la clase `Main` y selecciona `Run 'Main.main()'`.
3. La aplicación comenzará a ejecutarse y te pedirá que introduzcas una URL.
4. Introduce la URL que desees y presiona `Enter`. La URL se añadirá al listado y se mostrará un mensaje en la consola.
5. Si deseas salir de la aplicación, simplemente introduce '0' y presiona `Enter`.

Por favor, ten en cuenta que esta aplicación es un ejemplo y no descarga ni comprime realmente los archivos de las URLs proporcionadas.