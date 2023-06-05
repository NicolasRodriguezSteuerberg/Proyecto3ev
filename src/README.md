# PROYECTO 'MI SERGAS' :briefcase:

## Descripción:

El presente proyecto tiene como finalidad gestionar los datos de hospitales, médicos y pacientes en la base de datos del SERGAS.

Esto haciendo uso del patrón **MVC**, y el servicio **MySQL**.

Si nos referimos a las principales funciones del programa, podemos decir que son: agregar, modificar y eliminar pacientes/medicos/hospitales (considerando las características principales que puede llevar respectivo rol), además de poder cuantificar el número de médicos que hay según el hospital consultado.
Todo esto, respetando una clave única y primaria para cada uno de los tipos de datos a manejar.

A continuación, se esquematiza la estructura de la aplicación.

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
        +toString()
        }
        
        class Persona {
        String: codP
        String: nomP
        +getters()
        +setters(String)
        +toString()
        }
        
        Persona "1" *-- "1..n" Medico : extends
        Persona "1" *-- "1..n" Paciente : extends
        
        class Medico {
        String: codH1
        +getters()
        +setters(String)
        +toString()
        }
        class Paciente {
        String: codMed1
        +getters()
        +setters(String)
        +toString()
        }
        
PAQUETE MODEL
        
         class GestionBases {
        String: bd
        String url
        String user
        String password
        String driver
        Connection cx
        +conectar()
        +crearArrayList(ArrayList~Hospital~lHospital,ArrayList~Medico~lMedico,ArrayList~Paciente~lPaciente)
        +desconectar()
      }
      
      MHospital "1" --* "1" GestionBases : association
      MMedico "1" --* "1" GestionBases : association
      MPaciente "1" --* "1" GestionBases : association
      
        class MHospital{
        GestionBases auxCon
        Integer numeroAModificar
        Integer verificacion
        +crearHospital(ArrayList~Hospital~,JLabel label)
        +modificarHospital(ArrayList~Hospital~lista,String codH,JLabel label)
        +eliminarHospital(ArrayList~Hospital~lista,String codH,JLabel label)
        +modificarArray(ArrayList~Hospital~lista,String codH,String nombreH, String tipoH, int nroHabitaciones)
        +cambiarNroMedicos(ArrayList~Hospital~lista,JLabel label)
        }
        
        class MMedico{
        GestionBases auxCon
        Integer numeroAModificar
        Integer verificacion
        +crearMedico(ArrayList~Medico~,JLabel label)
        +modificarHospital(ArrayList~Medico~lista,String codM,JLabel label)
        +eliminarHospital(ArrayList~Medico~lista,String codM,JLabel label)
        +modificarArray(ArrayList~Medico~lista,String codM,String nombreM, String codH)
        }
        
        class MPaciente{
        GestionBases auxCon
        Integer numeroAModificar
        Integer verificacion
        +crearPaciente(ArrayList~Paciente~,JLabel label)
        +modificarPaciente(ArrayList~Paciente~lista,String codP,JLabel label)
        +eliminarHospital(ArrayList~Paciente~lista,String codP,JLabel label)
        +modificarArray(ArrayList~Paciente~lista,String codP,String nombreP, String codM)
        }
        

PAQUETE CONTROLLER

        class Controller{
        ArrayList lHospital
        ArrayList lMedico
        ArrayList lPaciente
        MHospital obxH
        MMedico obxM
        MPaciente obxP
        Vista miVista
        +añadirObserver()
        +crearArrays()
        +crearPaciente(String codP, String nomP,String codM, JLabel label)
        +crearMedico(String codM, String nomM,String codH, JLabel label)
        +crearHospital(String codH, String nombreH, String tipoH, int nroHabitaciones, JLabel label)
        +modificarPaciente(String codP,String nomP,String codM, JLabel label)
        +modificarMedico(String codM,String nomM,String codH, JLabel label)
        +modificarHospital(String codH, String nombreH, String tipoH, int nroHabitaciones, JLabel label)
        +eliminarPaciente(String codP, JLabel label)
        +eliminarMedico(String codM, JLabel label)
        +eliminarHospital(String codH, JLabel label)
        +cambiarPaneles(int numero)
        +crearTabla(int numero)
        }
        
        Controller "1" *-- "1" MHospital : association
        Controller "1" *-- "1" MMedico : association
        Controller "1" *-- "1" MPaciente : association
        
        class Observable {
        setChanged()
        notifyObserver(valor)
        }
        
        Observable <|-- MHospital:extends
        Observable <|-- MMedico:extends
        Observable <|-- MPaciente:extends
        
        class ObserverTablas{
        String aux
        +update()
        }
        
        Controller "1" *-- "1" ObserverTablas: association
        
PAQUETE VIEW
        
        class Vista{
        Controller miController
        Integer panelMenu=0
        Integer panelHospital=1
        Integer panelMedico=2
        Integer panelPaciente=3
        Integer TABLAHOSPITAL=1
        Integer TABLAMEDICO=2
        Integer TABLAPACIENTE=3
        JPanel pMenu
        pHospital pH
        pMedico pM
        pPaciente pP
        IMenu ventana
        +crearPaneles()
        +quitarPaneles()
        +visualizarMenu()
        +visualizarHospital()
        +visualizarMedico()
        +visualizarPaciente()
        +crearTabla()
        }
     
        Controller "1" *-- "1" Vista : association
        
        class pHospital{
        +actionListeners()
        }
        
        class pMedico{
        +actionListeners()
        }
        
        class pPaciente{
        +actionListeners()
        }
        
        class IMenu{
        +actionListeners()
        }
        
        Vista "1" *-- "1" IMenu : association
        Vista "1" *-- "1" pHospital : association
        Vista "1" *-- "1" pMedico : association
        Vista "1" *-- "1" pPaciente : association

MAIN
        class App{
          +main()
      }
      
      App "1" *-- "1" Controller : association
```
## Diagrama de Secuencias:

