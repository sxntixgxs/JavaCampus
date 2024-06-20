# Buscar elementos
+ boolean contains(Object o)
+ int indexOf(Object o)
+ int lastIndexOf(Object o)
+ Arrays.toString(skills)

# Operaciones avanzadas
+ boolean addAll(Collection<extends>) //colection es array
    + ArrayList<String> otraLista = new ArrayList<>(Arrays.asList("Pythton","Pseint"));//convierte esos dos valores que son una lista a un arraylist que si puede añadirse al arraylist
    + list.addAll(otraLista);
    + System.out.println(list);
+ boolean retainAll(Collection<?>c)