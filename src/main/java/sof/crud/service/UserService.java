package sof.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sof.crud.model.User;
import sof.crud.repositry.UserRepository;
import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public User save(User user) {
        return userRepository.save(user);
    }


    public User show(Long id) {
        return userRepository.findById(id).orElse(null);

    }

    public void update(User updatedUser) {
        userRepository.save(updatedUser);
    }

    public void delete(Long id) {
        userRepository.deleteById(id);
    }


    public List<User> index() {
        return userRepository.findAll();
    }


}
