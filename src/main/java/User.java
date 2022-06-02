
import lombok.Data;

import java.util.ArrayList;

@Data
public class User {

    private String email;

    private String firstName;

    private String lastName;

    private ArrayList<Calendar> calendars;
}
