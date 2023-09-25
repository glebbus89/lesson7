package observer;

public class Program {

    public static void main(String[] args) {

        JobAgency jobAgency = new JobAgency();
        Company google = new Company("Google", jobAgency);
        Company yandex = new Company("Yandex", jobAgency);
        Company geekBrains = new Company("GeekBrains", jobAgency);


        Vacancy courier = new Vacancy(VacancyType.Курьер, 6000);
        Vacancy cleaner = new Vacancy(VacancyType.Уборщик, 11000);
        Vacancy programmer = new Vacancy(VacancyType.Программист, 95000);

        Master ivanov = new Master("Ivanov", VacancyType.Программист, 90000);
        Master petrov = new Master("Petrov", VacancyType.Программист, 100000);
        Student sidorov = new Student("Sidorov", 3500);
        Manager suvorov = new Manager("Suvorov", VacancyType.Уборщик, 10000);;

        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(sidorov);
        jobAgency.registerObserver(suvorov);


        google.needEmployee(programmer);
        yandex.needEmployee(cleaner);
        geekBrains.needEmployee(courier);

    }
}
