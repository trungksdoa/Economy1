package com.FPT.Economy.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import java.io.IOException;
import java.util.List;




@Controller
public class ProductController {

    @GetMapping("/")
    public String index() {

        return "HomePage";
    }


    // SSE là server-sent events
    // tương tác thời gian thực giữa máy chủ và máy khách dùng SSE thay cho setInterval gởi từ client tới server giúp tăng tốc web
    // và giảm thiểu việc làm chậm load web do setInterval phải gởi request nhiều lần, nếu số lượng yêu cầu gửi đi tăng cao, nó có thể dẫn đến quá tải cho máy chủ.
    // SSE cho phép máy chủ gửi dữ liệu theo thời gian thực đến máy khách mà không cần máy khách phải gửi yêu cầu mới.
    @RequestMapping("/api/stream")
    public SseEmitter stream() throws IOException {
        SseEmitter emitter = new SseEmitter();
        // code để tạo dữ liệu cần gửi
        // ví dụ: List<String> data = ...
        List<String> data = List.of("hello", "world", "java", "programming");
        for (String item : data) {
            emitter.send(SseEmitter.event().data(item));
        }
        emitter.complete();
        return emitter;
    }

    //Xử lý ngoại lệ
    @ExceptionHandler(value = {Exception.class, RuntimeException.class})
    public ResponseEntity<String> handleException(Exception e) {
        // Xử lý ngoại lệ tại đây
        return new ResponseEntity<>("Lỗi: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @ExceptionHandler(value = {Exception.class, IOException.class})
    public ResponseEntity<String> HandleIOException(Exception e) {
        // Xử lý ngoại lệ tại đây

        return new ResponseEntity<>("Lỗi: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}