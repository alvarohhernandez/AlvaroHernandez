#!/bin/bash

USER=`whoami`
PWD=`pwd`
FILES=`ls`
NOTAS=notas.md

printf "Hola ${USER}\n"
echo "----------"
printf "Tu directorio actual es ${PWD}\n"
echo "----------"
printf "Tus archivos en el directorio actual son: \n${FILES}\n"

echo "----------"
echo "Los permisos para cada archivo son:"
for i in $FILES; do
  PERMISOS=`stat -c %a $i`
  echo "${i} - ${PERMISOS}";
done

echo "----------"
if [ -f $NOTAS ]
then
  echo "Tienes actualizado tu trabajo"
else
  echo "Te hace falta el archivo ${NOTAS}"
  echo "Creando el archivo ${NOTAS} en blanco"
  echo "----------"
  touch ${NOTAS}
  echo "Se ha creado el archivo ${NOTAS}, tu directorio ya está actualizado"
fi
