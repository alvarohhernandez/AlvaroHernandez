#!/bin/bash

# Author: Alvaro Hernández Hernández
# Creation Date: 22/10/2020
# Last Modification Date: 22/10/2020
# Last Modification By: Alvaro Hernández

read -p "Ingresa el nombre del fichero que quieres limpiar.
El archivo será ordenado y las líneas repetidas serán eliminadas: " FILE
read -p "Ingresa el nombre del fichero destino (Donde será guardado el resultado): " DESTINO

RESULTS=$(find $HOME -maxdepth 5 -name $FILE)

if [ -z "$RESULTS" ]
then
  echo -e "No se encontró el archivo deseado\n"
  exit 0
else 
  echo -e "\nSe encontraron las siguientes coincidencias para $FILE"
  ITER=0

  for I in ${RESULTS[@]}
  do
    ITER=$(expr $ITER + 1)
    echo ${ITER}")" ${I}
  done

  read -p "Elige una opción (default: 1): " OPTION

  if [ -z ${OPTION} ]
  then
    OPTION=1
  fi
    OPTION=$(expr $OPTION - 1)

  FILE=${RESULTS[${OPTION}]}
  echo Se esta procesando el archivo: ${FILE}

  sort $FILE | uniq | tee $DESTINO

  echo -e "El resultado fue:\n"
  cat $DESTINO
fi
