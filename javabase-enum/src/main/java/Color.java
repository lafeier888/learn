public enum Color {
    RED("我是红色"),
    Blue("我是蓝色");
    String desccription;

    Color(String desccription) {
        this.desccription = desccription;
    }

    public String getDescription() {
        return this.desccription;
    }
}
