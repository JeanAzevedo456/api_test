package api_test.ds.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import api_test.ds.models.Task;
import api_test.ds.models.User;
import api_test.ds.repositories.TaskRepository;


@Service 
public class TaskService {

    @Autowired 
    private TaskRepository taskRepository;
    @Autowired 
    private UserRepository userService;
    
}
