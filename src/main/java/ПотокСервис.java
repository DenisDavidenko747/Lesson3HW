import java.util.List;

class ПотокСервис {
    public void сортировкаПотоков(List<Поток> потоки){
        потоки.sort(new StreamComparator());
    }
}


