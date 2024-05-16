package classwork29;

public class OuterClass {
    private static String staticField = "Статическое поле";
    private String field = "Нестатическое поле";
    private StaticNestedClass staticNestedClassObject;
    private static InnerClass InnarClassObject;


    // статический вложенный класс
    static class StaticNestedClass {
        private static String nestedStaticFiled = "Вложенное статическое поле";

        private String nestedField = "Вложенное поле";



        void display() {
            // обращение к статическому полю внешнего клласса
            System.out.println(staticField);

            // обращение к нестатическому полю внешнего класса
            // System.out.println(field); ошибка, так как нельзя
            // Обращение к полям самого StaticNestedClass происходит обычным образом
            System.out.println(nestedStaticFiled);
            System.out.println(nestedField);

            // вывести статическое поле внутреннего класса ---> ДОПУСТИМО в последних версиях джавы
            // System.out.println(OuterClass.InnerClass.innerStaticField);

            // вывести поле внутреннего класса ---> нереализуемо честным образом
            System.out.println(OuterClass.InnarClassObject.innerField);

        }
    }

    class InnerClass {
        private String innerField = "внутреннее поле";
        // нельзя создать статическое поле во внутреннем классе
        //  private static String innerStaticField = "Внутреннее статическое поле";

        void display() {
            // обращение к статическому полю внешнего клласса
            System.out.println(staticField);

            // обращение к нестатическому полю внешнего класса
            System.out.println(field);

            // обращение к нестатическому полю экземпляра класса InnerClass в полной форме
            System.out.println(this.innerField);

            // обращение к статическому полю внешнего клласса в полной форме
            System.out.println(OuterClass.staticField);

            // обращение к нестатическому полю экземляра внешнего класса в полной форме
            System.out.println(OuterClass.this.field);

            // вывести статическое поле вложенного статического класса
            System.out.println(OuterClass.StaticNestedClass.nestedStaticFiled);

            // вывести поле вложенного статического класса
            System.out.println(OuterClass.this.staticNestedClassObject.nestedField);


        }
    }
}
