package com.producer.kafka.model;

public class Tarefa {
    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
