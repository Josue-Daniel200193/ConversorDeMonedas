<h1>Conversor de Monedas</h1>

<p>Nuestro cliente cuenta con una cadena de hoteles en todo el pais y extrangero, tiene una serie de problemas tecnológicos, pero quiere solucionar el problemas básico con los clientes, donde los usuarios se toman mucho la molestia de estar comprando dinero extranjera para realizar las reservas, tanto como físico y virtual, y para ellos nos está pidiendo que hagamos una aplicación simple que soluciones el cambio en la misma plataforma en tiempo real. por lo básico quiere 4 tipos de conversiones, 5 sumándole a la moneda más usada USD dólar.</p>

<h2>Requerimientos</h2>
<ol>
  
  <li>La aplicación debe ser fácil y sencilla de usar.</li>
  <li>La aplicación debe de tener la conversión en tiempo real.</li>
  <li>Las aplicación debe contener un menú del 1 al 9.</li>
  <li>La aplicación debe estar vinculada con cada opción al tipo de cambio.</li>
  <li>El menú debe pedir la opción a elegir y exigir la cantidad a convertir.</li>
  <li>El menú debe de pedir la opción correcta y exigir que lo digite.</li>
  <li>también debe contener una opción de salida.</li>
  <li>todas las conversiones deben de ser del dólar al dinero extrangero, viceversa.</li>
</ol>
<h2>Herramientas</h2>
<ul>
  <li>java 17 en adelante</li>
  <li>API posman</li>
  <li>Biblioteca Gson</li>
  <li>Intellij IDEA</li>
  <li>Exchange Rate API</li>
  <li>Git Bash y gitHub</li>
</ul>
<h2>Proceso inicial</h2>
Haremos la instalación de todas las herramientas como lenguaje de programación, gestores, APIs de la nube, bibliotecas, ambiente laboral y donde guardar mis códigos para posteriormente mostrarlo al equipo y el menú mostrarlo al cliente.

<h2>Procesos 1</h2>
<h4>Peticiones al servidor.</h4>
crearemos una clase llamada ConsultarMonedas, luego llamaremos e importamos HttpClient para enviar las solicitudes y posteriormente haremos a la clase HttpRequest importamos, para hacer los respectivos pedidos, en este caso pediremos la moneda base = moneda del extrnegero, objetivo = tipo de cambio y también enviaremos la cantidad a convertir.

<h2>Proceso 2</h2>
<h4>Respuesta del servidor.</h4>
llamamos e importamos a la clase HttpResponse invocando el objeto client y guardaremos en una variable responde para mostrar la respuesta en formato Json con el comando body(), solo lo más importante.


<h2>proceso 3</h2>
<h4>transformación de formato</h4>
convocamos a la clase Gson(biblioteca) y a su método fromJson para convertir ese formato Json a clases java, pero para ellos tendremos una clase dentro de java llamada Moneda con sus respectivos atributos para que desde ahí jalar todas las respuestas y concatenarlas y mostrarla posteriormente.

<h2>proceso 4</h2>
<h4>Atributos fácil de manipular</h4>
Para facilitar el cambio de APIs al momento de implementar crearemos una clase de tipo record que nos permita la interacción y cambio de atributos de cualquier APIs y no tener que estar importante un método en cada atributo para validarlos..

<h2>proceso 5</h2>
<h4>menú de interacción</h4>
<p>>en nuestra clase principal crearemos un bucle que nos permita pedir al usuario la opción correcta, osea del 1 al 9, donde que 9 será la opción de salida que romperá el bucle infinito. 
estas opciones estarán ligadas a un método de clase que retorne la respuesta en formato 
Json, bueno ya en formato clase record  y mediante una instancia obtendremos los resultados de nuestra clase fundamental de tipo toString para mostrarlo al usuario principal.</p>

