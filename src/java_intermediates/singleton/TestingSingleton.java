package java_intermediates.singleton;

public class TestingSingleton {
    public static void main(String[] args) {
        LearnSingleton obj = LearnSingleton.getInstance();
        LearnSingleton obj2 = LearnSingleton.getInstance();
        LearnSingleton obj3 = LearnSingleton.getInstance();
        System.out.println(obj);
        System.out.println(obj2);
        System.out.println(obj3);


    }
    }
