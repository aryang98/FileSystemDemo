package com.example.filesystem.service;

import com.example.filesystem.dto.UserDto;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;

public interface UserService {
    void saveUsersFromFile(MultipartFile file) throws Exception;
    List<UserDto> getAllUsers();
    byte[] exportUsersToExcel();
    byte[] exportUsersToCsv();
} 