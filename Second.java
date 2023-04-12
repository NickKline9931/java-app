class Second {
    public static void main(String[] args) {
        Main myObj = new Main(5, "MYOBJ");
        System.out.println(myObj.getName());
        Main sec = new Main(10, "SECOND");
        System.out.println(sec.getName());
        System.out.println(" ");
        myObj.setName("Eks");
        sec.setName("Sec");

        System.out.println(myObj.getName());
        System.out.println(myObj.x);
        System.out.println(myObj.squareX());
        System.out.println(" ");
        System.out.println(sec.getName());
        System.out.println(sec.x);
        System.out.println(sec.squareX());
    }
}