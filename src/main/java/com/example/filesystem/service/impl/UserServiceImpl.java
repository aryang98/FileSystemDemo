package com.example.filesystem.service.impl;

import com.example.filesystem.dto.UserDto;
import com.example.filesystem.entity.User;
import com.example.filesystem.mapper.UserMapper;
import com.example.filesystem.repository.UserRepository;
import com.example.filesystem.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public void saveUsersFromFile(MultipartFile file) throws Exception {
        // TODO: Implement file parsing, validation, and saving
    }

    @Override
    public List<UserDto> getAllUsers() {
        return userRepository.findAll().stream()
                .map(UserMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public byte[] exportUsersToExcel() {
        // TODO: Implement Excel export
        return new byte[0];
    }

    @Override
    public byte[] exportUsersToCsv() {
        // TODO: Implement CSV export
        return new byte[0];
    }
} 