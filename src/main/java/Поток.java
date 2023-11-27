import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class Поток implements Iterable<УчебнаяГруппа> {
    private List<УчебнаяГруппа> группы;

    public Поток(){
        группы = new ArrayList<>();
    }

    public void добавитьГруппу(УчебнаяГруппа группа) {
        группы.add(группа);
    }

    @Override
    public Iterator<УчебнаяГруппа> iterator(){
        return группы.iterator();
    }

}
