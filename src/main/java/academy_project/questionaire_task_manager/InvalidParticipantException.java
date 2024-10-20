package academy_project.questionaire_task_manager;

import java.io.Serializable;

public class InvalidParticipantException extends Exception implements Serializable {
	private static final long serialVersionUID = 1L;
    public InvalidParticipantException(String message) {
        super(message);
    }
}

