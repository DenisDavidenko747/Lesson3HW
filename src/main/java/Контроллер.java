import java.util.List;

class Контроллер {
    private ПотокСервис потокСервис;

    public Контроллер(ПотокСервис потокСервис){
        this.потокСервис = потокСервис;
    }

    public void сортировкаПотоков(List<Поток> потоки){
        потокСервис.сортировкаПотоков(потоки);
    }
}
