public interface Корабель {
    void пливти();
    void зупинитися();
}

abstract class ВійськовийКорабель implements Корабель {
    private String ім'я;
    private int кількістьВогневоїСили;

    public ВійськовийКорабель(String ім'я, int кількістьВогневоїСили) {
        this.ім'я = ім'я;
        this.кількістьВогневоїСили = кількістьВогневоїСили;
    }

    public String getІм'я() {
        return ім'я;
    }

    public int getКількістьВогневоїСили() {
        return кількістьВогневоїСили;
    }

    @Override
    public void пливти() {
        System.out.println(ім'я + " пливе.");
    }

    @Override
    public void зупинитися() {
        System.out.println(ім'я + " зупинився.");
    }

    public abstract void вогонь();
}

class Авіаносець extends ВійськовийКорабель {
    private int кількістьЛітаків;

    public Авіаносець(String ім'я, int кількістьВогневоїСили, int кількістьЛітаків) {
        super(ім'я, кількістьВогневоїСили);
        this.кількістьЛітаків = кількістьЛітаків;
    }

    public int getКількістьЛітаків() {
        return кількістьЛітаків;
    }

    @Override
    public void вогонь() {
        System.out.println(getІм'я() + " вистрілює з літаків!");
    }

    public void запуститиЛітаки() {
        System.out.println(getІм'я() + " запускає літаки в повітря.");
    }

    public static void main(String[] args) {
        Авіаносець авіаносець = new Авіаносець("USS Enterprise", 100, 50);

        авіаносець.пливти();
        авіаносець.вогонь();
        авіаносець.запуститиЛітаки();
        авіаносець.зупинитися();
    }
}
