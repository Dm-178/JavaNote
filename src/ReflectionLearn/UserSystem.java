package ReflectionLearn;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class UserSystem {
    public static void main(String[] args) {
        File configFile = new File("src/ReflectionLearn/userType");
        Properties configPro = new Properties();
        try {
            configPro.load(new FileInputStream(configFile));
            String userType = (String)configPro.get("UserType");
            String userMethod = (String)configPro.get("UserMethod");

            Class<?> cUserType = Class.forName(userType);
            Method mUserMethod = cUserType.getMethod(userMethod);
            Constructor<?> conUser = cUserType.getConstructor();

            Object objUser = conUser.newInstance();
            mUserMethod.invoke(objUser);

        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | IOException | ClassNotFoundException | NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
