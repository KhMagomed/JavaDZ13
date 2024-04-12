import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTest {
    SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

    String[] subtasks = { "Молоко", "Яйца", "Хлеб" };
    Epic epic = new Epic(55, subtasks);

    Meeting meeting = new Meeting(
            555,
            "Выкатка 3й версии приложения",
            "Приложение НетоБанка",
            "Во вторник после обеда"
    );

    @Test
    public void check(){

       boolean expected = true;
       boolean actual = simpleTask.matches("Позвонить родителям") ;
        Assertions.assertEquals(expected, actual);


    }
    @Test
    public void check2(){

        boolean expected = true;
        boolean actual = epic.matches("Молоко") ;
        Assertions.assertEquals(expected, actual);


    }
    @Test
    public void check3(){

        boolean expected = true;
        boolean actual = meeting.matches("Выкатка") ;
        Assertions.assertEquals(expected, actual);


    }


}
