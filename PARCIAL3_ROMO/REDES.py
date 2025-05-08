from PyQt6.QtWidgets import (
    QApplication, QWidget, QLabel, QVBoxLayout,
    QHBoxLayout, QLineEdit, QPushButton, QTextEdit, QMessageBox
)
from PyQt6.QtGui import QFont
import sys
import heapq

class DijkstraApp(QWidget):
    def __init__(self):
        super().__init__()

        # Configuración de la ventana principal
        self.setWindowTitle("Algoritmo de Dijkstra - Matemáticas Discretas")
        self.setMinimumSize(700, 500)
        self.setStyleSheet("background-color: beige;")
        self.setFont(QFont("Times New Roman", 14))

        # Diccionario para almacenar el grafo
        self.grafo = {}

        # Inicializar la interfaz gráfica
        self.init_ui()

    def init_ui(self):
        layout = QVBoxLayout()

        # Instrucciones para el usuario
        instrucciones = QLabel("Agregar conexión (nodo1, nodo2, distancia):")
        layout.addWidget(instrucciones)

        # Entradas de texto para los nodos y la distancia
        self.nodo1_input = QLineEdit()
        self.nodo1_input.setPlaceholderText("Nodo 1")
        self.nodo2_input = QLineEdit()
        self.nodo2_input.setPlaceholderText("Nodo 2")
        self.distancia_input = QLineEdit()
        self.distancia_input.setPlaceholderText("Distancia")

        # Layout horizontal para entradas de conexión
        fila1 = QHBoxLayout()
        fila1.addWidget(self.nodo1_input)
        fila1.addWidget(self.nodo2_input)
        fila1.addWidget(self.distancia_input)
        layout.addLayout(fila1)

        # Botón para agregar conexión
        btn_agregar = QPushButton("Agregar conexión")
        btn_agregar.clicked.connect(self.agregar_conexion)
        layout.addWidget(btn_agregar)

        # Texto donde se mostrarán las conexiones agregadas
        self.conexiones_text = QTextEdit()
        self.conexiones_text.setReadOnly(True)
        layout.addWidget(self.conexiones_text)

        # Segunda parte: cálculo de caminos
        instrucciones2 = QLabel("Calcular camino más corto y largo:")
        layout.addWidget(instrucciones2)

        # Entradas para origen y destino
        self.origen_input = QLineEdit()
        self.origen_input.setPlaceholderText("Nodo de inicio")
        self.destino_input = QLineEdit()
        self.destino_input.setPlaceholderText("Nodo de destino")

        fila2 = QHBoxLayout()
        fila2.addWidget(self.origen_input)
        fila2.addWidget(self.destino_input)
        layout.addLayout(fila2)

        # Botón para ejecutar Dijkstra y DFS
        btn_dijkstra = QPushButton("Calcular camino más corto y largo")
        btn_dijkstra.clicked.connect(self.calcular_camino)
        layout.addWidget(btn_dijkstra)

        # Área para mostrar los resultados
        self.resultado_text = QTextEdit()
        self.resultado_text.setReadOnly(True)
        layout.addWidget(self.resultado_text)

        # Botón para guardar el resultado en un archivo
        btn_guardar = QPushButton("Guardar resultado en .txt")
        btn_guardar.clicked.connect(self.guardar_resultado)
        layout.addWidget(btn_guardar)

        # Aplicar layout principal
        self.setLayout(layout)

    def agregar_conexion(self):
        # Obtener datos de los campos
        nodo1 = self.nodo1_input.text().strip()
        nodo2 = self.nodo2_input.text().strip()

        try:
            distancia = float(self.distancia_input.text().strip())
        except ValueError:
            QMessageBox.warning(self, "Error", "La distancia debe ser un número.")
            return

        if nodo1 and nodo2:
            # Agregar la conexión bidireccional al grafo
            self.grafo.setdefault(nodo1, []).append((nodo2, distancia))
            self.grafo.setdefault(nodo2, []).append((nodo1, distancia))

            # Mostrar la conexión en la caja de texto
            self.conexiones_text.append(f"{nodo1} <--> {nodo2}  |  distancia: {distancia}")

            # Limpiar campos
            self.nodo1_input.clear()
            self.nodo2_input.clear()
            self.distancia_input.clear()
        else:
            QMessageBox.warning(self, "Error", "Por favor llena ambos nodos.")

    def calcular_camino(self):
        inicio = self.origen_input.text().strip()
        destino = self.destino_input.text().strip()

        if inicio not in self.grafo or destino not in self.grafo:
            QMessageBox.warning(self, "Error", "Ambos nodos deben existir en el grafo.")
            return

        # ===== CAMINO MÁS CORTO: Algoritmo de Dijkstra =====
        distancias = {nodo: float('inf') for nodo in self.grafo}
        distancias[inicio] = 0
        previo = {}
        cola = [(0, inicio)]

        while cola:
            actual_dist, actual_nodo = heapq.heappop(cola)
            for vecino, distancia in self.grafo[actual_nodo]:
                nueva_distancia = actual_dist + distancia
                if nueva_distancia < distancias[vecino]:
                    distancias[vecino] = nueva_distancia
                    previo[vecino] = actual_nodo
                    heapq.heappush(cola, (nueva_distancia, vecino))

        # Reconstruir el camino más corto
        camino_corto = []
        nodo_actual = destino
        while nodo_actual != inicio:
            if nodo_actual not in previo:
                self.resultado_text.setPlainText("No hay camino disponible entre los nodos.")
                return
            camino_corto.insert(0, nodo_actual)
            nodo_actual = previo[nodo_actual]
        camino_corto.insert(0, inicio)

        resultado_corto = f"Camino más corto: {' -> '.join(camino_corto)}\nDistancia total: {distancias[destino]}"

        # ===== CAMINO MÁS LARGO: Búsqueda en Profundidad (DFS) =====
        def dfs(nodo, destino, visitados, camino_actual, distancia_actual):
            if nodo == destino:
                return (camino_actual[:], distancia_actual)
            visitados.add(nodo)
            max_camino = []
            max_distancia = float('-inf')
            for vecino, dist in self.grafo.get(nodo, []):
                if vecino not in visitados:
                    nuevo_camino, nueva_distancia = dfs(vecino, destino, visitados, camino_actual + [vecino], distancia_actual + dist)
                    if nueva_distancia > max_distancia:
                        max_camino = nuevo_camino
                        max_distancia = nueva_distancia
            visitados.remove(nodo)
            return (max_camino, max_distancia)

        camino_largo, distancia_larga = dfs(inicio, destino, set(), [inicio], 0)

        if not camino_largo:
            self.resultado_text.setPlainText("No hay camino disponible entre los nodos.")
            return

        resultado_largo = f"Camino más largo: {' -> '.join(camino_largo)}\nDistancia total: {distancia_larga}"

        # Mostrar ambos resultados en pantalla
        self.resultado_text.setPlainText(f"{resultado_corto}\n\n{resultado_largo}")

    def guardar_resultado(self):
        try:
            with open("resultado_dijkstra.txt", "w", encoding="utf-8") as f:
                f.write(self.resultado_text.toPlainText())
            QMessageBox.information(self, "Guardado", "Resultado guardado en resultado_dijkstra.txt")
        except Exception as e:
            QMessageBox.warning(self, "Error", f"No se pudo guardar el archivo: {e}")

# Punto de entrada de la aplicación
if __name__ == "__main__":
    app = QApplication(sys.argv)
    ventana = DijkstraApp()
    ventana.show()
    sys.exit(app.exec())
