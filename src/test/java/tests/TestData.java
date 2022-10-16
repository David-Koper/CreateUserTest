package tests;

import com.github.javafaker.Faker;


public class TestData {

    Faker faker = new Faker();
    String email = faker.internet().emailAddress() ;//"qwerty_45@mail.com",
    String name = faker.funnyName().name() ;//"Рест 6_345",
    String tasks = String.valueOf(faker.number().numberBetween(10, 19)); //[12],
    String companies = String.valueOf(faker.number().numberBetween(10, 99)); //[36, 37],
    String hobby = faker.yoda().quote(); //"Стрельба из лука, Настолки",
    String adres = faker.country().name(); //"адрес 1",
    String name1 = faker.backToTheFuture().character();// "Тестовый, ясен пень",
    String surname1 = faker.lordOfTheRings().character(); //"Иванов",
    String fathername1 = faker.hobbit().character(); //"Петров",
    String cat = faker.cat().name() ; //"Маруся",
    String dog = faker.dog().name(); //"Ушастый",
    String parrot = faker.rickAndMorty().character() ; //"Васька",
    String cavy = faker.elderScrolls().dragon(); //"Кто ты?",
    String hamster = faker.elderScrolls().firstName() ; //"Хомяк",
    String squirrel = faker.superhero().name() ; //"Белая горячка к нам пришла",
    String phone = String.valueOf(faker.number().randomNumber(7, true)); //"333 33 33",
    String inn = String.valueOf(faker.number().randomNumber(12, true)); //"123456789012",
    String gender = faker.demographic().sex() ;// "m",
    String birthday = faker.date().birthday(18,75).toString(); //"01.01.1995",
    String date_start = faker.date().birthday(19,74).toString() ; //"11.11.2000"
}
