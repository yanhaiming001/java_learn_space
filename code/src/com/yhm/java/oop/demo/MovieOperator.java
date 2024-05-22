package com.yhm.java.oop.demo;

public class MovieOperator {
    private Movie[] movies;


    public MovieOperator(Movie[] movies) {
        this.movies = movies;
    }

    //展示系统全部电影信息[movie1、movie2]
    public void printAllMovies() {
        System.out.println("=======================电影全部信息如下：=======================");
        for (int i = 0; i < this.movies.length; i++) {
            Movie m = movies[i];
            System.out.println("编号:" + m.getId());
            System.out.println("名称:" + m.getName());
            System.out.println("价格:" + m.getPrice());
            System.out.println("========================");
        }

    }
}
