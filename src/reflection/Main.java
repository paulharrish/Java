package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        Cat myCat = new Cat("tom", 10);
        Field[] catFields = myCat.getClass().getDeclaredFields();
        Method[] methods = myCat.getClass().getDeclaredMethods();

        for (Field field : catFields) {
            if (field.getName().equals("name")) {
                field.setAccessible(true);
                field.set(myCat, "changedName");
            }
        }

        // System.out.println(myCat.getName());

        for (Method method : methods) {
            if (method.getName().equals("privateMethod")) {
                method.setAccessible(true);
                method.invoke(myCat);
            } else if (method.getName().equals("publicAndStaticMethod")) {
                method.setAccessible(true);
                method.invoke(null);
            } else if (method.getName().equals("privateAndStaticMethod")) {
                method.setAccessible(true);
                method.invoke(null);
            }

            // System.out.println(method.getName());
        }

    }
}
