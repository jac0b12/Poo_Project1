import { useEffect, useState } from 'react'
import './App.css'

function App() {
  const [turnos, setTurnos] = useState([])

  useEffect(() => {

    fetch('http://localhost:8080/api/turnos')
        .then(respuesta => respuesta.json())
        .then(datos => {
          console.log("Turnos recibidos del backend:", datos)
          setTurnos(datos)
        })
        .catch(error => console.error("Error conectando con Spring Boot:", error))
  }, [])

  return (
      <div className="contenedor">
        <h1>Turnos de Atención Ciudadana</h1>
        <div className="lista">
          {turnos.length === 0 ? (
              <p>No hay turnos registrados o Spring Boot está apagado...</p>
          ) : (
              turnos.map(turno => (
                  <div className="tarjeta" key={turno.numero}>
                      <h2>Turno ID: {turno.numero}</h2>
                    {/* Ajusta "estado" o "prioridad" si tus atributos en Java se llaman distinto */}
                    <p><strong>Estado:</strong> {turno.estado}</p>
                  </div>
              ))
          )}
        </div>
      </div>
  )
}

export default App