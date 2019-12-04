package ru.avalon.java.j20.labs.tasks;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import ru.avalon.java.j20.labs.Task;
import ru.avalon.java.j20.labs.models.Country;

/**
 * Задание №6
 *
 * <p>Тема: "Потоковый ввод-вывод. Получение объекта на
 * основании прочитанных данных".
 */
public class Task6 implements Task {

    /**
     * {@inheritDoc}
     * @throws java.io.IOException
     */
    @Override
    public void run() throws IOException {
        File input = new File("assets/countries.txt");
        try {
            Collection<Country> countries = read(input);
            
            /*
            * TODO(Студент): Выполнить задание №6
            *
            * 1. Реализовать метод read.
            *
            * 2. При реализации следует пользоваться классами:
            *    BufferedReader и Country.
            *
            * 3. С использованием отладчика проверить корректность работы программы.
            */
        } catch (ParseException ex) {
            Logger.getLogger(Task6.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Выполняет чтение коллекции объектов типа {@link Country}
     * из указанного файла.
     *
     * <p>Выполняет чтение файла построчно. Преобразование
     * из текста в объект выполняется с использованием
     * метода {@code valueOf} класса {@link Country}.
     *
     * @param file файл
     * @return коллекция объектов типа {@link Country}
     * @throws IOException в случае ошибки ввода-вывода.
     */
    private Collection<Country> read(File file) throws IOException, ParseException {
        
        Collection<Country> listCountry=new ArrayList<>();
        try(BufferedReader bufferedreader=new BufferedReader(new FileReader(file))){
            if (file==null) throw new UnsupportedOperationException("Not implement yet!");
        String s;
        while((s=bufferedreader.readLine())!=null)
        { listCountry.add(Country.valueOf(s));
        }
        }
        return listCountry;
        }
}

