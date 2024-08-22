package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("Jake","1234");
        userList.addUser("Jane","5678");
        userList.addUser("Jack","1111");


        // TODO: find one of them
        User user = userList.findUserByUsername("Jake");

        // TODO: assert that UserList found User
         String expected = "Jake";
         String actual = user.getUsername();
         assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("Jake","1234");
        userList.addUser("Jane","5678");
        userList.addUser("Jack","1111");

        // TODO: change password of one user
        boolean actual = userList.changePassword("Jake","1234","5555");

        // TODO: assert that user can change password
        assertTrue(actual);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("Jake","1234");
        userList.addUser("Jane","5678");
        userList.addUser("Jack","1111");


        // TODO: call login() with correct username and password
        User actual = userList.login("Jack","1111");

        // TODO: assert that User object is found
        User expected = userList.findUserByUsername("Jack");
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("Jake","1234");
        userList.addUser("Jane","5678");
        userList.addUser("Jack","1111");

        // TODO: call login() with incorrect username or incorrect password
        User actual = userList.login("Jane","1234");
        // TODO: assert that the method return null
        assertNull(actual);
    }

}