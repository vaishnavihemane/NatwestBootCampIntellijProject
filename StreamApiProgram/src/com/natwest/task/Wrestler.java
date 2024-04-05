package com.natwest.task;

public class Wrestler {

        private int id;
        private String name;
        private double weight;
        private int height;
        private int age;

        public Wrestler(int id, String name, double weight, int height, int age) {
            this.id = id;
            this.name = name;
            this.weight = weight;
            this.height = height;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Wrestler{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", weight=" + weight +
                    ", height=" + height +
                    ", age=" + age +
                    '}';
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }



}
