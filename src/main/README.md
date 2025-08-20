# Laboratorios de Práctica en Programación Orientada a Objetos

Conceptos básicos de **instancias**, **clases abstractas** y **propiedades/funciones estáticas** en programación orientada a objetos.

---

## 1️⃣ Concepto: **Instancia**

### 🟢 Ejercicio Básico
Crea una clase `Coche` con las propiedades `marca` y `modelo`.  
Crea dos instancias diferentes de la clase y muestra sus valores por pantalla para comprobar que son objetos independientes.

---

### 🟡 Ejercicio de Mejora
Crea una clase `Persona` con nombre y edad.  
Agrega un método que permita cambiar la edad.  
Crea tres instancias diferentes y demuestra cómo cada una mantiene su propio estado al cambiar la edad de una de ellas.

---

### 🔴 Ejercicio de Prueba
Diseña una clase `CuentaBancaria` con saldo inicial y métodos para `depositar` y `retirar`.  
Crea varias instancias y asegúrate de que cada cuenta maneja correctamente su propio saldo, sin afectar al de las demás.

---

## 2️⃣ Concepto: **Clase Abstracta**

### 🟢 Ejercicio Básico
Crea una clase abstracta `Animal` que tenga un método abstracto `hacerSonido()`.  
Crea una clase `Perro` que implemente este método mostrando "Guau".

---

### 🟡 Ejercicio de Mejora
Extiende el ejercicio anterior añadiendo otra clase `Gato` que implemente `hacerSonido()` mostrando "Miau".  
Crea una lista de animales y recórrela llamando al método `hacerSonido()` para cada uno.

---

### 🔴 Ejercicio de Prueba
Crea una clase abstracta `FiguraGeometrica` con un método abstracto `calcularArea()`.  
Implementa `Circulo` y `Rectangulo`.  
Crea un programa que reciba una lista de figuras y calcule el área total de todas ellas usando polimorfismo.

---

## 3️⃣ Concepto: **Propiedad o Función Static**

### 🟢 Ejercicio Básico
Crea una clase `Contador` con una propiedad estática que lleve la cuenta de cuántas instancias de la clase se han creado.  
Muestra el valor de esa propiedad tras crear varias instancias.

---

### 🟡 Ejercicio de Mejora
Agrega a la clase `Contador` un método estático `reiniciarContador()` que ponga el contador en cero.  
Comprueba su funcionamiento creando instancias antes y después de reiniciar el contador.

---

### 🔴 Ejercicio de Prueba
Diseña una clase `ConversorMonedas` con un método estático `euroADolar()` que convierta un monto en euros a dólares según una tasa de cambio.  
Permite cambiar la tasa de cambio con otro método estático y demuestra su efecto en distintas conversiones sin crear instancias.

---

## 4️⃣ Ejercicio Final: **Mezclando Todo**

Crea un programa que cumpla los siguientes requisitos:
- Una **clase abstracta** `Vehiculo` con métodos abstractos `acelerar()` y `frenar()`.
- Dos clases concretas `Coche` y `Moto` que hereden de `Vehiculo`.
- Una propiedad **estática** en `Vehiculo` llamada `totalVehiculos` que cuente cuántos vehículos se han creado (sumando coches y motos).
- Crea varias **instancias** de cada clase y simula aceleraciones y frenadas.
- Muestra el número total de vehículos creados al final del programa.

---