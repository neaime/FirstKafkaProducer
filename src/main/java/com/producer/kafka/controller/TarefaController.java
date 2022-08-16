package com.producer.kafka.controller;

import com.producer.kafka.service.TarefaProducerService;
import com.producer.kafka.dto.TarefaDto;
import com.producer.kafka.model.Tarefa;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/kafka")
public class TarefaController {
    private final TarefaProducerService tarefaProducerService;

    @Autowired
    private ModelMapper mapper;

    @PostMapping(value = "/tarefa")
    public void save(@RequestBody TarefaDto tarefaDto) {
        Tarefa tarefa = mapper.map(tarefaDto, Tarefa.class);

        tarefaProducerService.saveTarefa(tarefa);
    }
}