package builder;

public class UserMain {

    public static void main(String[] args){
        User user = User.UserBuilder.UserBuilder()
                        .username("gahyeon")
                        .password("1234")
                        .build();
    }
}
