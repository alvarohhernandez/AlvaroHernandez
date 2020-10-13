# Práctica 3 (Uso de redireccionamientos y comando básicos)
## Mi directorio actual
/home/draco/universidad/ICC1/AlvaroHernandez

###### Mi historial
Podemos acceder al historial con el comando history, para obtener un número determinado de lineas, podemos hacer uso de la flag -n, donde n indica el número de lineas que queremos obtener
```
history -60 >> practica3.md
```

Y el resultado obtenido es el siguiente:
```
 9947  vim Modules/Viaticos/Database/Migrations/2020_10_12_155520_create_expense_payment_statuses_table
 9948  vim Modules/Viaticos/Database/Migrations/2020_10_12_155520_create_expense_payment_statuses_table.php
 9949  rm Modules/Viaticos/Database/Migrations/2020_10_12_155520_create_expense_payment_statuses_table.php
 9950  vim /home/draco/git/dit/viaticos-financiera-contigo/Modules/Viaticos/Database/Migrations/2020_10_12_155556_create_expense_flight_statuses_table.php
 9951  php artisan migrate
 9952  vim /home/draco/git/dit/viaticos-financiera-contigo/Modules/Viaticos/Database/Seeders/ExpenseFlightStatusesTableSeeder.php
 9953  php artisan migrate:refresh --seed
 9954  whois 193.112.54.76
 9955  vim Modules/Viaticos/Database/Migrations/2020_10_09_123100_create_expense_itinerary_flights_table.php
 9956  mysql -uroot viaticos_financiera_contigo
 9957  vim Modules/Viaticos/Entities/ExpenseStatus.php 
 9958  vim Modules/Viaticos/Entities/ExpenseStatus.php
 9959  vim Modules/Viaticos/Entities/ExpenseLog.php
 9960  ls ./Modules/Viaticos/Resources/assets/js/views/
 9961  vim resources/js/app.js
 9962  vim resources/js/store/index.js
 9963  vim resources/js/store/modules.js 
 9964  grep -r pagos-por-generar resources
 9965  vim app/Http/Controllers/Api/MainboardController.php
 9966  grep -r ShowExpense resources
 9967  grep -r ShowExpense Modules
 9968  grep -r showHistory Modules
 9969  grep -r showHistory resources
 9970  cd ~/git/simpati/simpati_api
 9971  mv ~/Descargas/crceExport_* csvUsers.csv
 9972  git add -A
 9973  git commit -m "Actualización Parque Simpati"
 9974  git push
 9975  ssh simpatiAPI
 9976  vim resources/js/routes/index.js
 9977  vim Modules/Viaticos/Http/Controllers/ExpensePaymentsController.php
 9978  vim Modules/Viaticos/Resources/assets/js/views/generated-payments.vue
 9979  vim Modules/Viaticos/Resources/assets/js/views/pagos-pendientes.vue
 9980  vim Modules/Viaticos/Routes/api.php
 9981  ssh omniview
 9982  vim ./Modules/Viaticos/Resources/assets/js/views/show-expense.vue
 9983  vim ./Modules/Viaticos/Resources/assets/js/views/detail-expense.vue
 9984  vim Modules/Viaticos/Resources/assets/js/store/expense.js
 9985  vim ./Modules/Viaticos/Resources/assets/js/store/payment.js
 9986  vim ./Modules/Viaticos/Resources/assets/js/views/create-expense.vue
 9987  vim Modules/Viaticos/Http/Controllers/ExpensesController.php
 9988  vim Modules/Viaticos/Resources/assets/js/views/pagos-por-generar.vue
 9989  vim Modules/Viaticos/Entities/Expense.php
 9990  vim app/Models/File.php
 9991  vim Modules/Viaticos/Entities/ExpensePayment.php
 9992  cd
 9993  cd universidad/ICC1/
 9994  git clone git@github.com:CCLaboratorio/recursos.git
 9995  cd recursos
 9996  git status
 9997  cat README.md
 9998  git pull
 9999  ls
10000  cat notas.md
10001  cd ~/universidad/ICC1/recursos
10002  history -60 practica3.md
10003  cd ..
10004  ls
10005  cd AlvaroHernandez
10006  ls
```

Agregamos un título al archivo desde la shell con el comando:
```
echo "# Práctica 3 (Uso de redireccionamientos y comando básicos)" >> practica3.md
```

Agregamos el path actual con el comando:
```
pwd >> practica3.md
```

Agregamos las últimas lineas del historial con los comando que utilizamos para hacer commit y push al repositorio:
```
history -15 >> practica3.md
```

Y el resultado es el siguiente:

```
10007  history -60 > practica3.md
10008  vim practica3.md
10009  pwd >> practica3.md
10010  vim practica3.md
10011  echo # Práctica 3 (Uso de redireccionamientos y comando básicos) >> practica3.md
10012  echo "# Práctica 3 (Uso de redireccionamientos y comando básicos)" >> practica3.md
10013  vim practica3.md
10014  git status
10015  vim practica3.md
10016  git status
10017  git add practica3.md
10018  git commit -m "Notas de redireccionamiento y comando básicos"
10019  git push
10020  history -10 >> practica3.md
10021  vim practica3.md
```

## Comando de configuración de Git

```
  670  git config merge.renamelimit 4000
 2621  git config diff.renames 0
 3154  git config --global user.email "alvaro.hernandez@dit.mx"
 3155  git config --global user.name "Alvaro Hernández"
 8367  git config --global user.name "Alvaro"\ngit config --global user.email "a_90_hernandez@hotmail.com"
 9689  git config user.signingkey 137D6B6EEFDB2D37
 9690  git config commit.gpgsign true
 9715  git config user.email "draco_90@ciencias.unam.mx"
10028  history | grep "git config"
```
