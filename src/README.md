# PROYECTO 'MI SERGAS' :briefcase:

## Descripción:

El presente proyecto tiene como finalidad gestionar los datos de hospitales, médicos y pacientes en la base de datos del SERGAS.

Esto haciendo uso del patrón **MVC**, y el servicio **MySQL**. Más adelante se explica la estructura de la aplicación.

---
## Diagrama de Clases:

```mermaid
classDiagram

PAQUETE CLASES

        class Hospital {
        String: codH
        String: nombreH
        String tipoH
        Integer: nroMedicos
        Integer: nroHabitaciones
        +getters()
        +setters(String)
        }
        class Persona {
        String: codP
        String: nomP
        +getters()
        +setters(String)
        }
        
        Persona "1" *-- "1..n" Medico : association
        Persona "1" *-- "1..n" Paciente : association
        
        class Medico {
        String: codH1
        +getters()
        +setters(String)
        }
        class Paciente {
        String: codMed1
        +getters()
        +setters(String)
        }
        
PAQUETE MODEL
        
         class MHospital {
 
      }
        
```
