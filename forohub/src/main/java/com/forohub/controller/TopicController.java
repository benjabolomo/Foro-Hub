package com.forohub.controller;

import com.forohub.model.Topic;
import com.forohub.repository.TopicRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/topics")
public class TopicController {

    @Autowired
    private TopicRepository topicRepository;

    @PostMapping
    public ResponseEntity<Topic> createTopic(@Valid @RequestBody Topic topic) {
        if (topicRepository.existsById(topic.getId())) {
            return ResponseEntity.badRequest().build();
        }
        Topic savedTopic = topicRepository.save(topic);
        return ResponseEntity.ok(savedTopic);
    }

    @GetMapping
    public List<Topic> getAllTopics() {
        return topicRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Topic> getTopicById(@PathVariable Long id) {
        Optional<Topic> topic = topicRepository.findById(id);
        return topic.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Topic> updateTopic(@PathVariable Long id, @Valid @RequestBody Topic topicDetails) {
        Optional<Topic> topicOptional = topicRepository.findById(id);
        if (topicOptional.isPresent()) {
            Topic topic = topicOptional.get();
            topic.setTitle(topicDetails.getTitle());
            topic.setMessage(topicDetails.getMessage());
            topic.setStatus(topicDetails.getStatus());
            topic.setAuthor(topicDetails.getAuthor());
            topic.setCourse(topicDetails.getCourse());
            Topic updatedTopic = topicRepository.save(topic);
            return ResponseEntity.ok(updatedTopic);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTopic(@PathVariable Long id) {
        if (topicRepository.existsById(id)) {
            topicRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}