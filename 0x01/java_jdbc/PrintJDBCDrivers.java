

import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Enumeration;



public class PrintJDBCDrivers {
    public static void main(String[] args) {
        System.out.println("Nome e versão do drive encontrados*");

        Driver driver;
        for (Enumeration<Driver> e = DriverManager.getDrivers(); e.hasMoreElements(); ) {
            driver = e.nextElement();
            print(driver);
        }
    }

        public static void print(Driver driver) {
            String className = driver.getClass().getName();
            int majorVersion = driver.getMajorVersion();
            int minorVersion = driver.getMinorVersion();
            System.out.println("----------------------------------------");
            System.out.println("Name Driver: " + className);
            System.out.println("Driver Major Version: " + majorVersion);
            System.out.println("Driver Minor Version: " + minorVersion);
            System.out.println("----------------------------------------");
        }
    }
