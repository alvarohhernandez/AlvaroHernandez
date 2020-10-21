#!/bin/bash

echo -e "Script para buscar archivos dentro del home del usuario $(whoami)
Se deberá ingresar el nombre del archivo que se desea buscar
así como la profundidad con la cual se accederá al árbol de
directorios. La búsqueda hace uso de expresiones regulares
lo que nos permite buscar por un nombre específico de archivo
o por un nombre parcial.\n"

read -p "Ingresa el archivo que quieres buscar: " INPUT
read -p "Ingresa el nivel de profundidad en el que se debe buscar el archivo $NAME (default: 2): " PROFUNDIDAD

if [ -z ${PROFUNDIDAD} ]
then
  PROFUNDIDAD=2
fi

RESULTS=$(find $HOME -maxdepth $PROFUNDIDAD -name \*$INPUT\*)

if [ -z "$RESULTS" ]
then
  echo No se encontraron resultados de búsqueda con profundidad $PROFUNDIDAD para el archivo $INPUT en el directorio $HOME
else
  echo -e "\nSe encontraron los siguientes posibles resultados:"
  for i in $RESULTS
  do
    echo $i
  done
fi
