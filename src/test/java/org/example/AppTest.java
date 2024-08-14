package org.example;

import org.junit.*;

public class AppTest {

    @BeforeClass
    public static void beforeClass(){
        System.out.println("run before class");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("run after class");
    }

    @Before
    public void beforeMethod(){
        System.out.println("Run before each test method");
    }
    @After
    public void afterMethod(){
        System.out.println("Run before each after method");
    }

    @Test
    public void testCat() {
        System.out.println("method");
        Cat cat = new Cat();
        Assert.assertEquals("I'am a cat", cat.whoIam());
    }

    @Test
    public void testDog() {
        System.out.println("method");
        Dog dog = new Dog();
        Assert.assertEquals("I'am a dog", dog.whoIam());
    }

    @Test
    public void testPig() {
        System.out.println("method");
        Pig pig = new Pig();
        Assert.assertTrue("I'am a pig".equalsIgnoreCase(pig.whoIam()));
    }
    @Test
    public void testAnimal() {
        System.out.println("method");
        Pig pig = new Pig();
        Assert.assertEquals("I'am a pig",((Animal)pig).whoIam());
    }

}
