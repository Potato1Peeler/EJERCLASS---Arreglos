class depart:
    def __init__(self):
        self.departamentos = [ "Ropa", "Deportes", "Jugueteria" ]
        self.datos= [[ 0 for _ in range(len(self.departamentos))] for _ in range(12)]
        self.meses = ["Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"]
    
    def encontrar_indice(self, vector, dato):
        for i in range(len(vector)):
            if vector[i] == dato:
                return i
        raise ValueError(f"El dato '{dato}' no está en el vector.")
    
    def poner_ventas_mensuales(self, departamento, ventas_mensuales):
        if departamento not in self.departamentos:
            raise ValueError(f"El departamento '{departamento}' no existe.")
        
        dept_index = self.encontrar_indice(self.departamentos, departamento)
        
        for mes, ventas in ventas_mensuales.items():
            if mes not in self.meses:
                raise ValueError(f"El mes '{mes}' no existe.")
            
            mes_index = self.encontrar_indice(self.meses, mes)
            self.datos[mes_index][dept_index] = ventas
    
    def buscar_ventas(self, mes, departamento):
        buscar_mes=self.encontrar_indice(self.meses, mes)
        buscar_departamento=self.encontrar_indice(self.departamentos, departamento)

        return self.datos[buscar_mes][buscar_departamento]
    
    def eliminar_ventas(self, departamento):
        buscar_departamento= self.encontrar_indice(self.departamentos, departamento)
        
        for i in range(12):
            self.datos[i][buscar_departamento] = 0
    
    def matriz_ventas(self):
        print("Mes ---- Ropa ---- Deportes ---- Jugueteria ")
        for fila in range(12):
            print(f"{self.meses[fila]:10} {self.datos[fila][0]:7} {self.datos[fila][1]:10} {self.datos[fila][2]:12}")

tienda =depart()

ventas_ropa = {
    "Enero": 1000,
    "Febrero": 1100,
    "Marzo": 1200,
    "Abril": 1300,
    "Mayo": 1400,
    "Junio": 1500,
    "Julio": 1600,
    "Agosto": 1700,
    "Septiembre": 1800,
    "Octubre": 1900,
    "Noviembre": 2000,
    "Diciembre": 2100
}
ventas_Deportes= {
    "Enero": 5001,
    "Febrero": 100,
    "Marzo": 3200,
    "Abril": 3100,
    "Mayo": 5400,
    "Junio": 1000,
    "Julio": 20000,
    "Agosto": 50000,
    "Septiembre": 11800,
    "Octubre": 1900,
    "Noviembre": 98000,
    "Diciembre": 12100
}

ventas_Jugueteria= {
    "Enero": 100,
    "Febrero": 890,
    "Marzo": 3764,
    "Abril": 8922,
    "Mayo": 8971,
    "Junio": 5673,
    "Julio": 8721,
    "Agosto": 5420,
    "Septiembre": 5678,
    "Octubre": 1128,
    "Noviembre": 12974,
    "Diciembre": 142170,
}



tienda.poner_ventas_mensuales("Ropa", ventas_ropa)
tienda.poner_ventas_mensuales("Deportes", ventas_Deportes)
tienda.poner_ventas_mensuales("Jugueteria", ventas_Jugueteria)


ventas_mes = input(" Ingrese el mes a buscar: ")
ventas_depart = input(" Ingrese el departamento a buscar: ")
ventas_febrero_deportes = tienda.buscar_ventas(f"{ventas_mes}", f"{ventas_depart}")
print(f" La venta del mes buscado es: {ventas_febrero_deportes}")

tienda.matriz_ventas()


ventas_depart_eliminar=input(" De que departamento deseas eliminar las ventas? ")
tienda.eliminar_ventas(f"{ventas_depart_eliminar}")
print(" \nVentas luego de elminar el departamento Ropa ")
tienda.matriz_ventas()



