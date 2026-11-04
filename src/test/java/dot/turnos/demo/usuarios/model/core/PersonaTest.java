package dot.turnos.demo.usuarios.model.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonaTest {

    @Test
    void testPersonaConstructorYGetters() {

        Persona persona = new Persona("Maria", 10203040, 22, "3001234567") {};

        persona.setId(1L);

        assertEquals(1L, persona.getId());
        assertEquals("Maria", persona.getNombre());
        assertEquals(10203040, persona.getDocumento());
        assertEquals(22, persona.getEdad());
        assertEquals("3001234567", persona.getTelefono());
    }
}