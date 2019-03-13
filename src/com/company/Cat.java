package com.company;

public class Cat {

    private String name;
    private int age;

    /* public Cat() {} */

    public Cat(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    @Override
    public String toString() {
        return "Cat{" + "name='" + name + '\'' + ", age=" + age + '}';
    }

    private void setAge(int age) {

        if (age > 0 && age < 30) this.age = age;
        else System.out.println("\nYou've putted wrong age!!!\n As I know cat age can be in this range [1;30]\n ;)");

    }

    public int getAge() {
        return age;
    }

    private void setName(String name) {

        if (!name.isEmpty()) this.name = name;
        else System.out.println("\nYou haven't wrote name ;(\n");
    }

    public String getName() {
        return name;
    }

    public void getVoice() {
        System.out.println(this.name + ": Meow! Meow! Meow!");
    }

    public void move() {
        int temp = 0 + (int) (Math.random() * 2);
        switch (temp) {
            case 0:
                System.out.println(this.name + " is eating\n");
                break;
            case 1:
                System.out.println(this.name + " is sleeping\n");
                break;
        }
    }

}
