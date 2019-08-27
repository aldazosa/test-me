# test-me

Patio para jugar

## Requisitos

Tener [Leiningen][1] 2.0 or superior instalado

[1]: https://github.com/technomancy/leiningen

## Probando

To start a web server for the application, run:

    lein run

Lo cual arranca el servidor de aplicaciones en el puerto 3000 y un repl en el 7000. Para conectarse al repl:

    lein repl :connect localhost:7000

Finalmente, para iniciar la compilación de clojurescript:

    lein figwheel

El último paso inicia todo y espera a que un navegador se conecte en localhost:3000


## Emacs

Para conectarse desde emacs podemos usar cider para manejar las conexiones y los reps. Desde un archivo del proyecto (por ejemplo `project.clj`) usar la instrucción `cider-jack-in-clj` (`C-c M-j`). Eso arranca el repl de clojure y nos lo muestra en un buffer en `user`. En ese repl se pueden usar las siguientes instrucciones para levantar y detener la aplicación:

 - start
 - stop
 - restart

Como está todo limpio, basta con usar la primera:

```
user> (start)
2019-08-27 13:50:56,478 [nRepl-session-35388073-ec3c-44c6-9414-fa1246750b55] INFO  test-me.env -
-=[test-me started successfully using the development profile]=-
2019-08-27 13:50:56,666 [nRepl-session-35388073-ec3c-44c6-9414-fa1246750b55] INFO  luminus.http-server - server started on port 3000
{:started
 ["#'test-me.config/env"
  "#'test-me.handler/init-app"
  "#'test-me.handler/app-routes"
  "#'test-me.core/http-server"}]
```

Ahora, desde el buffer del repl iniciamos el repl para clojurescript usando la instrucción: `cider-connect-sibling-cljs` (`C-c C-x C-s C-s`). Cuando emacs pregunte qué tipo de repl queremos, se debe seleccionar `figwheel`. Eso iniciará otro buffer con el repl de cljs esperando la conexión al navegador. Después de esto basta con acceder en un navegador a `localhost:3000`
