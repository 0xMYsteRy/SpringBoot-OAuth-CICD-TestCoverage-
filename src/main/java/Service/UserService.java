package Service;

import Entity.User;
import Model.UserModel;

public interface UserService {
    User registerUser(UserModel userModel);
}
