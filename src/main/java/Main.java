public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.surname = "Ивнов";
        post.patronymic = "Иванович";
        post.passport = "4444 № 44444444";
        post.telephone ="+7 (999)-999-99-99";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 12;
        post.birthday.year = 1985   ;
    }
}