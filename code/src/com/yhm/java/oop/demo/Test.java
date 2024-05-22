package com.yhm.java.oop.demo;

public class Test {
    public static void main(String[] args) {
        Movie[] movies = new Movie[4];
        Movie m1 = new Movie(1, 38.9, "水门桥", 9.8, "徐克", "吴京", "12万人想看");
        Movie m2 = new Movie(1, 38.9, "水门桥", 9.8, "徐克", "吴京", "12万人想看");
        Movie m3 = new Movie(1, 38.9, "水门桥", 9.8, "徐克", "吴京", "12万人想看");
        Movie m4 = new Movie(1, 38.9, "水门桥", 9.8, "徐克", "吴京", "12万人想看");

        movies[0] = m1;
        movies[1] = m2;
        movies[2] = m3;
        movies[3] = m4;

        MovieOperator mop = new MovieOperator(movies);
        mop.printAllMovies();
    }
}
