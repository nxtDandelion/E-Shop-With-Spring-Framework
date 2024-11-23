package com.ecommerce.shop;

import jakarta.persistence.*;

@Entity
@Table(name = "games")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String game_name;

    @Column(length = 1000)
    private String game_description;

    private Integer game_price;

    @Column(name = "image_url")
    private String imagePath;

    public Game(){};

    public Game(String name, String description, Integer price, String imagePath){
        this.game_name = name;
        this.game_description = description;
        this.game_price = price;
        this.imagePath = imagePath;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return game_name;
    }

    public String getDescription() {
        return game_description;
    }

    public String getImagePath() {
        return imagePath;
    }

    public Integer getPrice() {
        return game_price;
    }
}
