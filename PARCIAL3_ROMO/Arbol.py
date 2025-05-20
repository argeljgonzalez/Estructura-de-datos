# Definición del nodo del árbol
class Nodo:
    def __init__(self, dato):
        self.dato = dato
        self.izquierda = None
        self.derecha = None

# Árbol binario
class ArbolBinario:
    def __init__(self):
        self.raiz = None

    def agregar(self, dato):
        if not self.raiz:
            self.raiz = Nodo(dato)
        else:
            self._agregar_recursivo(self.raiz, dato)

    def _agregar_recursivo(self, nodo, dato):
        if dato < nodo.dato:
            if nodo.izquierda is None:
                nodo.izquierda = Nodo(dato)
            else:
                self._agregar_recursivo(nodo.izquierda, dato)
        else:
            if nodo.derecha is None:
                nodo.derecha = Nodo(dato)
            else:
                self._agregar_recursivo(nodo.derecha, dato)

    def mostrar_en_orden(self):
        self._en_orden(self.raiz)

    def _en_orden(self, nodo):
        if nodo:
            self._en_orden(nodo.izquierda)
            print(nodo.dato)
            self._en_orden(nodo.derecha)

# Uso del árbol binario
arbol = ArbolBinario()
arbol.agregar(20)
arbol.agregar(10)
arbol.agregar(30)

print("Recorrido en orden:")
arbol.mostrar_en_orden()
