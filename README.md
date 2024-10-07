![Badge-Conversor](https://github.com/user-attachments/assets/01ecc732-7ed9-4800-b9a0-51e397a57b3f)
# Conversor de Monedas

Este proyecto es una aplicación de consola que permite convertir valores entre distintas monedas usando datos obtenidos de una API de tasas de cambio. El programa soporta conversiones entre Dólares Americanos (USD), Pesos Argentinos (ARS), Reales Brasileños (BRL) y Pesos Colombianos (COP).

## Descripción

La aplicación realiza solicitudes a la API [ExchangeRate-API](https://www.exchangerate-api.com) para obtener las tasas de conversión más recientes. Con estas tasas, permite al usuario convertir entre USD y otras tres monedas: ARS, BRL y COP, tanto en ambos sentidos.

El programa está compuesto por dos clases principales:

- **Main**: Maneja la lógica de interacción con el usuario, realizando las conversiones.
- **Conversor**: Clase que almacena las tasas de conversión y proporciona acceso a los valores.

### Funcionalidades

1. Conversión de USD a ARS (Pesos Argentinos) y viceversa.
2. Conversión de USD a BRL (Reales Brasileños) y viceversa.
3. Conversión de USD a COP (Pesos Colombianos) y viceversa.
