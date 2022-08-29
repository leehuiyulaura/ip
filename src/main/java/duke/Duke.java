package duke;

import java.io.IOException;
import duke.functions.*;

/**
 * Duke bot class.
 * @author lauralee
 */
public class Duke {

    // Ui instance for this user which handles all user interactions with Duke.
    private Ui newUser;

    // Tasklist object stores tasks added by the user into Duke.
    private TaskList userTaskList;

    // Storage object saves the list of tasks inputted by the user into a file with a specified file path.
    private Storage data;

    /**
     * Constructor for Duke class which initialises the Duke bot.
     * @param filePath String of pathname of file which this users inputs will be stored in.
     * @throws IOException
     */
    public Duke(String filePath) throws IOException {
        this.newUser = new Ui();
        this.userTaskList = newUser.getTaskList();
        this.data = new Storage(this.userTaskList, filePath);
    }

    public static void main(String[] args) throws IOException {
        new Duke("duke.txt");
    }

}

