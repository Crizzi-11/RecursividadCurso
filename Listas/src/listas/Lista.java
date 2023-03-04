package listas;

/**
 *
 * @author Cristofer
 */
public class Lista {

    private Node cabeza;

    public void inserta(Persona p) {
        if (cabeza == null) {
            cabeza = new Node(p);
        } else if (p.getId() < cabeza.getDato().getId()) {
            Node aux = new Node(p);
            aux.setNext(cabeza);
            cabeza = aux;
        } else if (cabeza.getNext() == null) {
            cabeza.setNext(new Node(p));
        } else {
            Node aux = cabeza;
            while (aux.getNext() != null
                    && aux.getNext().getDato().getId()
                    < p.getId()) {
                aux = aux.getNext();
            }
            Node temp = new Node(p);
            temp.setNext(aux.getNext());
            aux.setNext(temp);
        }
    }

    public boolean existe(int id) {
        boolean esta = false;
        //Busca en lista, y retorna true si una persona tiene el id
        //en una lista
        if (cabeza != null) {
            //Si hay algo en la lista buscare
            Node aux = cabeza;
            //utilizo aux como indice

            //Minetras no se acabe la lista y el elemento
            //de la lista sea menor que el buscado
            while (aux != null && aux.getDato().getId() < id) {
                aux = aux.getNext();
            }
            //verdadero si lo encontro
            esta = (aux != null && aux.getDato().getId() == id);

        }
        return esta;
    }

    public void modifica(Persona p) {
        // busca a si existe alguien con el id,y le actualiza el nombre}
        if (cabeza != null) {
            //si hay algo en la lista buscaré
            Node aux = cabeza;
            //Mientras no se acabe la lista y el elemento
            //de la lista sea menor que el buscado
            while (aux != null && aux.getDato().getId() < p.getId()){
                aux = aux.getNext();//avanzo en la lista
            }
            //Si lo encuntra hago cambio
            if (aux != null && aux.getDato().getId() == p.getId()) {
                //Solo basta cambiar nombre
                aux.getDato().setNombre(p.getNombre());
            }
        }

    }

    public void elimina(int id) {
        //Si una persona tiene el id,lo elimina
        if (cabeza != null) {//Si hay algo en la lista buscare
            if (cabeza.getDato().getId() == id) {
                cabeza = cabeza.getNext();
            } else {
                Node aux = cabeza; //utilizo aux como indice
                //Mientras no se acabe la lista y el elemento
                //de la lista sea menor que el buscado
                while (aux.getNext() != null
                        && aux.getNext().getDato().getId() < id) {
                    aux = aux.getNext();  //avanzando en la lista     
                }
                //verdadero si lo encontro
                if (aux.getNext() != null
                        && aux.getNext().getDato().getId() == id) {
                    aux.setNext(aux.getNext().getNext());
                }
            }
        }
    }

    public Persona extrae(int id) {
        Persona p = null;
        //si una persona tiene el id lo extrae(eliminando y retornando)
        if (cabeza != null) {//Si hay algo en la lista buscaré
            if (cabeza.getDato().getId() == id) {
                cabeza = cabeza.getNext();
            } else {
                Node aux = cabeza;//utilizo aux como indice
                //Mientras no se acabe la lista y el elemento
                //de la lista sea menor que el buscado 
                while (aux.getNext() != null
                        && aux.getNext().getDato().getId() < id) {
                    aux = aux.getNext();
                    //avanzando en la lista
                }
                //Si es el de adelante... guardo la persona y lo borro
                if (aux.getNext() != null
                        && aux.getNext().getDato().getId() == id) {
                    p = aux.getNext().getDato();
                    aux.setNext(aux.getNext().getNext());
                }//cambio las referencias
            }
        }
        return p;
    }

    @Override
    public String toString() {
        Node aux = cabeza;
        String s = "Lista:";
        while (aux != null) {
            s += aux + ",";
            aux = aux.getNext();
        }
        return s;
    }

}
