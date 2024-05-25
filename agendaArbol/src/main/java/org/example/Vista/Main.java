package org.example.Vista;
import org.example.Modelo.Contacto;
import org.example.Servicio.Agenda;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        // Agregar contactos
        agenda.agregarContacto("Oscar", 123456789L, "Oscar@example.com", LocalDate.of(1990, 5, 10));
        agenda.agregarContacto("Martin", 987654321L, "Martin@example.com", LocalDate.of(1988, 8, 15));
        agenda.agregarContacto("Gisselle", 234356789L, "Gisselle@example.com", LocalDate.of(1992, 2, 20));
        // Añadir más contactos según sea necesario...

        // Mostrar contactos
        System.out.println("Contactos en la agenda:");
        agenda.mostrarContactos();

        // Buscar un contacto
        System.out.println("\nBuscando el contacto de Link:");
        Contacto contacto = agenda.buscarContacto("Link");
        if (contacto != null) {
            System.out.println("Nombre: " + contacto.getNombre() +
                    ", Teléfono: " + contacto.getTelefono() +
                    ", Correo: " + contacto.getCorreoElectronico() +
                    ", Fecha de Nacimiento: " + contacto.getFechaNacimiento());
        } else {
            System.out.println("Contacto no encontrado.");
        }

        // Eliminar un contacto
        System.out.println("\nEliminando el contacto de Marina y Pamela.");
        agenda.eliminarContacto("Marina");
        agenda.eliminarContacto("Pamela");

        // Mostrar contactos después de la eliminación
        System.out.println("Contactos en la agenda después de eliminar a Marina y pamela:");
        agenda.mostrarContactos();
    }
}
