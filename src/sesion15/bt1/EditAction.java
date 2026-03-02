package sesion15.bt1;
import java.util.Stack;

public class EditAction {
    private String description;
    private String time;

    public EditAction(String description, String time) {
        this.description = description;
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;

    }
    @Override
    public String toString() {
        return "EditAction{" +
                "description='" + description + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}