# Definición del nodo
class Nodo:
    def __init__(self, dato):
        self.dato = dato
        self.siguiente = None

# Lista enlazada circular
class ListaCircular:
    def __init__(self):
        self.cabeza = None

    def agregar(self, dato):
        nuevo_nodo = Nodo(dato)
        if not self.cabeza:
            self.cabeza = nuevo_nodo
            nuevo_nodo.siguiente = self.cabeza  # Apunta a sí mismo
        else:
            actual = self.cabeza
            while actual.siguiente != self.cabeza:
                actual = actual.siguiente
            actual.siguiente = nuevo_nodo
            nuevo_nodo.siguiente = self.cabeza  # Cierra el ciclo

    def mostrar(self, veces=1):
        if not self.cabeza:
            return
        actual = self.cabeza
        contador = 0
        while True:
            print(actual.dato)
            actual = actual.siguiente
            if actual == self.cabeza:
                contador += 1
                if contador >= veces:
                    break

# Uso de la lista circular
lista = ListaCircular()
lista.agregar(10)
lista.agregar(20)
lista.agregar(30)

print("Lista circular (una vuelta):")
lista.mostrar(veces=1)
