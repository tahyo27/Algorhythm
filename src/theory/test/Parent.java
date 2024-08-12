package theory.test;

public class Parent {

    private String title = "제목입니다";

    public Parent() {

    }
    public Parent(String message) {
        this.title = message;
    }

    public String getTitle() {
        return this.title;
    }
}
