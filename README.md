# taller7

## Diseño de arquitectura

Para esta aplicación lo que realizamos fue una estructura de certificados en donde dos aplicaciones pueden comunicarse entre si, al tener el certificados de confianza
entre si, para eso vamos a partir del taller, y lo que vamos a generar son dos paths en donde en uno pedimos el hola mundo de la maquina local, y en el otro el hola mundo
de la maquina remota, como estan compartiendo certificados no deberia haber problema al comunicarse entre si, para probarlo desplegamos las maquinas en dos instancias de
AWS para que corran en maquinas distintas, y simplemente modificamos el enlace a la maquina remota, dando como resultado una conexión segura entre las dos maquinas.

