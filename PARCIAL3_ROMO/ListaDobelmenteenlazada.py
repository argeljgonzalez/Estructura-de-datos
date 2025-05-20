# Definición del nodo
class Nodo:
    def __init__(self, dato):
        self.dato = dato
        self.siguiente = None
        self.anterior = None

# Lista doblemente enlazada
class ListaDoble:
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
            nuevo_nodo.anterior = actual

    def mostrar_adelante(self):
        actual = self.cabeza
        while actual:
            print(actual.dato)
            actual = actual.siguiente

    def mostrar_atras(self):
        actual = self.cabeza
        if not actual:
            return
        while actual.siguiente:
            actual = actual.siguiente
        while actual:
            print(actual.dato)
            actual = actual.anterior

# Uso de la lista doblemente enlazada
lista = ListaDoble()
lista.agregar(10)
lista.agregar(20)
lista.agregar(30)

print("Recorrido hacia adelante:")
lista.mostrar_adelante()

print("Recorrido hacia atrás:")
lista.mostrar_atras()
