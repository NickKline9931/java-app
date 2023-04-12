public class Main {
    private String name;
    int x;

    public Main(int num, String nam) {
        x = num;
        name = nam;
    }

    public int squareX() {
        return(x * x);
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }
}

