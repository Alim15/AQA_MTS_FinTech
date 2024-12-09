Часть 1. Тема: ООП + основные конструкции: 

Построить иерархию животных в виде наследуемых классов.
Пример:
Наследники Predator и Pet могут отличаться, остальная иерархия должна соблюдаться.
● Интерфейс Animal имеет 4 метода
○ getBreed();
○ getName();
○ getCost();
○ getCharacter();
● Абстрактный класс AbstractAnimal имеет 5 полей:
○ protected String breed; // порода
○ protected String name; // имя
○ protected Double cost; // цена в магазине
○ protected String character; // характер
Создаем CreateAnimalService c default методом по созданию 10 уникальных животных при помощи метода while. В
CreateAnimalServiceImpl создать перегруженный метод, который создает N животных с помощью цикла for (где N - параметр,
передаваемый в метод). Помимо перегруженного метода сделать переопределенный метод, который использует цикл do-while.
Во всех трех методах сделать вывод на консоль результат создания нового животного (через System.out.println).
В классе Main вызвать все три метода.