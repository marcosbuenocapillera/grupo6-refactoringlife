# grupo6-refactoringlife
Repositorio para prácticas de Grupo 6 en Refactoring Life


Reglas

Definición de reglas:

formateo de identación que viene con Intellij (ctl+alt+l, ctl+alt+o)
nomenclatura de Java
1 línea entre funciones
sin lineas al finalizar el útlimo método y el cierre de } de la clase
no tener espacio de más
los comentarios de código se deben quitar
commit: que sea lo más descriptivo posible
el pull request debe ser más descriptivo, aquí detallamos todo lo que hicimos
lo que se sube al repo, es del cliente, debe estar lo más limpio posible
Rama de Desarrollo Develop

Paso para git

Si no tienen la rama local develop en local 

#Crea la rama develop local y trae la rama develop remoto
git checkout -b develop origin/develop

#Trae los ultimos cambios de develop
git pull develop

Una vez que tengan develop desde origin y esta actualizada con los utlimos cambios
No trabajemos sobre develop, creamos los feature sobre que servicio vamos a desarrollar

#Ejemplo
git checkout -b featureAltaDeProductos/marcos2

Una vez que ya estemos seguros de que todo funcione

git add .
git commit -m 'Commit descriptivo del feature'

git pull

#Avisamos en trello que quedo pronto

Y vemos los conflitctos en  github antes de hacer merge si hay cosas a corregir o mejorar. 

Bueno vamos con todo ! 



