import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws Exception {
        Class humanClass = Human.class;
      /*  Field publicFieldsOfHuman[] = humanClass.getFields();

        for (int i = 0; i < publicFieldsOfHuman.length; i++) {
            System.out.println(publicFieldsOfHuman[i]);
        }

        Field allHumanFields[] = humanClass.getDeclaredFields();

        for (int i = 0; i < allHumanFields.length; i++) {
            System.out.println(allHumanFields[i]);
        }

        // получить экземпляр класса
   //   Human human = (Human) humanClass.newInstance();


        Field ageField = humanClass.getDeclaredField("age");

        Human marsel = new Human(23, "Marsel", 1666);
        ageField.setAccessible(true);
        ageField.set(marsel, -100);
        System.out.println(marsel.getAge());*/

        Method publicMethodsOfHuman[] = humanClass.getMethods();
        for (int i = 0; i < publicMethodsOfHuman.length; i++) {
            System.out.println(publicMethodsOfHuman[i]+" RETURNS "+publicMethodsOfHuman[i].getReturnType());
            Class paramTypes[] = publicMethodsOfHuman[i].getParameterTypes();
            System.out.print("" + "Типы параметров (если есть параметры): ");
            for (Class paramType : paramTypes) {
                System.out.print(" " + paramType.getName());
            }
            System.out.println("");
            System.out.println("");
        }
/*
        Method increaseCount = humanClass.getMethod ("increaseCount");

        Class[] paramTypes = new Class[] { int.class };
        Method method = humanClass.getMethod("increaseCount", paramTypes);
        Object[] ar = new Object[] { new Integer(10) };
        int d = (int) method.invoke(obj, args);
*/

    }
}