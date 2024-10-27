package academy_project.questionaire_task_manager;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ParticipantTest {
    @Test
    public void testParticipantInitialization() {
        Participant participant = new Participant("Alice", 30, "O", "AA", false);
        assertEquals("Alice", participant.getName());
        assertEquals(30, participant.getAge());
        assertEquals("O", participant.getBloodType());
        assertEquals("AA", participant.getGenotype());
        assertFalse(participant.isHasHealthConditions());
    }
    
    
    @Test
    public void testIsEligible_IneligibleParticipant() {
        Trial trial = new Trial();
        Participant ineligibleParticipant = new Participant("Charlie", 35, "A", "AO", false);
        assertFalse(trial.isEligible(ineligibleParticipant)); // Check ineligibility
    }
}

