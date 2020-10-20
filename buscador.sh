#!/bin/bash

echo Script para buscar archivos dentro del home del usuario $(whoami)
read -p "Ingresa el archivo que quieres buscar: " INPUT
read -p "Ingresa el nivel de profundidad en el que se debe buscar el archivo $NAME (default: 2): " PROFUNDIDAD

if [ -z ${PROFUNDIDAD} ]
then
  PROFUNDIDAD=2
fi

echo $PROFUNDIDAD

RESULTS=$(find $HOME -maxdepth $PROFUNDIDAD -name $INPUT)

if [ -z $RESULTS ]
then
  echo No se encontraron resultados de búsqueda con profundidad $PROFUNDIDAD para el archivo $INPUT en el directorio $HOME
else
  echo Se encontraron los siguientes resultados:
  echo $RESULTS
fi
