# Reto-3-Java

Hugo, Paco y Luis han notado que cada vez que coleccionan láminas para un álbum siempre crean una lista con los números de las láminas que les faltan y crean otra lista con los números de las que tienen para cambiar. Con esas listas realizan cambios con otras personas. Adicionalmente, han notado que las láminas que coleccionan, dependiendo del álbum, son categorizadas diferente, a veces las llaman de tipo 1, 2, 3, 4, o 5. Es más, las láminas de un tipo solo son cambiadas por las láminas del mismo tipo. Como ellos están tomando el curso del MinTic2021, han decidido crear un programa que les ayude realizando dichos cambios. Para ello han notado que requieren crear una Clase llamada "Monas" en Java que conste como mínimo de las siguientes funciones que les permitirán construir el programa completo (vale 1):

1. (Vale 1) La función "clases" que dada una lista de los tipos de todas las láminas (en la posición i-ésima de la lista está el tipo de dicha lámina), genera una lista con los tipos de láminas sin repetición.

Por ejemplo si el álbum tiene diez láminas y cada una tiene los siguientes tipos:

[1,2,5,5,5,1,2,5,5,5]

la función debe retornar la lista

1.      [1,2,5]

Nótese que las clases aparecen solo una vez.

 

2. (Vale 1) La función "meFaltanDeLaClase" que dada una lista con los números de láminas que les faltan, la lista de las clases de cada lámina y un clase de láminas (en ese orden), les retorne una lista con los números de dicha clase que les faltan.

Por ejemplo si se ejecuta la función:

meFaltanDeLaClase([1,3,6,8], [1,2,5,5,5,1,2,5,5,5], 5)

debe retornar la lista

[3,8]

Nótese que los números de láminas empiezan en cero (0) y van hasta el nueve (9) en este ejemplo (siempre empiezan en cero).

Por ejemplo si ejecutan la

función:

meFaltanDeLaClase([1,3,6,8], [1,2,5,5,5,1,2,5,5,5], 2)

 

Se debe retornar la lista:

[1,6]

 

3. (Vale 1) La función "meFaltan" que dada una lista con las láminas que tiene otra persona y una lista con las láminas que tengo retorna la lista con las láminas que me interesan de la otra persona.

Por ejemplo si se llama:

notengo([3,5,7,10,15,16],[4,10,5,8])

Se debe retornar la lista:

[3,7,15,16]

4. (Vale 1) Para simplificar la primera versión de la librería decidieron pensar que todas las láminas son de un mismo tipo y que la lista que maneja cada persona indica los números de las láminas que tienen para cambiar y aquellos números que no están en dicha lista son los que necesitan. De esta manera deben crear una función "puedoCambiar" que reciba la lista de láminas que tiene otra persona y la lista de láminas que tienen ellos y que retorne el número de láminas que pueden cambiar.

Por ejemplo, llamar la función:

puedocambiar([3,5,7,10,15,16],[4,10,5,8])

Debe retornar

2

Porque a la otra persona solo le interesan dos láminas que tienen ellos: [4,8], mientras que a ellos les interesan cuatro láminas que la otra persona tiene: [3,7,15,16]. Para que sea evaluada correctamente, la función debe retornar un Integer.

Entrada:

Este programa no requiere entrada. Ni generará salida. Se requiere que el estudiante genere un archivo con el nombre Monas.java sin main y que se respeten los nombres de las funciones dadas y sus parámetros.
