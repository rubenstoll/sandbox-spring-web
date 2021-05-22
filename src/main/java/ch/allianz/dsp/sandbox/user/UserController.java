package ch.allianz.dsp.sandbox.user;

import lombok.Getter;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    // standard constructors
    
    private final UserRepository userRepository;

    @Getter(lazy = true)
    private final Map<String, Long> users = getUsersLazyLoad();

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return (List<User>) userRepository.findAll();
    }

    @PostMapping("/users")
    void addUser(@RequestBody User user) {
        userRepository.save(user);
    }


    private Map<String, Long> getUsersLazyLoad() {

        final Map<String, Long> cache = new HashMap<>();
//        List<String> txnRows = readTxnListFromFile();

//        txnRows.forEach(s -> {
//            String[] txnIdValueTuple = s.split(DELIMETER);
//            cache.put(txnIdValueTuple[0], Long.parseLong(txnIdValueTuple[1]));
//        });

        return cache;
    }
}

