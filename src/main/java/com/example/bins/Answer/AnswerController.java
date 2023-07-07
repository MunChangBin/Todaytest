package com.example.bins.Answer;

import com.example.bins.Question.Question;
import com.example.bins.Question.QuestionRepository;
import com.example.bins.Question.QuestionService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/answer")
public class AnswerController {

    private final QuestionRepository questionRepository;
    private final QuestionService questionService;

    @GetMapping("/detail")
    public String detail(){

        return "question_detail";
    }
    @PostMapping("/article/create/{id}")
    public String create(Model model, @PathVariable("id")Integer id , @RequestParam String content){
        Question question =this.questionService.getQuestion(id);

        return String.format("redirect:question/detail/%s",id);
    }
}
