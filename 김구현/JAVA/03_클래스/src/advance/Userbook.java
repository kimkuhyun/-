package advance;

import basic.User_03;

public class Userbook {

    public User_03[] userId = new User_03[100];

    int index = 0;

    public void saveUserInfo(String name, String pass) {
        User_03 a = new User_03();
        a.setName(name);
        a.setPassword(pass);
        a.setId(index);
        userId[index] = a;
        index++;
    }









}
