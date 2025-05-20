# Definición del nodo
class Nodo:
    def __init__(self, dato):
        self.dato = dato
        self.siguiente = None

# Lista enlazada simple
class ListaEnlazada:
    def __init__(self):
        self.cabeza = None

    def agregar(self, dato):
        nuevo_nodo = Nodo(dato)
        if not self.cabeza:
            self.cabeza = nuevo_nodo
        else:
            actual = self.cabeza
            while actual.siguiente:
                actual = actual.siguiente
            actual.siguiente = nuevo_nodo

    def mostrar(self):
        actual = self.cabeza
        while actual:
            print(actual.dato)
            actual = actual.siguiente

# Uso de la lista enlazada
lista = ListaEnlazada()
lista.agregar(10)
lista.agregar(20)
lista.agregar(30)

lista.mostrar()
