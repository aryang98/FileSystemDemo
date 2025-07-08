package com.example.filesystem.service.impl;

import com.example.filesystem.dto.UserDto;
import com.example.filesystem.entity.User;
import com.example.filesystem.mapper.UserMapper;
import com.example.filesystem.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class UserServiceImplTest {
    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserServiceImpl userService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetAllUsers() {
        User user1 = User.builder().id(1L).name("Alice").email("alice@example.com").age(25).build();
        User user2 = User.builder().id(2L).name("Bob").email("bob@example.com").age(30).build();
        when(userRepository.findAll()).thenReturn(Arrays.asList(user1, user2));

        List<UserDto> users = userService.getAllUsers();
        assertEquals(2, users.size());
        assertEquals("Alice", users.get(0).getName());
        assertEquals("Bob", users.get(1).getName());
    }
} 