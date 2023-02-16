package com.example.mongoandsql.service;

import com.example.mongoandsql.domain.maria.User;
import com.example.mongoandsql.domain.mongo.MongoPost;
import com.example.mongoandsql.dto.TestReqDto;
import com.example.mongoandsql.repo.MongoPostRepository;
import com.example.mongoandsql.repo.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class TestService {
    private final MongoPostRepository mongoPostRepository;
    private final UserRepository userRepository;

    @Transactional
    public ResponseEntity<?> post(TestReqDto testReqDto) {

        User u = userRepository.findById(testReqDto.getSeq()).orElseThrow(
                () -> new IllegalArgumentException("유저없음")
        );
//        MongoPost mongoPost = MongoPost.builder()
//                .userSeq(testReqDto.getSeq())
//                .contents(testReqDto.getContents()).build();
//
//        mongoPostRepository.insert(mongoPost);
        return ResponseEntity.ok().body("OK");
    }
}
