package ru.avalon.java.j20.labs.tasks;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import ru.avalon.java.j20.labs.Task;

/**
 * Задание №4
 *
 * <p>Тема: "Потоковый ввод-вывод. Чтение файлов конфигурации".
 */
public class Task4 implements Task {
    private String PATH_TO_PROPERTIES;

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() throws IOException {
        Properties properties = read("resources/database");}

        /*
         * TODO(Студент): Выполнить задание №4
         *
         * 1. Реализовать метод read.
         *
         * 2. С использованием отладчика проверить корректность работы программы.
         */
    

    /**
     * Выполняет чтение файла конфигураций описанного
     * параметром {@code path}.
     *
     * @param path путь к конфигурации
     * @return новый экземпляр типа {@link Properties}
     */
    private Properties read(String path) {
        throw new UnsupportedOperationException("Not implement yet!");}
             
                      
FileInputStream fileInputStream;
     Properties properties = new Properties(); {
 
       
        try {
            fileInputStream = new FileInputStream(PATH_TO_PROPERTIES);
            properties.load(fileInputStream);
        } catch (IOException ex) {
            Logger.getLogger(Task4.class.getName()).log(Level.SEVERE, null, ex);
        }
           
             
}
}
       