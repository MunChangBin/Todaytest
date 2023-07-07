package com.example.bins;

import com.example.bins.Question.Question;
import com.example.bins.Question.QuestionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class BinsApplicationTests {

	@Autowired
	private QuestionRepository questionRepository;
	@Test
	void contextLoads() {
		Question q1 = new Question();
		q1.setSubject("시험잘치자 아자");
		q1.setContent("화이팅");
		q1.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(q1);

		Question q2 = new Question();
		q2.setSubject("공부공부....");
		q2.setContent("공부...어렵다 기억이 안나네");
		q2.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(q2);
	}

}
